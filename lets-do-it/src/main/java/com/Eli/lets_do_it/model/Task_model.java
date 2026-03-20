package com.Eli.lets_do_it.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;

@Getter
@Entity
@Table(name = "tasks")
public class Task_model {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)

    private Long id;
    private String title;
    private boolean completed;
    private boolean duplicate;

    public Task_model(){};

    public void setId(Long id){this.id=id;}

    public void setTitle(String title){this.title=title;}

    public void setCompleted(boolean completed){this.completed=completed;}

    public void setDuplicate(boolean duplicate){this.duplicate=duplicate;}

}
