package com.Eli.lets_do_it.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    private String title;
    private boolean completed;
    private boolean duplicate;
    private byte priority;
    private LocalDateTime dueDate;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}