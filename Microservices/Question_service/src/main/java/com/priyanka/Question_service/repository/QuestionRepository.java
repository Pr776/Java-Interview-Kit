package com.priyanka.Question_service.repository;

import com.priyanka.Question_service.entity.QuestionClass;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface QuestionRepository extends JpaRepository<QuestionClass,Integer>{

    List<QuestionClass> findByCategory(String category);

    @Query(value = "SELECT q.id FROM question_class q WHERE q.category = :category ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
    List<Integer> findRandomQuestionsByCategory(@Param("category") String category,@Param("numQ") int numQ);

}
