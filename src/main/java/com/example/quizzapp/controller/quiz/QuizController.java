package com.example.quizzapp.controller.quiz;

import com.example.quizzapp.model.Quiz;
import com.example.quizzapp.services.quiz.IQuizService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping("/quizzes")
public class QuizController {
    @Autowired
    private IQuizService quizService;

    @GetMapping
    public ResponseEntity<Iterable<Quiz>> getAll(Pageable pageable){
        return new ResponseEntity<>(quizService.findAll(pageable), HttpStatus.OK);
    }
    @GetMapping("/{id}")
    public ResponseEntity<Quiz> getById(@PathVariable Long id){
        Optional<Quiz> quizOptional = quizService.findById(id);
        if(quizOptional.isPresent()){
            return new ResponseEntity<>(quizOptional.get(),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
    @PostMapping
    public ResponseEntity<Quiz> save(@RequestBody Quiz quiz){
        return new ResponseEntity<>(quizService.save(quiz),HttpStatus.CREATED);
    }
    @PutMapping("/id")
    public ResponseEntity<Quiz> updateQuiz(@PathVariable Long id,@RequestBody Quiz quiz){
        Optional<Quiz> quizOptional = quizService.findById(id);
        if(quizOptional.isPresent()){
            quiz.setId(quizOptional.get().getId());
            return new ResponseEntity<>(quizService.save(quiz),HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @DeleteMapping("/id")
    public ResponseEntity<Quiz> deleteQuiz(@PathVariable Long id,@RequestBody Quiz quiz){
        Optional<Quiz> quizOptional = quizService.findById(id);
        if(quizOptional.isPresent()){
            quizService.remove(id);
            return new ResponseEntity<>(quizOptional.get(),HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}

