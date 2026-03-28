package com.Eli.lets_do_it.repository;


import com.Eli.lets_do_it.model.Task;

import java.util.List;

public interface CategoryRepositoryCustom {
    List<Task> getAllTask();
    Task getTaskById();
}
