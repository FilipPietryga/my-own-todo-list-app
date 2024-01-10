import { Task } from "./task";

export interface TaskResponse {
  timeStamp: Date;
  statusCode: number;
  status: string;
  reason: string;
  message: string;
  data: { tasks?: Task[], task?: Task };
}
