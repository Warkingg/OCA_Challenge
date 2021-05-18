package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
public class QuizAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Enter content")
    private String content;

    private boolean correct;

    @ManyToOne
    private Quiz quiz;

    @ManyToOne
    private QuizQuestion quizQuestion;

}
