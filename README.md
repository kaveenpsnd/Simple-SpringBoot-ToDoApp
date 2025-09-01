# Spring Boot To-Do List REST API

This repository contains a complete RESTful API for a To-Do List application, built with Java and the Spring Boot framework. It provides full CRUD (Create, Read, Update, Delete) functionality for managing tasks.

This project is an excellent example of a well-structured, modern back-end service, demonstrating key principles like layered architecture, dependency injection, and data validation.

---

## Features

-   **Full CRUD Functionality**: Create, Read, Update, and Delete to-do items.
-   **Partial Updates**: A dedicated `PATCH` endpoint to toggle a task's completion status.
-   **Robust Validation**: Server-side validation ensures that a task cannot be created with an empty or blank title.
-   **Layered Architecture**: Code is cleanly separated into Controller, Service, and Repository layers.
-   **RESTful Design**: Follows standard conventions for building clean, predictable APIs.

---

## Technologies Used

-   **Java 17**
-   **Spring Boot 3.x**
-   **Spring Data JPA**: For database interaction and repository management.
-   **H2 In-Memory Database**: For easy setup and development.
-   **Spring Web**: For building the REST controllers and endpoints.
-   **Spring Boot Starter Validation**: For implementing server-side validation rules.
-   **Lombok**: To reduce boilerplate code (getters, setters, constructors).
-   **Maven**: As the dependency management and build tool.

---

## Getting Started

To get a local copy up and running, follow these simple steps.

### Prerequisites

-   Java Development Kit (JDK) 17 or later
-   Apache Maven

### How to Run

1.  **Clone the repository:**
    ```sh
    git clone [https://github.com/your-username/your-repository-name.git](https://github.com/your-username/your-repository-name.git)
    ```

2.  **Navigate to the project directory:**
    ```sh
    cd your-repository-name
    ```

3.  **Run the application:**
    You can run the application using the Maven wrapper included in the project:
    ```sh
    ./mvnw spring-boot:run
    ```
    The API will start up and be available at `http://localhost:8080`.

---

## API Endpoints Documentation

The API exposes the following RESTful endpoints under the base path `/api/v1/todos`:

| Method | Endpoint                    | Description                      | Sample Body                               |
| :----- | :-------------------------- | :------------------------------- | :---------------------------------------- |
| `GET`  | `/`                         | Fetches all to-do items.         | N/A                                       |
| `POST` | `/`                         | Creates a new to-do item.        | `{ "title": "My new task" }`              |
| `PUT`  | `/{id}`                     | Updates an existing to-do item.  | `{ "title": "My updated title" }`         |
| `PATCH`| `/{id}/toggle`              | Toggles the completion status.   | N/A                                       |
| `DELETE`| `/{id}`                     | Deletes a to-do item by its ID.  | N/A                                       |
