package com.example.quizzapp.services.quizcategory;

import com.example.quizzapp.model.QuizCategory;
import com.example.quizzapp.repository.quiz.QuizCategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuizCategoryService implements IQuizCategoryService {
    @Autowired
    private QuizCategoryRepository quizCategoryRepository;

    @Override
    public Page<QuizCategory> findAll(Pageable pageable) {
        return quizCategoryRepository.findAll(pageable);
    }

    @Override
    public Optional<QuizCategory> findById(Long id) {
        return quizCategoryRepository.findById(id);
    }

    @Override
    public QuizCategory save(QuizCategory quizCategory) {
        return quizCategoryRepository.save(quizCategory);
    }

    @Override
    public void remove(Long id) {
        quizCategoryRepository.deleteById(id);
    }
}
