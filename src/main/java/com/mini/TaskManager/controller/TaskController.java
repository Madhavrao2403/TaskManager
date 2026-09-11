package com.mini.TaskManager.controller;


import com.mini.TaskManager.model.Task;
import com.mini.TaskManager.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping(value="/tasks")
public class TaskController {
    private final TaskService taskService;

    TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @PostMapping
    public ResponseEntity<Task> createTask(@RequestBody Task task) {
        Task createdTask = taskService.addTask(task);
        URI location = URI.create("/tasks/"+createdTask.getId());
         return ResponseEntity.created(location).body(createdTask);
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Task> updateTask(@PathVariable Long id, @RequestBody Task task) {
         return ResponseEntity.ok(taskService.updateTask(id, task));
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Task> getTaskById(@PathVariable Long id) {
      return ResponseEntity.ok(taskService.getTaskById(id));
    }

    @GetMapping
    public ResponseEntity<List<Task>> getTasks() {
        return ResponseEntity.ok(taskService.getTaskList());
    }

    @DeleteMapping(value="/{id}")
    public ResponseEntity<Void> deleteTask(@PathVariable Long id) {
       taskService.deleteTaskById(id);
       return ResponseEntity.noContent().build();
    }


}
