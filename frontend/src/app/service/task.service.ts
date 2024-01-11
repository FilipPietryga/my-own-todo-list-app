import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, catchError, tap, throwError } from 'rxjs';
import { TaskResponse } from '../model/taskResponse';
import { Task } from '../model/task';

@Injectable({
  providedIn: 'root'
})
export class TaskService {
  private readonly url = "http://localhost:8080"

  constructor(private http: HttpClient) { }

  all = <Observable<TaskResponse>>
  this.http.get<TaskResponse>(`${this.url}/tasks/all`)
  .pipe(
    tap(console.log),
    catchError(this.handleError)
  )

  task = (id: number) => <Observable<TaskResponse>>
  this.http.get<TaskResponse>(`${this.url}/tasks/${id}`)
  .pipe(
    tap(console.log),
    catchError(this.handleError)
  )

  save = (task: Task) => <Observable<TaskResponse>>
  this.http.post<TaskResponse>(`${this.url}/tasks/`, task)
  .pipe(
    tap(console.log),
    catchError(this.handleError)
  )

  delete = (id: number) => <Observable<TaskResponse>>
  this.http.delete<TaskResponse>(`${this.url}/tasks/${id}`)
  .pipe(
    tap(console.log),
    catchError(this.handleError)
  )

  update = (task: Task) => <Observable<TaskResponse>>
  this.http.put<TaskResponse>(`${this.url}/tasks/`, task)
  .pipe(
    tap(console.log),
    catchError(this.handleError)
  )

  some = (limit: number) => <Observable<TaskResponse>>
  this.http.get<TaskResponse>(`${this.url}/tasks/some/${limit}`)
  .pipe(
    tap(console.log),
    catchError(this.handleError)
  )

  handleError(handleError: any): Observable<never> {
    return throwError('Method not implemented.');
  }
}
