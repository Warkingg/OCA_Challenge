package com.example.quizzapp.services.quizquestion;

import com.example.quizzapp.model.QuizQuestion;
import com.example.quizzapp.repository.quiz.QuizQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class QuizQuestionService implements IQuizQuestionService {
    @Autowired
    private QuizQuestionRepository quizQuestionRepository;

    @Override
    public Page<QuizQuestion> findAll(Pageable pageable) {
        return quizQuestionRepository.findAll(pageable);
    }

    @Override
    public Optional<QuizQuestion> findById(Long id) {
        return quizQuestionRepository.findById(id);
    }

    @Override
    public QuizQuestion save(QuizQuestion quizQuestion) {
        return quizQuestionRepository.save(quizQuestion);
    }

    @Override
    public void remove(Long id) {
        quizQuestionRepository.deleteById(id);
    }
}
