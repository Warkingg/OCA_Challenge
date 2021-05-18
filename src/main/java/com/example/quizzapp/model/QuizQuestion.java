package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class QuizQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String content;

    private Integer score;

    private String type;

    @ManyToOne
    private Quiz quiz;

}
