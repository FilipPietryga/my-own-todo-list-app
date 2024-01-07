package my.own.todoapp.service;

import my.own.todoapp.model.Task;

import java.util.Collection;

public interface TaskService {
    Task post(Task task);
    Task update(Task task);
    Boolean delete(Long id);
    Task get(Long id);
    Collection<Task> getAll();
    Collection<Task> getN(int limit);
}
