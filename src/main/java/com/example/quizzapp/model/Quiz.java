package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    private Time startTime;

    private Time endTime;

    private Integer score;

    @ManyToOne
    private User user;
}
