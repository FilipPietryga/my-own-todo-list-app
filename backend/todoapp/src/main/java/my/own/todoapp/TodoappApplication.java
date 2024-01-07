package my.own.todoapp;

import my.own.todoapp.model.Task;
import my.own.todoapp.model.TaskResponse;
import my.own.todoapp.repo.TaskRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoappApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoappApplication.class, args);
	}

	CommandLineRunner run(TaskRepository taskRepository) {
		return args -> {
			taskRepository.save(new Task(null, "clean the room", "use brush", "2000.11.11 17:15"));
			taskRepository.save(new Task(null, "clean the dorm", "use brush", "2000.11.12 17:15"));
			taskRepository.save(new Task(null, "clean the hall", "use brush", "2000.11.13 17:15"));
			taskRepository.save(new Task(null, "clean the staircase", "use brush", "2000.11.14 17:15"));
		};
	}
}
