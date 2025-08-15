# Spring Boot Data JPA CRUD Operation using CrudRepository

## 📌 Project Description
This project is a **stand-alone Spring Boot application** that demonstrates how to perform **CRUD (Create, Read, Update, Delete)** operations using **Spring Data JPA’s `CrudRepository`** interface.  
It runs without any web interface — all operations are executed within the application using a **CommandLineRunner** in the `main()` method.  
It connects to a relational database (Oracle/MySQL/PostgreSQL) and uses JPA for object-relational mapping.

---

## ⚙️ Features
- Create and save new records to the database
- Retrieve records by ID or fetch all records
- Update existing records
- Delete records by ID
- No manual SQL — uses built-in `CrudRepository` methods

---

## 📂 Project Structure
```
SpringBoot-Data-JPA-Pro2-Crudrepo
│
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── nt
│   │   │           ├── SpringbootDataJpaPro2CrudrepoApplication.java
│   │   │           ├── entity
│   │   │           │   └── Coustomer.java
│   │   │           ├── Repository
│   │   │           │   └── CustomerRepo.java
│   │   │           ├── Runner
│   │   │           │   └── CrudRepotestRunner.java
│   │   │           └── Service
│   │   │               ├── CustomermagtServiceImpl.java
│   │   │               └── ICustomermanagmentService.java
│   │   └── resources
│   │       └── application.properties
│   └── test
│       └── java
└── pom.xml
```

---

## 🛠️ Technologies Used
- **Java 17+**
- **Spring Boot** (Data JPA)
- **CrudRepository**
- **Oracle Database** / MySQL / PostgreSQL
- **Maven** (Build Tool)

---

## 📄 Example `application.properties`
```properties
# Database Configuration (Example: Oracle)
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=your_username
spring.datasource.password=your_password
spring.datasource.driver-class-name=oracle.jdbc.OracleDriver

# JPA / Hibernate
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true

## 📖 What I Learned
Through this project, I gained practical knowledge in:
- Setting up a **Spring Boot** application from scratch
- Using **Spring Data JPA** and `CrudRepository` for database operations
- Designing an **Entity class** and mapping it to a database table
- Writing a **Service Layer** to separate business logic from data access
- Implementing a **CommandLineRunner** to run CRUD operations at startup
- Configuring `application.properties` for different databases (Oracle/MySQL)
- Using **Maven** for project build and dependency management
- Understanding how JPA automatically handles SQL queries behind the scenes


💡 Future Improvements
Here’s what I’m planning to add in the future:
✅ REST API endpoints for CRUD operations



