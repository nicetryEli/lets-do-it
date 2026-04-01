package com.Eli.lets_do_it.repository;

import com.Eli.lets_do_it.model.Category;
import com.Eli.lets_do_it.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Integer> {
    List<Task> findByCategory(Category category);
}
