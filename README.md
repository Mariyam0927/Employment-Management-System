📌 Employment Management System

A backend web application built using Spring Boot and MySQL that allows organizations to manage employee records efficiently. The system provides secure RESTful APIs for creating, viewing, updating, deleting, and searching employee information with advanced features like pagination and sorting.

🚀 Features

=> Add new employees

=> View all employees with pagination & sorting

=> View employee by ID

=> Update employee details

=> Delete employee records

=> MySQL database integration

RESTful API architecture

Clean layered structure (Controller → Service → Repository)

🛠️ Technologies Used
Technology	Description
Java	Backend Programming
Spring Boot	Application Framework
Spring Data JPA	ORM & Database Handling
MySQL	Relational Database
Maven	Dependency Management
Postman	API Testing
🗂️ Project Structure
src
 └── main
     └── java
         └── com.example.employment.management.system
             ├── controller
             ├── service
             │    └── impl
             ├── repository
             ├── entity
             ├── dto
             ├── exception
             └── EmploymentManagementSystemApplication

⚙️ Setup Instructions
🔹 Step 1: Clone the repository
git clone https://github.com/Mariyam0927/employment-management-system.git

🔹 Step 2: Create MySQL Database
CREATE DATABASE ems_db;

🔹 Step 3: Update Database Configuration

In application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/ems_db
spring.datasource.username=your_mysql_username
spring.datasource.password=your_mysql_password

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true

🔹 Step 4: Run the Application

From IntelliJ or terminal:

mvn spring-boot:run


The application runs on:

http://localhost:8080

📡 API Endpoints
Method	Endpoint	Description
POST	/api/employees	Add new employee
GET	/api/employees/page	Get all employees (pagination & sorting)
GET	/api/employees/{id}	Get employee by ID
PUT	/api/employees/{id}	Update employee
DELETE	/api/employees/{id}	Delete employee
🔸 Example: Pagination & Sorting
GET /api/employees/page?page=0&size=5&sort=name,asc

🧪 Testing with Postman

Use Postman to test all endpoints with JSON request bodies.

Example POST request:

{
  "name": "Mariyam Begam",
  "email": "mariyam@gmail.com",
  "phone": "9876543210",
  "department": "IT",
  "jobRole": "Java Developer",
  "salary": 45000
}

🧑‍💻 Author

Mariyam Begam
BCA Student | Java Full Stack Developer
GitHub: https://github.com/Mariyam0927

🌟 Future Enhancements

 => Authentication & Authorization

 => Role-based access control

 => Frontend integration

 => Deployment on cloud

Frontend integration

Deployment on cloud
