package com.mini.TaskManager.service;

import com.mini.TaskManager.exception.TaskNotFoundException;
import com.mini.TaskManager.model.Task;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskService {
    private List<Task> taskList = new ArrayList<>();
    private Long nextId = 1L;

    public Task addTask(Task task) {
        task.setId(nextId++);
        taskList.add(task);
        return task;
    }

    public Task updateTask(Long id,Task task) {
          for (int i = 0; i < taskList.size(); i++) {
              if(taskList.get(i).getId().equals(id)){
                  task.setId(id);
                  taskList.set(i, task);
                  return taskList.get(i);
              }
          }
        throw new TaskNotFoundException("Task with ID "+id+" not found");
    }

    public Task getTaskById(Long id) {
        for(Task task : taskList){
            if(task.getId().equals(id)){
                return task;
            }
        }
        throw new TaskNotFoundException("Task with ID "+id+" not found");
    }
    public List<Task> getTaskList() {
        return new ArrayList<>(taskList);
    }

    public void deleteTaskById(Long id) {
        for (int i = 0; i < taskList.size(); i++) {
            if(taskList.get(i).getId().equals(id)){
                taskList.remove(i);
                return ;
            }
        }
        throw new TaskNotFoundException("Task with ID "+id+" not found");
    }

}
