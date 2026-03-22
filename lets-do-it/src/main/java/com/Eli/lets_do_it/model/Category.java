package com.Eli.lets_do_it.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@Entity
@Table(name="categories")
public class Category {

    public Category(){}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer category_id;
    private Integer user_id;
    private  String name;
    private LocalDateTime created_at;
}
