package my.own.todoapp.controller;

import lombok.RequiredArgsConstructor;
import my.own.todoapp.model.TaskResponse;
import my.own.todoapp.service.impl.TaskServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Map;

@RestController
@RequestMapping("/task/")
@RequiredArgsConstructor
public class TaskController {
    private final TaskServiceImpl taskService;

    @GetMapping("getAll")
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
}
