# Investigation Case Management System

A web-based Investigation Case Management System developed using **Spring Boot**, **MongoDB**, **HTML**, **CSS**, and **JavaScript**. The application helps manage investigation cases with complete CRUD (Create, Read, Update, Delete) operations.

---

## 📌 Features

- User Login
- Dashboard
- Add New Case
- View All Cases
- Update Existing Case
- Delete Case
- MongoDB Database Integration
- REST API using Spring Boot

---

## 🛠 Technologies Used

- Java 21
- Spring Boot
- Spring Data MongoDB
- MongoDB
- Maven
- HTML5
- CSS3
- JavaScript
- REST API

---

## 📁 Project Structure

```
investigate-management
│── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── cms
│   │   │           └── investigate_management
│   │   │               ├── controller
│   │   │               │   ├── CaseController.java
│   │   │               │   └── UserController.java
│   │   │               │
│   │   │               ├── service
│   │   │               │   ├── CaseService.java
│   │   │               │   └── UserService.java
│   │   │               │
│   │   │               ├── repository
│   │   │               │   ├── CaseRepository.java
│   │   │               │   └── UserRepository.java
│   │   │               │
│   │   │               ├── model
│   │   │               │   ├── Case.java
│   │   │               │   └── User.java
│   │   │               │
│   │   │               └── InvestigationManagementApplication.java
│   │   │
│   │   └── resources
│   │       ├── static
│   │       │   ├── css
│   │       │   ├── js
│   │       │   ├── login.html
│   │       │   ├── dashboard.html
│   │       │   ├── add_case.html
│   │       │   ├── view_cases.html
│   │       │   └── update_case.html
│   │       │
│   │       └── application.properties
│
│── pom.xml
│── README.md
│── .gitignore
│── mvnw
│── mvnw.cmd
```

---

## ⚙️ Installation

### Clone the Repository

```bash
git clone https://github.com/Ashwini-HM/investigate-management.git
```

### Navigate to the Project

```bash
cd investigate-management
```

### Configure MongoDB

Update `application.properties`:

```properties
spring.data.mongodb.uri=mongodb://localhost:27017/investigation_db
```

### Run the Application

```bash
./mvnw spring-boot:run
```

or

```bash
mvn spring-boot:run
```

---

## 🌐 Application URLs

| Page | URL |
|------|-----|
| Login | http://localhost:8080/login.html |
| Dashboard | http://localhost:8080/dashboard.html |
| Add Case | http://localhost:8080/add_case.html |
| View Cases | http://localhost:8080/view_cases.html |
| Update Case | http://localhost:8080/update_case.html |

---

## 🚀 Future Enhancements

- Role-based authentication
- Search and filter cases
- Dashboard analytics
- File/document upload
- Email notifications
- PDF report generation
- Case status tracking

---

## 👩‍💻 Author

**Ashwini HM**

---

## 📄 License

This project is developed for educational purposes.
