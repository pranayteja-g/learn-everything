package com.example.dao;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.model.Question;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

	// Find all questions by category
	List<Question> findByCategory(String category);

	// Find random questions by category, with pagination
	@Query(value = "SELECT q.id FROM Question q WHERE q.category = :category ORDER BY RAND()", nativeQuery = true)
	List<Integer> findRandomQuestionsByCategory(@Param("category") String category, Pageable pageable);
}
