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
# --- Database Connection Properties ---
# Specifies the JDBC driver class for Oracle.
spring.datasource.driver-class-name=oracle.jdbc.driver.OracleDriver

# Configures the connection URL for the Oracle database.
# This URL points to the 'xe' SID on the local machine at port 1521.
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:orcl

# Sets the database username.
spring.datasource.username=system

# Sets the password for the database user.
spring.datasource.password=Chinmay

# --- JPA and Hibernate Properties ---
# Specifies the Hibernate dialect for Oracle, which helps Hibernate generate Oracle-specific SQL.
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.OracleDialect

# When set to true, this logs all SQL queries to the console for debugging.
spring.jpa.show-sql=true

# Configures Hibernate to automatically update the database schema based on your entities.
# The `update` value adds or modifies tables and columns but doesn't drop them.
spring.jpa.hibernate.ddl-auto=update




## 📖 What I Learned  

💡 During this project, I explored **Spring Boot** and **Spring Data JPA** in depth, gaining hands-on experience with:  

- 🚀 **Spring Boot Setup** — Creating a project from scratch with Maven  
- 🗄 **Spring Data JPA & `CrudRepository`** — Performing CRUD operations without manual SQL  
- 🏗 **Entity Design** — Mapping Java classes to database tables using JPA annotations  
- 🧠 **Service Layer** — Separating business logic from data access for clean architecture  
- ⚡ **CommandLineRunner** — Executing CRUD operations automatically at application startup  
- ⚙️ **Database Configuration** — Switching between Oracle & MySQL via `application.properties`  
- 📦 **Maven Build Management** — Handling dependencies and project lifecycle  
- 🔍 **JPA Magic** — Understanding how JPA auto-generates SQL queries under the hood  

✨ This project not only strengthened my understanding of **Spring Boot & JPA**, but also improved my ability to structure clean, maintainable applications.  




💡 Future Improvements
Here’s what I’m planning to add in the future:
✅ REST API endpoints for CRUD operations



