package com.Eli.lets_do_it.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

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

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}

    public String getTitle(){return title;}
    public void setTitle(String title){this.title=title;}

    public boolean isCompleted(){return completed;}
    public void setCompleted(boolean completed){this.completed=completed;}
  
    public boolean isDuplicate(){return duplicate;}
    public void setDuplicate(boolean duplicate){this.duplicate=duplicate;}

}
