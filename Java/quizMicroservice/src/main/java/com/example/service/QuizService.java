package com.example.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.dao.QuizDao;
import com.example.feign.QuizInterface;
import com.example.model.QuestionWrapper;
import com.example.model.Quiz;
import com.example.model.Response;

@Service
public class QuizService {

	@Autowired
	QuizDao quizDao;

	@Autowired
	QuizInterface quizInterface;

	public ResponseEntity<String> createQuiz(String category, int numQ, String title) {

		// call the generate URL --> RestTemplate (generally)

		List<Integer> questions = quizInterface.generateQuestionsForQuiz(category, numQ).getBody();
		Quiz quiz = new Quiz();
		quiz.setTitle(title);
		quiz.setQuestionIds(questions);

		quizDao.save(quiz);

		return new ResponseEntity<>("success!", HttpStatus.OK);
	}

	public ResponseEntity<List<QuestionWrapper>> getQuizQuestions(int id) {

		Quiz quiz = quizDao.findById(id).get();
		List<Integer> questionIds = quiz.getQuestionIds();
		ResponseEntity<List<QuestionWrapper>> questions = quizInterface.getQuestionsFromId(questionIds);

		return questions;
	}

	public ResponseEntity<Integer> calculateResult(Integer id, List<Response> responses) {
		ResponseEntity<Integer> score = quizInterface.getScore(responses);
		return score;
	}

}
