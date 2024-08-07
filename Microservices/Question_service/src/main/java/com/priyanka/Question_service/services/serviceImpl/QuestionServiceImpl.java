package com.priyanka.Question_service.services.serviceImpl;

import com.priyanka.Question_service.entity.QuestionClass;
import com.priyanka.Question_service.payload.QuestionWrapper;
import com.priyanka.Question_service.payload.Response;
import com.priyanka.Question_service.repository.QuestionRepository;
import com.priyanka.Question_service.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class QuestionServiceImpl implements QuestionService {

    private QuestionRepository questionRepository;


    @Autowired
    public void QuestionService(QuestionRepository questionRepository) {

        this.questionRepository = questionRepository;
    }

    @Override
    public ResponseEntity<QuestionClass> createQuestion(QuestionClass question) {
        return new ResponseEntity<>(questionRepository.save(question),HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<QuestionClass>> getAllQuestion() {
        try {
            return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.OK);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return new ResponseEntity<>(questionRepository.findAll(), HttpStatus.BAD_REQUEST);

    }

    @Override
    public ResponseEntity<List<QuestionClass>>getQuestionsByCategory(String category) {
        try {
            return new ResponseEntity<>(questionRepository.findByCategory(category),HttpStatus.OK);
        }
        catch (Exception e){
            return new ResponseEntity<>(questionRepository.findByCategory(category),HttpStatus.BAD_REQUEST);
        }

    }

    @Override
    public ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions) {
        List<Integer> questionClass=questionRepository.findRandomQuestionsByCategory(categoryName,numQuestions);

        return new ResponseEntity<>(questionClass,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds) {
        List<QuestionWrapper> wrappers=new ArrayList<>();
        List<QuestionClass>questionClasses=new ArrayList<>();

        for(Integer id:questionIds){
            questionClasses.add(questionRepository.findById(id).get());
        }
        for(QuestionClass questionClass:questionClasses){
            QuestionWrapper questionWrapper=new QuestionWrapper();
            questionWrapper.setId(questionClass.getId());
            questionWrapper.setQuestion(questionClass.getQuestion());
            questionWrapper.setOption1(questionClass.getOption1());
            questionWrapper.setOption2(questionClass.getOption2());
            questionWrapper.setOption3(questionClass.getOption3());
            questionWrapper.setOption4(questionClass.getOption4());
            wrappers.add(questionWrapper);

        }
        return new ResponseEntity<>(wrappers,HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Integer>> getScore(List<Response> responses) {
        int right = 0;
        for (Response response : responses) {
            Optional<QuestionClass> questionClassOpt = questionRepository.findById(response.getId());

            if (questionClassOpt.isPresent()) {
                QuestionClass questionClass = questionClassOpt.get();

                if (response.getResponses().equals(questionClass.getAnswer())) {
                    right++;
                }
            }
        }
        List<Integer> scores = Collections.singletonList(right);
        return new ResponseEntity<>(scores, HttpStatus.OK);
    }

}
