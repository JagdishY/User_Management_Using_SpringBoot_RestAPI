User Management System:
The User Management System is a web-based application designed to handle user information such as registration, login, profile management, and user role-based access. It provides a RESTful API to manage users, using Spring Boot as the backend framework and Oracle as the database for persistent storage. The system uses JPA for object-relational mapping, ensuring that the application can interact with the database seamlessly.

# User Management System

A User Management System built using Spring Boot, REST API, JPA, Oracle Database, and designed with MVC architecture. This system provides a set of CRUD operations for managing users and validates user input using Spring Boot's validation annotations.

## Features

- **User Registration**: Allows users to register with basic details.
- **User Authentication**: Supports user authentication with username and password.
- **User Update**: Allows modification of user details.
- **User Deletion**: Allows deletion of user records.
- **User Retrieval**: Allows fetching a user by ID or list all users.
- **Exception Handling**: Custom exception handling with appropriate status codes.
- **Spring Boot Validation**: Validates user input using annotations like `@NotNull`, `@Size`, `@Email`, etc.
- **REST API**: Provides RESTful endpoints to interact with the user data.
- **JPA & Oracle Integration**: Uses JPA to interact with Oracle Database.
- **Status Code Handling**: Returns appropriate HTTP status codes based on the outcome of operations.

## Technologies Used

- **Spring Boot**: For building the backend REST API.
- **Spring Data JPA**: For interacting with the Oracle Database.
- **Oracle Database**: To store user details.
- **Spring Boot Validation**: For input validation.
- **Spring MVC**: For structuring the application using the MVC design pattern.
- **Exception Handling**: Custom exception classes to handle errors and send proper HTTP status codes.

## Requirements

- Java 17 or above
- Maven 3.x
- Oracle Database
- Spring Boot 2.x

## Setup and Installation

### 1. Clone the repository
```bash
git clone # User Management System

A User Management System built using Spring Boot, REST API, JPA, Oracle Database, and designed with MVC architecture. This system provides a set of CRUD operations for managing users and validates user input using Spring Boot's validation annotations.

## Features

- **User Registration**: Allows users to register with basic details.
- **User Authentication**: Supports user authentication with username and password.
- **User Update**: Allows modification of user details.
- **User Deletion**: Allows deletion of user records.
- **User Retrieval**: Allows fetching a user by ID or list all users.
- **Exception Handling**: Custom exception handling with appropriate status codes.
- **Spring Boot Validation**: Validates user input using annotations like `@NotNull`, `@Size`, `@Email`, etc.
- **REST API**: Provides RESTful endpoints to interact with the user data.
- **JPA & Oracle Integration**: Uses JPA to interact with Oracle Database.
- **Status Code Handling**: Returns appropriate HTTP status codes based on the outcome of operations.

## Technologies Used

- **Spring Boot**: For building the backend REST API.
- **Spring Data JPA**: For interacting with the Oracle Database.
- **Oracle Database**: To store user details.
- **Spring Boot Validation**: For input validation.
- **Spring MVC**: For structuring the application using the MVC design pattern.
- **Exception Handling**: Custom exception classes to handle errors and send proper HTTP status codes.

## Requirements

- Java 17 or above
- Maven 3.x
- Oracle Database
- Spring Boot 2.x

## Setup and Installation

### 1. Clone the repository
```bash
git clone https://github.com/your-repository/user-management-system.git# User Management System

A User Management System built using Spring Boot, REST API, JPA, Oracle Database, and designed with MVC architecture. This system provides a set of CRUD operations for managing users and validates user input using Spring Boot's validation annotations.

## Features

- **User Registration**: Allows users to register with basic details.
- **User Authentication**: Supports user authentication with username and password.
- **User Update**: Allows modification of user details.
- **User Deletion**: Allows deletion of user records.
- **User Retrieval**: Allows fetching a user by ID or list all users.
- **Exception Handling**: Custom exception handling with appropriate status codes.
- **Spring Boot Validation**: Validates user input using annotations like `@NotNull`, `@Size`, `@Email`, etc.
- **REST API**: Provides RESTful endpoints to interact with the user data.
- **JPA & Oracle Integration**: Uses JPA to interact with Oracle Database.
- **Status Code Handling**: Returns appropriate HTTP status codes based on the outcome of operations.

## Technologies Used

- **Spring Boot**: For building the backend REST API.
- **Spring Data JPA**: For interacting with the Oracle Database.
- **Oracle Database**: To store user details.
- **Spring Boot Validation**: For input validation.
- **Spring MVC**: For structuring the application using the MVC design pattern.
- **Exception Handling**: Custom exception classes to handle errors and send proper HTTP status codes.

## Requirements

- Java 17 or above
- Maven 3.x
- Oracle Database
- Spring Boot 2.x

## Setup and Installation

### 1. Clone the repository
```bash
git clone # User Management System

A User Management System built using Spring Boot, REST API, JPA, Oracle Database, and designed with MVC architecture. This system provides a set of CRUD operations for managing users and validates user input using Spring Boot's validation annotations.

## Features

- **User Registration**: Allows users to register with basic details.
- **User Authentication**: Supports user authentication with username and password.
- **User Update**: Allows modification of user details.
- **User Deletion**: Allows deletion of user records.
- **User Retrieval**: Allows fetching a user by ID or list all users.
- **Exception Handling**: Custom exception handling with appropriate status codes.
- **Spring Boot Validation**: Validates user input using annotations like `@NotNull`, `@Size`, `@Email`, etc.
- **REST API**: Provides RESTful endpoints to interact with the user data.
- **JPA & Oracle Integration**: Uses JPA to interact with Oracle Database.
- **Status Code Handling**: Returns appropriate HTTP status codes based on the outcome of operations.

## Technologies Used

- **Spring Boot**: For building the backend REST API.
- **Spring Data JPA**: For interacting with the Oracle Database.
- **Oracle Database**: To store user details.
- **Spring Boot Validation**: For input validation.
- **Spring MVC**: For structuring the application using the MVC design pattern.
- **Exception Handling**: Custom exception classes to handle errors and send proper HTTP status codes.

## Requirements

- Java 17 or above
- Maven 3.x
- Oracle Database
- Spring Boot 2.x

## Setup and Installation

### 1. Clone the repository
```bash
git clone https://github.com/JagdishY/User_Management_Using_SpringBoot_RestAPI.git
 
Configure Oracle Database
Set up an Oracle Database instance.
Update the application.properties with your Oracle database credentials:

spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=your_oracle_username
spring.datasource.password=your_oracle_password
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver
spring.jpa.database-platform=org.hibernate.dialect.Oracle12cDialect
spring.jpa.hibernate.ddl-auto=update

Build the project
Run the following Maven command to build the project:
mvn clean install

Run the application
mvn spring-boot:run

Test the API
Once the application is running, you can test the API using tools like Postman or cURL.

API Endpoints
1. Create a User
POST /api/users

Request Body:
json
====
{
    "name": "Yagnik",
    "email": "Yagnik2022@gmail.com",
    "gender": "Male",
    "age": 25,
    "contact": 9848022335,
    "city": "Bangalore"
}

=> Response:
201 Created (on successful creation)
400 Bad Request (on validation failure)

Get a User by ID
GET /users/{id}

Response:
200 OK (on success)
404 Not Found (if the user does not exist)

. Get All Users
GET /users/all

Response:
200 OK (on success)

Update User Details
PUT /users//update/{email}

{
  "username": "johndoe",
  "email": "johndoe@example.com",
  "tName": "John",
  "password": "password123"
}

. Delete a User
DELETE /api/users/{id}

Response:
204 No Content (on successful deletion)
404 Not Found (if the user does not exist)

Exception Handling
The application uses custom exception handling for common errors. The main exceptions handled are:

UserNotFoundException: When a user is not found during retrieval or deletion.
InvalidInputException: When the provided input does not meet the validation constraints.
GenericException: For handling unexpected errors.
Example Response for Exception:
{
  "status": "error",
  "message": "User not found with ID: 123"
}

Validation Constraints
Spring Boot validation annotations are used for validating user inputs:

@NotNull: Ensures that the field is not null.
@Size(min = 3, max = 50): Validates that the field length is between 3 and 50 characters.
@Email: Ensures the email is in the correct format.

Example of Invalid Request:
============================
{
  "username": "",
  "email": "invalid-email",
  "firstName": "John"
}


This will trigger validation errors and return a 400 Bad Request with details on which fields are invalid.

MVC Design Pattern
==================
This application follows the Model-View-Controller (MVC) design pattern:

Model: Represents the user data and the business logic for interacting with the database (User entity).
View: The REST API endpoints that present data to the client (JSON responses).
Controller: Handles HTTP requests and uses the Model to perform CRUD operations.












