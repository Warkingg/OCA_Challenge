package com.example.quizzapp.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class QuizAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Enter content")
    private String content;

    private String correct; //Change from boolean to String

    @ManyToOne
    private Quiz quiz;

    @ManyToOne
    private QuizQuestion quizQuestion;

}
