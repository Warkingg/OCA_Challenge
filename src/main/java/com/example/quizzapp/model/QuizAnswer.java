package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class QuizAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private boolean correct;

    @ManyToOne
    private Quiz quiz;

    @ManyToOne
    private QuizQuestion quizQuestion;

}
