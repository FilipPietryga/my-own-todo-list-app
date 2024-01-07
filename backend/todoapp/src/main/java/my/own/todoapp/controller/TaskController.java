package my.own.todoapp.controller;

import lombok.RequiredArgsConstructor;
import my.own.todoapp.model.Task;
import my.own.todoapp.model.TaskResponse;
import my.own.todoapp.service.impl.TaskServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/task")
@RequiredArgsConstructor
public class TaskController {
    private final TaskServiceImpl taskService;

    @GetMapping("/getAll")
    public ResponseEntity<TaskResponse> getTasks() {
        return ResponseEntity.ok(
                TaskResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("tasks", taskService.getAll()))
                        .message("Tasks retrieved")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @GetMapping("/{id}")
    public ResponseEntity<TaskResponse> getTask(@PathVariable("id") Long id) {
        return ResponseEntity.ok(
                TaskResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("task", taskService.get(id)))
                        .message("Task retrieved")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<TaskResponse> deleteTask(@PathVariable("id") Long id) {
        return ResponseEntity.ok(
                TaskResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("deletion status", taskService.delete(id)))
                        .message("Task deleted")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PostMapping("/{id}")
    public ResponseEntity<TaskResponse> postTask(@RequestParam("task") Task task) {
        return ResponseEntity.ok(
                TaskResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("task", taskService.post(task)))
                        .message("Task posted")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @PutMapping("/{id}")
    public ResponseEntity<TaskResponse> putTask(@RequestParam("task") Task task) {
        return ResponseEntity.ok(
                TaskResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("task", taskService.update(task)))
                        .message("Task updated")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }

    @GetMapping("/{limit}")
    public ResponseEntity<TaskResponse> getTask(@PathVariable int limit) {
        return ResponseEntity.ok(
                TaskResponse.builder()
                        .timeStamp(LocalDateTime.now())
                        .data(Map.of("tasks", taskService.getN(limit)))
                        .message("n of tasks read")
                        .status(HttpStatus.OK)
                        .statusCode(HttpStatus.OK.value())
                        .build()
        );
    }
}
