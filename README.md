# Employee Payroll Microservices System

A Microservices-based Payroll Management System developed using Spring Boot, MySQL, REST APIs, and Docker. This project demonstrates service orchestration between multiple microservices to calculate employee salaries based on attendance records.

---

## 🚀 Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- REST API
- Maven
- Docker
- JUnit & Mockito
- Eclipse IDE
- Postman

---

## 📌 Microservices Included

1. Employee Service
2. Attendance Service
3. Payslip Service (Orchestrator)

---

## ⚙️ Features

- Add and manage employee details
- Store employee attendance records
- Calculate monthly salary automatically
- REST API communication between services
- MySQL database integration
- Microservice orchestration using RestTemplate
- Unit testing using JUnit and Mockito
- Docker support for containerization

---

## 🔄 Project Flow

1. Employee data is stored in Employee Service
2. Attendance data is stored in Attendance Service
3. Payslip Service calls both services
4. Salary is calculated using:

```text
Salary = SalaryPerDay × DaysPresent
```

5. Final payslip is generated and returned as JSON response

---

## 🗂️ Project Structure

```text
MicroserviceProject/
│
├── employee-service
├── attendance-service
└── payslip-service
```

### Services Description

- employee-service → Employee Management
- attendance-service → Attendance Management
- payslip-service → Salary Calculation & Orchestration

---

## 🌐 REST APIs

### Employee Service (Port 8081)

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/employee` | Add Employee |
| GET | `/employee/{id}` | Get Employee |

---

### Attendance Service (Port 8082)

| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | `/attendance` | Add Attendance |
| GET | `/attendance/{employeeId}` | Get Attendance |

---

### Payslip Service (Port 8083)

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/payslip/{employeeId}` | Generate Payslip |

---

## 🛠️ Tools Used

- Eclipse IDE
- MySQL Workbench
- Postman
- Docker Desktop

---

## 🗄️ Database Setup

Create the following databases in MySQL:

```sql
CREATE DATABASE employee_db;
CREATE DATABASE attendance_db;
CREATE DATABASE payslip_db;
```

---

## ▶️ How to Run

### Step 1: Clone Repository

```bash
git clone <your-github-repo-link>
```

### Step 2: Open Projects in Eclipse

- Import all three Spring Boot projects
- Update Maven dependencies

### Step 3: Start MySQL Server

Ensure MySQL is running on:

```text
localhost:3306
```

### Step 4: Run Services

Run the following services one by one:

1. Employee Service → Port 8081
2. Attendance Service → Port 8082
3. Payslip Service → Port 8083

---

## 📬 Postman Testing

### Add Employee

POST

```bash
http://localhost:8081/employee
```

Request Body:

```json
{
  "employeeId": 1,
  "employeeName": "Anshu",
  "department": "IT",
  "salaryPerDay": 500
}
```

---

### Add Attendance

POST

```bash
http://localhost:8082/attendance
```

Request Body:

```json
{
  "attendanceId": 1,
  "employeeId": 1,
  "month": "May",
  "daysPresent": 22
}
```

---

### Generate Payslip

GET

```bash
http://localhost:8083/payslip/1
```

---

## ✅ Sample Output

```json
{
  "employeeName": "Anshu",
  "department": "IT",
  "daysPresent": 22,
  "totalSalary": 11000.0
}
```

---

## 🐳 Docker Support

This project supports Docker containerization using:

- Dockerfile
- Docker Compose

Services can be containerized and deployed easily.

---

## 🧪 Unit Testing

JUnit and Mockito are used for:

- Service Layer Testing
- Mocking Dependencies
- Payslip Service Testing

---

## 📚 Learning Outcomes

- Understanding Microservices Architecture
- REST API Development
- Service-to-Service Communication
- Database Integration
- Spring Boot Basics
- Docker Fundamentals
- Unit Testing in Spring Boot

---

## 👨‍💻 Developed By

**Anshu Gudadhe**
