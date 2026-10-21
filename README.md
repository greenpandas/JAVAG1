# Self Defence Academy Management System (SDAMS)

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
SDAMS Project Progress Summary (Week 1)
Project Information

Project Name: Self Defence Academy Management System (SDAMS)

Technology Stack:

Java
NetBeans
Java Swing (later)
Git & GitHub
Text File Storage (No Database)

Duration: 6 Weeks

What We Have Completed
1. GitHub Repository Setup

Repository created:

SDAMS

Repository connected successfully to local machine.

Git was initialized and connected to:

https://github.com/greenpandas/SDAMS.git

Successfully learned basic Git workflow:

git pull

git status

git add .

git commit -m "message"

git push

2. Project Structure Created

Current project structure:

SDAMS

│

├── data

│   ├── attendance.txt

│   ├── bookings.txt

│   ├── classes.txt

│   ├── equipment.txt

│   ├── issues.txt

│   ├── payments.txt

│   ├── ratings.txt

│   ├── staff.txt

│   ├── students.txt

│   └── users.txt

│

├── diagrams

│

├── docs

│

├── screenshots

│

├── src

│   │

│   ├── model

│   ├── gui

│   ├── service

│   ├── filehandling

│   └── reports

│

└── nbproject

3. Packages Created

Created packages:

model

gui

service

filehandling

reports

4. Model Classes Created

Created the following classes:

User Classes

User

Manager

Administrator

Instructor

Student

FacilitiesOfficer

AttendanceOfficer

System Classes

Booking

Payment

Attendance

Rating

Equipment

FacilityIssue

ClassSchedule

Purpose:

These represent the main business objects of the SDAMS system.

5. GUI Classes Created

Created placeholder GUI classes:

LoginForm

ManagerMenu

AdminMenu

StudentMenu

InstructorMenu

FacilitiesMenu

AttendanceMenu

No Swing implementation yet.

6. Service Classes Created

Created:

UserService

BookingService

PaymentService

AttendanceService

EquipmentService

Currently skeleton classes only.

7. File Handling Layer Created

Created:

FileManager.java

Planned responsibilities:

saveUser()

readUsers()

updateUser()

deleteUser()

Implementation not yet started.

Git Knowledge Learned

Important commands:

Get latest updates

git pull

View changes

git status

Stage files

git add .

Commit

git commit -m "Meaningful message"

Push

git push

View history

git log --oneline

Team Git Workflow Agreed

Before coding:

git pull

After completing a task:

git add .

git commit -m "Task completed"

git push

Example:

git commit -m "Added Student class"

OOP Design Direction
Base Class

User

Planned attributes:

userId

username

password

name

role

Inheritance Structure

User

│

├── Manager

├── Administrator

├── Instructor

├── Student

├── FacilitiesOfficer

└── AttendanceOfficer

Purpose:

Demonstrates:

Encapsulation
Inheritance
Polymorphism
Abstraction

Required by assignment.

Getters and Setters Learned

Example:

private String username;

public String getUsername() {

return username;

}

public void setUsername(String username) {

this.username = username;

}

NetBeans shortcut:

Alt + Insert

Then:

Getter and Setter

Data Storage Design

Planned file structure:

users.txt

Example:

M001,manager1,1234,Ali,Manager

A001,admin1,1234,Ahmad,Administrator

S001,student1,1234,Sarah,Student

I001,instructor1,1234,David,Instructor

Format:

ID,USERNAME,PASSWORD,NAME,ROLE

Documentation Progress

Created documentation structure concept.

Planned report sections:

1. Cover Page

2. Table of Contents

3. Introduction

4. Objectives

5. Problem Statement

6. Scope

7. Functional Requirements

8. Non-Functional Requirements

9. Use Case Diagram

10. Class Diagram

11. System Design

12. Implementation

13. Testing

14. Conclusion

Current recommendation:

Start writing documentation from Week 1 instead of waiting until Week 6.

UML Plan

Need to create:

Use Case Diagram

Actors:

Manager

Administrator

Instructor

Student

Facilities Officer

Attendance Officer

Class Diagram

First version:

User

│

┌────────────────┼────────────────┐

│                │                │

Manager    Administrator    Instructor

                                  │

                               Student

│

FacilitiesOfficer

│

AttendanceOfficer




Current Status

Completed:

✅ Repository setup

✅ GitHub connection

✅ Initial commits

✅ Package structure

✅ Class skeleton structure

✅ Data folder structure

✅ Documentation planning

✅ Understanding of Git workflow

✅ Understanding of getters/setters

✅ Understanding of inheritance design

Immediate Next Tasks
Task 1

Finish User.java

Add:

private String userId;

private String username;

private String password;

private String name;

private String role;

Generate:

Constructor
Getters
Setters
Task 2

Make user role classes inherit from User:

public class Student extends User {

}

Repeat for all role classes.

Task 3

Created first UML Class Diagram in Draw.io.

Save inside:

diagrams/

Task 4

Created FileManager method skeleton:

saveUser()

readUsers()

updateUser()

deleteUser()

Task 5

Created report skeleton document inside:

docs/

With all report section headings.

Week 1 Goal

By end of Week 1:

✅ User hierarchy complete

✅ UML draft complete

✅ FileManager skeleton complete

✅ Documentation skeleton complete

✅ Everything committed and pushed to GitHub

Planned Week 2

Focus on:

Login System

User Authentication

Reading users from users.txt

Role-based access

Everything else in the project will depend on the login system.
