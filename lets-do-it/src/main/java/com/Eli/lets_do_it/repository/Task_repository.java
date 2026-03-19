package com.Eli.lets_do_it.repository;

import com.Eli.lets_do_it.model.Task_model;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Task_repository extends JpaRepository<Task_model, Long> {
}
