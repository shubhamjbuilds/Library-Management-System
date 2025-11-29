# Library Management System (LMS)

A simple console-based Java application for managing a library's books and members. Users can add books, manage members (students and teachers), search for books, borrow/return books, and generate reports on borrowed items. The system enforces borrow limits: students can borrow up to 3 books, while teachers can borrow up to 5.

## Quick Start

### Prerequisites
- Java Development Kit (JDK) 8 or higher installed.
- Any Java IDE (e.g., IntelliJ IDEA, Eclipse) or command-line tools like `javac` and `java`.

### Setup and Run
1. Clone or download the project files into a directory (e.g., `lms-project`).
2. Ensure all `.java` files are in the `src/com/lms/` package structure.
3. Compile the project:
   ```
   javac -d . src/com/lms/*.java
   ```
4. Run the main application:
   ```
   java com.lms.Main
   ```
5. Interact with the menu-driven interface to manage the library.

The system initializes with 10 sample books and 2 members (a student and a teacher), and demonstrates initial borrowing.

---

## Project Overview

### Core Functionality
This Library Management System (LMS) is designed as an object-oriented Java program to simulate basic library operations. It uses abstraction, inheritance, polymorphism, and interfaces to model entities like books and members. The application runs in a console environment, providing a menu for users to perform actions without a graphical interface.

Key design principles applied:
- **Encapsulation**: Private fields in `Book` and `Member` classes with public getters/setters.
- **Inheritance**: `Student` and `Teacher` extend the abstract `Member` class.
- **Interfaces**: `Borrowable` defines borrow limits; `Reportable` handles reporting.
- **Collections**: `ArrayList` for storing books and members in `Library`.

The system starts with predefined data for demonstration, but the menu allows dynamic operations.

### Features
- **Book Management**:
  - Add books with ID, title, author, and availability status.
  - Search books by title (case-insensitive).
  - Display all books with details.

- **Member Management**:
  - Add students (borrow limit: 3 books) and teachers (borrow limit: 5 books).
  - Display all members with borrowed book counts.

- **Borrowing and Returning**:
  - Borrow books: Checks availability and member's borrow limit.
  - Return books: Updates availability and removes from member's list.
  - Error handling for invalid IDs, unavailable books, or exceeded limits.

- **Reporting**:
  - Generate per-member reports listing borrowed books.
  - Initial demo reports printed on startup.

- **Menu-Driven Interface**:
  - Options: Show books/members, search, borrow, return, exit.
  - Input validation for menu choices.

### Sample Output
On startup, the system prints initial reports:
```
--- Report for Shubham ---
[1][Java Basics][James Gosling][false]

--- Report for Dr.Sagar ---
[2][Python for Beginners][Guido van Rossum][false]
```

Menu example:
```
Library Management System
1. Show All Books
2. Show All Members
3. Search Books
4. Borrow book
5. Return book
6. Exit
Please enter your choice
```

### Project Structure
The codebase follows standard Java package conventions under `com.lms`.

| File Name       | Description                                                                 |
|-----------------|-----------------------------------------------------------------------------|
| `Main.java`    | Entry point with menu loop, sample data initialization, and demo borrowing. |
| `Book.java`    | Represents a book with borrow/return methods and string representation.     |
| `Library.java` | Manages collections of books/members; handles searches and retrievals.      |
| `Member.java`  | Abstract base class for members; implements borrowing, returning, reporting.|
| `Student.java` | Concrete student class extending `Member` with 3-book limit.                |
| `Teacher.java` | Concrete teacher class extending `Member` with 5-book limit.                |
| `Borrowable.java` | Interface defining `getBorrowLimit()` for polymorphic borrow checks.     |
| `Reportable.java` | Interface for `getReport()` to print borrowed books.                     |

### Dependencies
- None external; uses only Java Standard Library (e.g., `Scanner`, `ArrayList`).

### Acknowledgments
- Inspired by standard OOP exercises in Java textbooks like "Head First Java".

For questions or enhancements, feel free to reach out!
