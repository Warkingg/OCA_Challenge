package com.example.quizzapp.controller.quiz;

import com.example.quizzapp.model.QuizCategory;
import com.example.quizzapp.services.quizcategory.QuizCategoryService;
import jdk.jfr.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class QuizCategoryController {
    @Autowired
    private QuizCategoryService quizCategoryService;

    @GetMapping("/list")
    //Pass request parameter like this -> http://localhost:8080/category/list?page=4&size=2  -return-> "Page request [number: 4, size 2, sort: UNSORTED]"
    public ResponseEntity<Page<QuizCategory>> getAllCategory(Pageable pageable) {
        Page<QuizCategory> quizCategories = quizCategoryService.findAll(pageable);
        return new ResponseEntity<>(quizCategories, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<QuizCategory> getQuizCategoryById(@PathVariable("id") Long id) {
        Optional<QuizCategory> quizCategory = quizCategoryService.findById(id);
        return new ResponseEntity<>(quizCategory.get(), HttpStatus.OK);

    }

    @PostMapping("/create")
    public ResponseEntity<QuizCategory> createQuizCategory(@RequestBody QuizCategory quizCategory) {
        QuizCategory quizCategory1 = quizCategoryService.save(quizCategory);
        return new ResponseEntity<>(quizCategory1, HttpStatus.CREATED);

    }

    @PutMapping("/update")
    public ResponseEntity<QuizCategory> updateQuizCategory(@RequestBody QuizCategory quizCategory) {
        QuizCategory quizCategory1 = quizCategoryService.save(quizCategory);
        return new ResponseEntity<>(quizCategory1, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteQuizCategory(@PathVariable("id") Long id) {
        quizCategoryService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
