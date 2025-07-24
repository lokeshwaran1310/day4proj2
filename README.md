# 🚌 Ticket Reservation System

## 📄 Description

The **Ticket Reservation System** is a simple Java-based console application that allows users to reserve tickets between different locations. It includes user input validation with custom exception handling, logs errors to a file, and maintains a list of reserved tickets.

---

## 🧩 Components

### 1. **Main Class (`main.Main`)**
- Acts as the entry point of the application.
- Provides a menu-driven interface to reserve and view tickets.
- Handles exceptions and logs errors.

### 2. **Models**
- **User (`models.User`)**: Represents the basic user entity with name and age.
- **Ticket (`models.Ticket`)**: Extends `User` with additional fields `source` and `destination`.

### 3. **Service Layer**
- **UserService (`services.UserService`)**: Handles the business logic for creating and storing tickets.
- Validates age and checks for identical source and destination.

### 4. **Custom Exceptions**
- **invalidAgeExceptions**: Thrown if the user is under 18.
- **sameLocation**: Thrown if the source and destination are the same.

---

## 🎯 Purpose

- Learn basic **Java OOP concepts**.
- Practice **exception handling** with custom exceptions.
- Implement **file logging** for error handling.
- Understand how to manage multiple components in a layered application.

---

## 🛠️ Design Highlights

- 🚫 Custom exceptions to handle invalid user inputs.
- 📝 Error logging with `FileWriter` to `error.log`.
- 👥 Object-oriented structure with model-service separation.
- 📋 Console-based UI for interaction.

---

## 👨‍💻 Author

**Name:** *Lokeshwaran M*   
**Email:** *lokeshwaran.m@epssw.com*

---
