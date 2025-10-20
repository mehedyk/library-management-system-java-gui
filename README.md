# 📚 Library Management System

<div align="center">

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-GUI-red?style=for-the-badge)
![License](https://img.shields.io/badge/License-MIT-green?style=for-the-badge)
![Status](https://img.shields.io/badge/Status-Active-success?style=for-the-badge)

### *A Feature-Rich Library Management System Built with Java Swing*

[Features](#-features) • [Installation](#-installation) • [Usage](#-usage) • [Screenshots](#-screenshots) • [Contributing](#-contributing) • [License](#-license)

</div>

---

## 🌟 Overview

Welcome to the **Library Management System** - a comprehensive desktop application designed to streamline library operations with an intuitive graphical user interface. Built entirely in Java using Swing, this project demonstrates robust Object-Oriented Programming principles while providing practical functionality for managing books, members, and transactions.

### ✨ What Makes This Special?

- 🎨 **Clean & Intuitive GUI** - Built with Java Swing for a seamless user experience
- 🔐 **Role-Based Access** - Separate interfaces for admins and members
- 📖 **Complete Book Management** - Add, remove, borrow, and return books effortlessly
- 👥 **Member Management** - Register members and track their activities
- 🏗️ **OOP Excellence** - Demonstrates encapsulation, inheritance, abstraction, and polymorphism
- 💾 **Zero External Dependencies** - Pure Java implementation with no external libraries

---

## 🚀 Features

### 👨‍💼 Admin Capabilities

<table>
<tr>
<td width="50%">

#### 📚 Book Management
- ➕ Add new books to the library
- ❌ Remove books from inventory
- 📋 View complete book catalog
- 📊 Track book quantities

</td>
<td width="50%">

#### 👥 Member Management
- 👁️ View all registered members
- 📈 Monitor member activities
- 🔍 Access member information
- 📝 Maintain member records

</td>
</tr>
</table>

### 👨‍🎓 Member Capabilities

- 🔍 **Browse Books** - View available books in the library
- 📖 **Borrow Books** - Check out books with automatic quantity tracking
- 📚 **Return Books** - Return borrowed books seamlessly
- 🔐 **Secure Login** - Personal account with password protection

---

## 💻 Technology Stack

```
┌─────────────────────────────────────┐
│  Java Development Kit (JDK 17+)    │
├─────────────────────────────────────┤
│  Java Swing (GUI Framework)         │
├─────────────────────────────────────┤
│  Object-Oriented Programming        │
├─────────────────────────────────────┤
│  Event-Driven Architecture          │
└─────────────────────────────────────┘
```

### Core Technologies

| Technology | Purpose | Version |
|------------|---------|---------|
| **Java** | Primary Programming Language | JDK 17+ |
| **Swing** | GUI Framework | Built-in |
| **AWT** | Event Handling & Layout | Built-in |
| **Collections** | Data Management | java.util |

---

## 📦 Installation

### Prerequisites

Before you begin, ensure you have the following installed:

- ☕ **Java Development Kit (JDK)** 17 or higher
- 🔧 A Java IDE (IntelliJ IDEA, Eclipse, NetBeans) or text editor
- 💻 A terminal/command prompt

### Step-by-Step Setup

1️⃣ **Clone the Repository**

```bash
git clone https://github.com/mehedyk/library-management-system-java-gui.git
```

2️⃣ **Navigate to Project Directory**

```bash
cd library-management-system-java-gui
```

3️⃣ **Compile the Source Files**

```bash
cd src
javac *.java
```

4️⃣ **Run the Application**

```bash
java MainWindow
```

### Alternative: Using an IDE

1. Open your preferred Java IDE
2. Import the project as a Java project
3. Locate `MainWindow.java`
4. Run the `main()` method

---

## 🎯 Usage Guide

### 🔑 Default Credentials

#### Admin Access
```
Username: admin
Password: 1234
```

### 📖 Default Books Available

The system comes pre-loaded with classic literature:

| ID | Title | Author | Quantity |
|----|-------|--------|----------|
| 1 | The Catcher in the Rye | J.D. Salinger | 5 |
| 2 | To Kill a Mockingbird | Harper Lee | 3 |
| 3 | 1984 | George Orwell | 4 |

### 🎬 Quick Start Guide

#### For Administrators:

1. Launch the application
2. Click **"Login (Admin)"**
3. Enter admin credentials
4. Access the admin panel to:
   - Add new books
   - Remove existing books
   - View book inventory
   - View member list
   - Logout

#### For Members:

1. Launch the application
2. Click **"Register (Member)"** (first-time users)
3. Fill in registration details
4. Click **"Login (Member)"**
5. Enter your credentials
6. Access member panel to:
   - Browse available books
   - Borrow books
   - Return books
   - Logout

---

## 🏗️ Project Structure

```
library-management-system-java-gui/
│
├── src/
│   ├── MainWindow.java              # Entry point & main menu
│   ├── LibraryApp.java              # Application initialization
│   │
│   ├── Admin.java                   # Admin model
│   ├── AdminLoginWindow.java        # Admin login GUI
│   ├── AdminPanelWindow.java        # Admin dashboard
│   │
│   ├── Member.java                  # Member model
│   ├── MemberLoginWindow.java       # Member login GUI
│   ├── MemberPanelWindow.java       # Member dashboard
│   ├── MemberRegistrationWindow.java # Member registration GUI
│   ├── MemberManager.java           # Member operations
│   │
│   ├── Book.java                    # Book model
│   ├── BookManager.java             # Book operations
│   ├── AddBookWindow.java           # Add book GUI
│   │
│   └── Library.java                 # Library core logic
│
├── LICENSE                          # MIT License
└── README.md                        # Project documentation
```

---

## 🎨 Screenshots

### Main Menu
```
┌─────────────────────────────────┐
│  Library Management System      │
├─────────────────────────────────┤
│  [ Login (Admin) ]              │
│  [ Register (Member) ]          │
│  [ Login (Member) ]             │
│  [ Exit ]                       │
└─────────────────────────────────┘
```

### Admin Panel
```
┌─────────────────────────────────┐
│  Admin Panel                    │
├─────────────────────────────────┤
│  [ Add Book ]                   │
│  [ Remove Book ]                │
│  [ List Books ]                 │
│  [ Member List ]                │
│  [ Logout ]                     │
└─────────────────────────────────┘
```

### Member Panel
```
┌─────────────────────────────────┐
│  Member Panel                   │
├─────────────────────────────────┤
│  [ List Books ]                 │
│  [ Borrow a Book ]              │
│  [ Return a Book ]              │
│  [ Logout ]                     │
└─────────────────────────────────┘
```

---

## 🧩 Object-Oriented Design

### Core Principles Implemented

#### 🔒 Encapsulation
- Private fields with public getters/setters
- Data hiding in `Book`, `Member`, and `Admin` classes

#### 🎭 Abstraction
- Separation of concerns between GUI and business logic
- Manager classes handle operations abstractly

#### 🧬 Inheritance
- Potential for future role-based inheritance structure
- Extensible class hierarchy

#### 🔄 Polymorphism
- Method overriding capabilities
- Flexible event handling through ActionListener

### Class Relationships

```
LibraryApp (Static Container)
    ├── Library (Data Store)
    ├── BookManager (Operations)
    ├── MemberManager (Operations)
    └── Admin (Model)

Book (Model)
Member (Model)

Window Classes (GUI Layer)
    ├── MainWindow
    ├── AdminLoginWindow
    ├── AdminPanelWindow
    ├── MemberLoginWindow
    ├── MemberRegistrationWindow
    ├── MemberPanelWindow
    └── AddBookWindow
```

---

## 🚧 Future Enhancements

### 🎯 Planned Features

- [ ] **Database Integration**
  - MySQL/PostgreSQL support via JDBC
  - Persistent data storage
  - Transaction history

- [ ] **Enhanced GUI**
  - JTable for tabular data display
  - Custom icons and themes
  - Dark mode support
  - Responsive layouts

- [ ] **Advanced Features**
  - Book search functionality
  - Due date tracking
  - Fine calculation for late returns
  - Email notifications
  - Report generation (PDF/Excel)

- [ ] **Security Improvements**
  - Password encryption
  - Session management
  - Role-based permissions

- [ ] **Modern UI Framework**
  - JavaFX migration
  - Material Design implementation
  - Web-based interface (Spring Boot)

- [ ] **Additional Functionality**
  - Book reservations
  - Rating and review system
  - Recommendation engine
  - Multi-library support

---

## 🤝 Contributing

Contributions are what make the open-source community such an amazing place to learn, inspire, and create. Any contributions you make are **greatly appreciated**!

### How to Contribute

1. 🍴 Fork the Project
2. 🌿 Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. ✍️ Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. 📤 Push to the Branch (`git push origin feature/AmazingFeature`)
5. 🔃 Open a Pull Request

### Contribution Guidelines

- Follow Java naming conventions
- Comment your code appropriately
- Test thoroughly before submitting
- Update documentation as needed
- Maintain the existing code style

---

## 📄 License

This project is licensed under the **MIT License** - see the [LICENSE](LICENSE) file for details.

```
MIT License

Copyright (c) 2025 S.M. Mehedy Kawser

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction...
```

---

## 👨‍💻 Author

<div align="center">

### **S.M. Mehedy Kawser**

[![GitHub](https://img.shields.io/badge/GitHub-mehedyk-181717?style=for-the-badge&logo=github)](https://github.com/mehedyk)
[![LinkedIn](https://img.shields.io/badge/LinkedIn-mehedyk-0077B5?style=for-the-badge&logo=linkedin)](https://www.linkedin.com/in/mehedyk/)
[![Facebook](https://img.shields.io/badge/Facebook-mahdi.kawser-1877F2?style=for-the-badge&logo=facebook)](https://www.facebook.com/mahdi.kawser)

*Passionate Java Developer | OOP Enthusiast | GUI Design Specialist*

</div>

---

## 🙏 Acknowledgments

- ☕ Oracle for Java and Swing documentation
- 📚 Classic literature authors for default book data
- 💡 Open-source community for inspiration
- 🎓 Everyone who uses and contributes to this project

---

## 📞 Support

If you have any questions, issues, or suggestions:

- 🐛 [Open an Issue](https://github.com/mehedyk/library-management-system-java-gui/issues)
- 💬 Connect on [LinkedIn](https://www.linkedin.com/in/mehedyk/)
- 📘 Message on [Facebook](https://www.facebook.com/mahdi.kawser)

---

## ⭐ Show Your Support

If you found this project helpful, please consider giving it a ⭐ on GitHub!

```
   ⭐ Star this repository if you like it!
```

---

<div align="center">

### Made with ❤️ and ☕ by [MEHEDYK](https://github.com/mehedyk)

**Happy Coding!** 🚀

---

*Last Updated: October 2025*

</div>
