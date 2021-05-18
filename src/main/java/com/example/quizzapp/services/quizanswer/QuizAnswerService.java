package com.example.quizzapp.services.quizanswer;

import com.example.quizzapp.model.QuizAnswer;
import com.example.quizzapp.repository.quiz.QuizAnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class QuizAnswerService implements IQuizAnswerService {
    @Autowired
    private QuizAnswerRepository quizAnswerRepository;

    @Override
    public Page<QuizAnswer> findAll(Pageable pageable) {
        return quizAnswerRepository.findAll(pageable);
    }

    @Override
    public Optional<QuizAnswer> findById(Long id) {
        return quizAnswerRepository.findById(id);
    }

    @Override
    public QuizAnswer save(QuizAnswer quizAnswer) {
        return quizAnswerRepository.save(quizAnswer);
    }

    @Override
    public void remove(Long id) {
        quizAnswerRepository.deleteById(id);
    }
}
