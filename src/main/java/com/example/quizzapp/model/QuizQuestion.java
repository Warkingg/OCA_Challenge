package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Enter question content")
    private String content;

    @NotNull(message = "Enter question score")
    private Integer score;

    @NotNull(message = "Enter question type")
    private String type;

    private Integer level; //Add level attribute

    @ManyToOne
    private Quiz quiz;


}
