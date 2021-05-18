package com.example.quizzapp.repository.quiz;

import com.example.quizzapp.model.TakeQuiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TakeQuizRepository extends JpaRepository<TakeQuiz,Long> {
}
