package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Data
public class TakeQuiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private Integer score;

    private String content;

    private Time startTime;

    private Time finishedTime;

    @ManyToOne
    private User user;

    @ManyToOne
    private Quiz quiz;
}
