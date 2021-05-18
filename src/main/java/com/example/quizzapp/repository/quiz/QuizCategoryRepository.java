package com.example.quizzapp.repository.quiz;

import com.example.quizzapp.model.QuizCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuizCategoryRepository extends JpaRepository<QuizCategory,Long>{
}
