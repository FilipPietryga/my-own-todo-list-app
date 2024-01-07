package my.own.todoapp.service.impl;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import my.own.todoapp.model.Task;
import my.own.todoapp.repo.TaskRepository;
import my.own.todoapp.service.TaskService;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Collection;

@RequiredArgsConstructor
@Service
@Transactional
@Slf4j
public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository;
    @Override
    public Task post(Task task) {
        log.info("Task of {} have been added to the repository", task);
        taskRepository.save(task);
        return task;
    }

    @Override
    public Task update(Task task) {
        log.info("Task of {} have been updated on the repository", task);
        taskRepository.deleteById(task.getId());
        taskRepository.save(task);
        return task;
    }

    @Override
    public Boolean delete(Long id) {
        log.info("Task of id={} have been removed from the repository", id);
        taskRepository.deleteById(id);
        return true;
    }

    @Override
    public Task get(Long id) {
        log.info("Task of id={} have been loaded from the repository", id);
        return taskRepository.getById(id);
    }

    @Override
    public Collection<Task> getAll() {
        log.info("Tasks have been loaded from the repository");
        return taskRepository.findAll();
    }

    @Override
    public Collection<Task> getN(int limit) {
        log.info("Tasks with limit={} have been loaded from the repository", limit);
        return (Collection<Task>) taskRepository.findAll(PageRequest.of(0, limit));
    }
}
