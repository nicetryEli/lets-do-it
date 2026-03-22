package com.Eli.lets_do_it.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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

    private Integer task_id;
    private Integer user_id;
    private Integer category_id;
    private String title;
    private boolean completed;
    private boolean duplicate;
    private byte priority;
    private LocalDateTime dueDate;
}