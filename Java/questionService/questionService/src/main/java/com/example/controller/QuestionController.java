package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.model.Question;
import com.example.model.QuestionWrapper;
import com.example.model.Response;
import com.example.service.QuestionService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("question")
public class QuestionController {

	@Autowired
	QuestionService questionService;

	@Autowired
	Environment environment;

	@GetMapping("allQuestions")
	public ResponseEntity<List<Question>> getAllQuestions() {
		return questionService.getAllQuestions();
	}

	@GetMapping("category/{category}")
	public ResponseEntity<List<Question>> getQuestionsByCategory(@PathVariable String category) {
		return questionService.getQuestionsByCategory(category);
	}

	@PostMapping("add")
	public ResponseEntity<String> addQuestion(@RequestBody Question question) {
		return questionService.addQuestion(question);
	}

	@DeleteMapping("delete/{id}")
	public String deleteQuestion(@PathVariable int id) {
		try {
			questionService.deleteQuestion(id);
		} catch (Exception e) {
			System.out.println(e);
		}

		return "deleted successfully";
	}

	// create
	@GetMapping("generate")
	public ResponseEntity<List<Integer>> generateQuestionsForQuiz(@RequestParam String categoryName,
			@RequestParam Integer numQuestions) {

		return questionService.generateQuestionsForQuiz(categoryName, numQuestions);
	}

	// getQuestions (question id)
	@PostMapping("getQuestions")
	public ResponseEntity<List<QuestionWrapper>> getQuestionsFromId(@RequestBody List<Integer> questionId) {

		System.out.println(environment.getProperty("local.server.port"));
		return questionService.getQuestionFromId(questionId);
	}

	@PostMapping("getScore")
	public ResponseEntity<Integer> getScore(@RequestBody List<Response> responses) {
		return questionService.getScore(responses);
	}

}
