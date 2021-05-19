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

    private Integer quantity;

    private Time startTime;

    private Time endTime;

    private Integer score;

    private String level; //Add level attribute

    @ManyToOne
    private User user;
}
