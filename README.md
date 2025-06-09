# student-management
# Student Management System

A simple Student Management System built using Spring Boot, JPA, and MySQL.

## Features

- Add, update, delete, and view student records
- RESTful API endpoints
- Uses MySQL database with JPA/Hibernate
- Lombok for reducing boilerplate code

## Technologies Used

- Java 17
- Spring Boot 3.4.6
- Spring Data JPA
- MySQL
- Lombok
- Maven

## Getting Started

### Prerequisites

- Java 17 or higher
- Maven
- MySQL database
- Postman or any API testing tool (optional)

### Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-management-system.git
   cd student-management-system
# 2.Configure the MySQL database connection in src/main/resources/application.properties:
spring.datasource.url=jdbc:mysql://localhost:3306/your_database_name
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
# 3.Build and run the application:
mvn clean install
mvn spring-boot:run
# API Endpoints
 Method | Endpoint           | Description             
 
 GET    | /students      | Get all students        
 GET    | /students/{id} | Get student by ID       
 POST   | /students      | Add a new student       
 PUT    | /students/{id} | Update existing student 
 DELETE | /students/{id} | Delete student by ID    
# 4.Testing
You can test the APIs using Postman or any REST client
Sample POST request body for adding a student:

![Screenshot (26)](https://github.com/user-attachments/assets/d8e129ce-0aa9-41c0-a661-42833a076e71)
Sample PUT request body for updating a student:
![Screenshot (27)](https://github.com/user-attachments/assets/78abc7e7-15ca-4ec1-9954-73921ae4f07d)
Sample GET request body for reading a student:
![Screenshot (30)](https://github.com/user-attachments/assets/9c479a1e-3c97-4805-b4ab-49f855e68850)
Sample Delete request body for deleting a student:

![Screenshot (31)](https://github.com/user-attachments/assets/c7307724-15f0-4fb5-8c10-3b5e4b930b23)
# Troubleshooting
Make sure MySQL service is running and database is created.
Ensure your application.properties has correct credentials.
Check if Lombok plugin is installed and enabled in your IDE.
# Contact
Created by Your Name - Rajendra Dubey

GitHub: https://github.com/rajendradubey753/student-management
