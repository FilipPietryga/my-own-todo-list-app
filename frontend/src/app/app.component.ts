import { Component } from '@angular/core';
import { Task } from './model/task';
import { TaskService } from './service/task.service';
import { Observable } from 'rxjs';
import { TaskResponse } from './model/taskResponse';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.sass']
})
export class AppComponent {
  tasks?: Observable<TaskResponse>

  constructor(private taskService: TaskService) {}

  ngOnInit(): void {
    this.tasks = this.taskService.all.
    pipe(
      map(response => {
        return {data}
      })
    );

  }
}
