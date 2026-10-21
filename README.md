## Team Members
- Shaheer
- Loai
- Khalid
- Mohammed
- Ryan
- Mashrur

## Project Description
Java Swing-based management system for a self-defence academy.

## Technologies
- Java
- NetBeans
- GitHub
- Text File Storage

# Self Defence Academy Management System (SDAMS)

## Project Overview

The Self Defence Academy Management System (SDAMS) is a Java-based desktop application developed to manage the daily operations of a self-defence academy. The system enables efficient management of students, instructors, staff, attendance, bookings, payments, equipment, and facility-related issues.

This project is developed as part of a 6-week academic assignment using Object-Oriented Programming (OOP) principles and file-based data storage.

---

## Project Objectives

- Manage student and staff records
- Record attendance information
- Manage class schedules and bookings
- Track payments and transactions
- Monitor academy equipment
- Report and manage facility issues
- Generate basic reports
- Implement role-based user access

---

## Technology Stack

- Java
- NetBeans IDE
- Java Swing (GUI)
- Git & GitHub
- Text File Storage (.txt)

---

## Project Structure

```text
SDAMS
│
├── data
│   ├── attendance.txt
│   ├── bookings.txt
│   ├── classes.txt
│   ├── equipment.txt
│   ├── issues.txt
│   ├── payments.txt
│   ├── ratings.txt
│   ├── staff.txt
│   ├── students.txt
│   └── users.txt
│
├── diagrams
│
├── docs
│
├── screenshots
│
├── src
│   ├── model
│   ├── gui
│   ├── service
│   ├── filehandling
│   └── reports
│
└── nbproject
```

---

## System Roles

The system supports the following user roles:

- Manager
- Administrator
- Instructor
- Student
- Facilities Officer
- Attendance Officer

Each role is provided with different permissions and system functionality.

---

## Object-Oriented Design

### Base Class

```java
User
```

### Inheritance Structure

```text
User
│
├── Manager
├── Administrator
├── Instructor
├── Student
├── FacilitiesOfficer
└── AttendanceOfficer
```

### OOP Concepts Applied

- Encapsulation
- Inheritance
- Polymorphism
- Abstraction

---

## Main Classes

### User Classes

- User
- Manager
- Administrator
- Instructor
- Student
- FacilitiesOfficer
- AttendanceOfficer

### System Classes

- Booking
- Payment
- Attendance
- Rating
- Equipment
- FacilityIssue
- ClassSchedule

---

## GUI Components

Current GUI class structure:

- LoginForm
- ManagerMenu
- AdminMenu
- StudentMenu
- InstructorMenu
- FacilitiesMenu
- AttendanceMenu

Java Swing implementation will be added during later development stages.

---

## Service Layer

Current service classes include:

- UserService
- BookingService
- PaymentService
- AttendanceService
- EquipmentService

These classes handle the business logic of the application.

---

## File Management

The project uses a text-file-based storage approach.

### FileManager Responsibilities

- Save records
- Read records
- Update records
- Delete records

Planned methods:

```java
saveUser()
readUsers()
updateUser()
deleteUser()
```

---

## User Data Format

Users are stored in `users.txt` using the following format:

```text
ID,USERNAME,PASSWORD,NAME,ROLE
```

Example:

```text
M001,manager1,1234,Ali,Manager
A001,admin1,1234,Ahmad,Administrator
S001,student1,1234,Sarah,Student
I001,instructor1,1234,David,Instructor
```

---

## Git Workflow

Before starting work:

```bash
git pull
```

Check project status:

```bash
git status
```

Stage changes:

```bash
git add .
```

Commit changes:

```bash
git commit -m "Meaningful commit message"
```

Push changes:

```bash
git push
```

View commit history:

```bash
git log --oneline
```

---

## Current Progress (Week 1)

### Completed

✅ GitHub repository setup

✅ Local repository configuration

✅ Project folder structure

✅ Package creation

✅ Model class skeletons

✅ GUI class skeletons

✅ Service class skeletons

✅ Data file structure

✅ Documentation planning

✅ UML planning

✅ Git workflow implementation

---

## Week 1 Deliverables

- User hierarchy completed
- Project structure created
- Initial class skeletons created
- File storage structure prepared
- GitHub repository configured
- Documentation framework planned

---

## Week 2 Development Plan

The next phase focuses on the Login and Authentication Module.

### Features to Implement

- Login system
- User authentication
- Read users from users.txt
- Credential validation
- Role-based access control
- Menu redirection based on user role

This module will serve as the foundation for all remaining SDAMS features.

---

## Team Repository

Repository Link:

https://github.com/greenpandas/SDAMS

---

## Authors

Self Defence Academy Management System (SDAMS)

Developed as an academic group project using Java, NetBeans, Git, and Object-Oriented Programming principles.
