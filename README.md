📚 Library Management System (Java)
A comprehensive Library Management System built in Java designed to simulate the operations of a typical library. This project demonstrates core Object-Oriented Programming principles such as encapsulation, abstraction, inheritance, and polymorphism, providing a practical example for learners and developers.

🔎 Project Overview
This system allows librarians to manage books and users effectively. It supports operations such as adding new books, updating book details, tracking book quantities, and handling librarian-specific functionalities. The project is structured in modular packages to keep the code clean and maintainable.

🛠 Key Features
Book Management
Add, update, and delete books with detailed information including title, author, price, and quantity.

Librarian Management
Manage librarian actions, such as issuing and returning books (can be extended).

Inventory Tracking
Keep track of available copies for each book.

Object-Oriented Design
Uses encapsulation to protect data, inheritance to reuse code, and modular packages for organization.

User-friendly Code Structure
Separates different concerns into packages (encap, library, etc.) for clarity and ease of maintenance.

🎯 Learning Objectives
Deepen understanding of Java OOP concepts in a real-world scenario.

Practice working with Java collections such as HashMap and ArrayList.

Learn how to structure a medium-sized Java project using packages.

Gain experience in writing clean, maintainable code.

📁 Project Structure
bash
Copy code
com/
├── example/
│   └── encap/         # Classes demonstrating encapsulation concepts
├── library/
│   ├── lib/           # Main application classes
│   ├── librar/        # Book-related classes and logic
│   └── librariann/    # Librarian classes and related operations
💻 Technologies Used
Java 8+ (Core Java)

Collections Framework (HashMap, ArrayList)

OOP Principles: Encapsulation, Inheritance, Abstraction

🚀 How to Run
Clone the repository:

bash
Copy code
git clone https://github.com/jannubunny69/Library_project.git
Open the project in your favorite Java IDE (IntelliJ IDEA, Eclipse, VS Code with Java extension).

Run the main class:

com.library.MAIN or

com.library.com.library.lib.InnerMAIN (depending on your setup)

🔮 Future Enhancements
User Interface: Add a GUI using Java Swing or JavaFX to make the system user-friendly.

Database Integration: Use MySQL or SQLite for persistent storage of books and users.

User Management: Add different user roles (members, guests) with login/logout features.

Book Issue & Return: Implement borrowing, returning, and overdue fine calculation.

Search Functionality: Add book search by title, author, or category.

REST API: Develop a backend REST API for the system to be accessed by other apps.
