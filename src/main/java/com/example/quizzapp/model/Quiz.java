package com.example.quizzapp.model;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;

@Entity
@Data
public class Quiz {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Enter title")
    private String title;

    @NotNull(message = "Enter content")
    private String content;

    @NotNull(message = "Enter start time")
    private Time startTime;

    @NotNull(message = "Enter end time")
    private Time endTime;

    @NotNull(message = "Enter score")
    private Integer score;

    @ManyToOne
    private User user;
}
