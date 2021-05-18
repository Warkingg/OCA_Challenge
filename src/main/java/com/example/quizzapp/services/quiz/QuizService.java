package com.example.quizzapp.services.quiz;

import com.example.quizzapp.model.Quiz;
import com.example.quizzapp.repository.quiz.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class QuizService implements IQuizService {
    @Autowired
    private QuizRepository quizRepository;

    @Override
    public Page<Quiz> findAll(Pageable pageable) {
        return quizRepository.findAll(pageable);
    }

    @Override
    public Optional<Quiz> findById(Long id) {
        return quizRepository.findById(id);
    }

    @Override
    public Quiz save(Quiz quiz) {
        return quizRepository.save(quiz);
    }

    @Override
    public void remove(Long id) {
        quizRepository.deleteById(id);
    }
}
