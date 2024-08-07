package com.priyanka.Question_service.controller;
import com.priyanka.Question_service.entity.QuestionClass;
import com.priyanka.Question_service.payload.QuestionWrapper;
import com.priyanka.Question_service.payload.Response;
import com.priyanka.Question_service.services.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/question")
public class QuestionController {

 @Autowired
    private QuestionService questionService;

    @PostMapping
    public ResponseEntity<QuestionClass> createQuestion(@RequestBody QuestionClass question) {
        return questionService.createQuestion(question);

    }
    @GetMapping
    public ResponseEntity<List<QuestionClass>> getAllQuestion(){
        return questionService.getAllQuestion();
    }
    @GetMapping("category/{category}")
    public ResponseEntity<List<QuestionClass>>getQuestionsByCategory(@PathVariable String category){
        return questionService.getQuestionsByCategory(category);
    }

    @GetMapping("generate")
    public ResponseEntity<List<Integer>>getQuestionsForQuiz(@RequestParam String categoryName,@RequestParam Integer numQuestions){
        return questionService.getQuestionsForQuiz(categoryName,numQuestions);
    }

    @PostMapping("getQuestions")
    public ResponseEntity<List<QuestionWrapper>>getQuestionsFromId(@RequestBody List<Integer> QuestionIds){
        return questionService.getQuestionsFromId(QuestionIds);
    }
    @PostMapping("getScore")
    public ResponseEntity<List<Integer>> getScore(@RequestBody List<Response>responses){
        return questionService.getScore(responses);
    }


}
