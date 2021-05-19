package com.example.quizzapp.controller.quiz;

import com.example.quizzapp.model.QuizQuestion;
import com.example.quizzapp.services.quizquestion.QuizQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/question")
public class QuizQuestionController {
    @Autowired
    private QuizQuestionService quizQuestionService;

    @GetMapping("/list")
    public ResponseEntity<Page<QuizQuestion>> getAllQuizQuestion(Pageable pageable){
        Page<QuizQuestion> quizQuestions = quizQuestionService.findAll(pageable);
        return new ResponseEntity<>(quizQuestions, HttpStatus.OK);
    }
    @GetMapping("/find/{id}")
    public ResponseEntity<QuizQuestion> getQuizQuestionById(@PathVariable("id") Long id){
        Optional<QuizQuestion> quizQuestion = quizQuestionService.findById(id);
        return new ResponseEntity<>(quizQuestion.get(),HttpStatus.OK);
    }
    @PostMapping("/create")
    public ResponseEntity<QuizQuestion> createQuizQuestion(@RequestBody QuizQuestion quizQuestion){
        QuizQuestion quizQuestion1 = quizQuestionService.save(quizQuestion);
        return new ResponseEntity<>(quizQuestion1,HttpStatus.CREATED);
    }
    @PutMapping("/update")
    public  ResponseEntity<QuizQuestion> updateQuizQuestion(@RequestBody QuizQuestion quizQuestion){
        QuizQuestion quizQuestion1 = quizQuestionService.save(quizQuestion);
        return new ResponseEntity<>(quizQuestion1,HttpStatus.OK);
    }
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<QuizQuestion> deleteQuizQuestion(@PathVariable("id") Long id ){
        quizQuestionService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
