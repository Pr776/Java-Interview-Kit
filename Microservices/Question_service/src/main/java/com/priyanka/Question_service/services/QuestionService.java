package com.priyanka.Question_service.services;

import com.priyanka.Question_service.entity.QuestionClass;
import com.priyanka.Question_service.payload.QuestionWrapper;
import com.priyanka.Question_service.payload.Response;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface QuestionService {
    ResponseEntity<QuestionClass>createQuestion(QuestionClass question);

    ResponseEntity<List<QuestionClass>>getAllQuestion();

    ResponseEntity<List<QuestionClass>>getQuestionsByCategory(String category);

    ResponseEntity<List<Integer>> getQuestionsForQuiz(String categoryName, Integer numQuestions);

    ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(List<Integer> questionIds);

    ResponseEntity<List<Integer>> getScore(List<Response> responses);
}
