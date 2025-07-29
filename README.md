#  🎭 Theater Management System – Backend

A RESTful backend API for a comprehensive Theater Management System, developed using Java, Spring Boot, and MySQL. This project handles core theater operations such as managing owners, branches, theaters, movies, employees, tickets, payments, and more. All major CRUD functionalities are implemented and tested with Postman.
---

## 🚀 Technologies Used

- **Java**
- **Spring Boot**
- **Spring Data JPA  (Hibernate)**
- **MySQL**
- **Postman**

---

## 🧱 Project Architecture

This project follows a layered architecture:

### 🔹 Controller Layer
- Exposes RESTful APIs
- Handles HTTP requests/responses

### 🔹 Service Layer
- Contains business logic
- Acts as a bridge between controller and DAO layers

### 🔹 Repository Layer (DAO)
- Uses Spring Data JPA to interact with the database
- All entities are connected to their respective repositories

### 🔹 Data Transfer Object Layer
- Used for transferring filtered/structured data between layers

### 🔹 Util Package
- Contains custom response structures, status codes, and messages

### 🔹 Exception Handling
- Centralized exception handling using `@ControllerAdvice`
- Custom exceptions for clarity

---

## 🧩 Core Entities

- **Owner**
- **Branch**
- **Theater**
- **Manager**
- **Employee**
- **Screen**
- **Food**
- **Ticket**
- **Seat**
- **Payment**
- **Movie**
- **Viewer**

> Each entity supports **Create, Read, Update, Delete** operations.

---

## 🧪  API Testing

All endpoints are tested using **Postman**. Each HTTP method (GET, POST, PUT, DELETE) is verified with sample data.

---

## 📌 Project Highlights

- ✅ Backend-only implementation (No UI)
- ✅ Clean, modular, and scalable architecture
- ✅ Ideal for real-time feature expansion

---

## 🔮 Future Enhancements

- Integration with frontend (React.js / Angular)
- Role-based authentication & authorization (Spring Security + JWT)
- Admin dashboard and analytics
- Email/SMS notifications
---

## 📄 License
This project is open-source and free to use.

---

## 👨‍💻 Developed By
M Arshad
Computer Science Graduate | Java Full Stack Developer
