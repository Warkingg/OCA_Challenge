package com.example.quizzapp.model;

import lombok.Data;
import org.hibernate.annotations.Fetch;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Data
public class QuizCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull(message = "Enter category name")
    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<QuizQuestion> quizQuestions;

}
