# Task Manager REST API

A simple **Task Manager REST API** built with **Java and Spring Boot** to practice RESTful API development and backend fundamentals.

## 🚀 Features

* Create a new task
* Get all tasks
* Get a task by ID
* Update an existing task
* Delete a task
* Automatic task ID generation
* Proper HTTP status codes
* Basic exception handling for tasks that don't exist

## 🛠️ Technologies Used

* Java
* Spring Boot
* Spring Web
* REST API
* Maven
* IntelliJ IDEA
* Git & GitHub

## 📁 Project Structure

```text
src
└── main
    └── java
        └── com.mini.TaskManager
            ├── controller
            │   └── TaskController.java
            ├── model
            │   └── Task.java
            ├── service
            │   └── TaskService.java
            └── exception
                └── TaskNotFoundException.java
```

## 🔗 API Endpoints

| Method | Endpoint      | Description       |
| ------ | ------------- | ----------------- |
| POST   | `/tasks`      | Create a new task |
| GET    | `/tasks`      | Get all tasks     |
| GET    | `/tasks/{id}` | Get task by ID    |
| PUT    | `/tasks/{id}` | Update task       |
| DELETE | `/tasks/{id}` | Delete task       |

## 📝 Example Task

### Create Task

**POST**

```text
/tasks
```

Request body:

```json
{
  "title": "Learn Spring Boot",
  "description": "Build a REST API using Spring Boot",
  "completed": false
}
```

Response:

```json
{
  "id": 1,
  "title": "Learn Spring Boot",
  "description": "Build a REST API using Spring Boot",
  "completed": false
}
```

## 📌 HTTP Status Codes

```text
201 Created
200 OK
204 No Content
404 Not Found
```

## 🧠 Concepts Practiced

This project was built as part of a **50-Day Java Mini Project Challenge**.

Key concepts practiced:

* Java OOP
* Spring Boot fundamentals
* REST API design
* Controllers and Services
* Dependency Injection
* Constructor Injection
* `@RestController`
* `@RequestMapping`
* `@GetMapping`
* `@PostMapping`
* `@PutMapping`
* `@DeleteMapping`
* `@RequestBody`
* `@PathVariable`
* `ResponseEntity`
* HTTP status codes
* Exception handling
* CRUD operations
* Git and GitHub workflow

## ▶️ Running the Project

### 1. Clone the repository

```bash
git clone https://github.com/Madhavrao2403/GithubProfileFinder.git
```

> Replace the repository URL above with your Task Manager repository URL.

### 2. Open the project

Open the project in IntelliJ IDEA or your preferred Java IDE.

### 3. Run the Spring Boot application

Run:

```text
TaskManagerApplication.java
```

The application will start on:

```text
http://localhost:8080
```

### 4. Test the API

You can test the endpoints using:

* Postman
* IntelliJ HTTP Client
* cURL

## 🔮 Future Improvements

Planned improvements for future versions:

* Add MySQL database
* Add Spring Data JPA
* Add input validation
* Add global exception handling
* Add task filtering and searching
* Add pagination
* Add authentication and authorization
* Add Swagger/OpenAPI documentation
* Add unit and integration tests

**Day 3/50 — Java + Spring Boot Mini Project Challenge 🚀**
