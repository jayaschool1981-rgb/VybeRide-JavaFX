<h1 align="center">🚗 Vybe Ride — JavaFX Ride-Sharing Application</h1>

<p align="center">
  <b>A modern desktop-based ride-sharing prototype built with JavaFX and MySQL</b><br>
  <i>Vybe Ride simulates a real-world booking system with login, signup, and dashboard modules.</i>
</p>

<p align="center">
  <img src="https://img.shields.io/badge/JavaFX-UI-blue?style=flat-square"/>
  <img src="https://img.shields.io/badge/MySQL-Database-green?style=flat-square"/>
  <img src="https://img.shields.io/badge/Maven-Build-orange?style=flat-square"/>
  <img src="https://img.shields.io/badge/Java-17%2B-red?style=flat-square"/>
</p>

---

## 📘 Project Overview

**Vybe Ride** is a **desktop-based ride-sharing prototype** designed to simulate an interactive login and signup workflow using **JavaFX**, **MySQL**, and **JDBC**.

The project demonstrates a strong foundation in JavaFX UI development, database connectivity, and MVC-based modular design — ideal for showcasing full-stack desktop app development skills.

---

## 🧠 Features

✅ **User Authentication**
- Secure login and signup pages connected to a MySQL database  
- Error handling for invalid credentials  

✅ **Modular Architecture (MVC)**
- Clean separation of UI, controller logic, and database connections  

✅ **Database Integration**
- JDBC connectivity to MySQL  
- Easy configuration via `DatabaseConnection.java`  

✅ **Future Enhancements**
- Password hashing for security  
- CRUD operations (ride management)  
- Admin panel for monitoring rides  

---

## 🧩 Tech Stack

| Category | Technologies Used |
|-----------|------------------|
| **Frontend (UI)** | JavaFX (FXML) |
| **Backend (Logic)** | Java 17+ |
| **Database** | MySQL |
| **Build Tool** | Maven |
| **Architecture** | MVC (Model-View-Controller) |

---

## 🏗️ Project Structure
VybeRide-JavaFX/
│
├── VybeRide/
│ ├── src/main/java/com/vyberide/
│ │ ├── controllers/
│ │ │ ├── LoginController.java
│ │ │ └── SignupController.java
│ │ ├── database/
│ │ │ └── DatabaseConnection.java
│ │ ├── Main.java
│ │ └── Launcher.java
│ │
│ ├── src/main/resources/
│ │ └── fxml/
│ │ ├── login.fxml
│ │ └── signup.fxml
│ │
│ └── pom.xml
│
├── VybeRide.sql
└── README.md




---

## ⚙️ Setup Instructions

### 1️⃣ Prerequisites
- Java **17 or higher**
- MySQL Server installed
- IntelliJ IDEA (recommended)
- Maven plugin configured

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/jayaschool1981-rgb/VybeRide-JavaFX.git




3️⃣ Set Up Database

Open MySQL Workbench or CLI

Run the SQL script:

source VybeRide.sql;
Update credentials in DatabaseConnection.java:
private static final String USER = "root";
private static final String PASSWORD = "your_password_here";
4️⃣ Run the Application

In IntelliJ, right-click Launcher.java → Run

📸 Preview
Login Screen	Signup Screen

	🧩 Future Improvements

Add ride booking dashboard

Implement password hashing (bcrypt)

Add CRUD operations for ride data

Integrate maps API for route simulation

👨‍💻 Author

Om Barvekar
🎓 Computer Science Student | 💻 Java & Full-Stack Developer
🌐 GitHub
 • LinkedIn
 • Instagram

🪪 License

This project is licensed under the MIT License — you are free to modify and distribute with attribution.

⭐ If you like this project, consider giving it a star on GitHub!



---

## ✅ What this README includes:
- Beautifully formatted **header and badges**
- Full **project overview**
- Clear **setup instructions**
- Table of **features & tech stack**
- Future roadmap
- Social links + license  

---

Would you like me to **generate a GitHub banner image (cover art)** for your README (something like “🚗 Vybe Ride | JavaFX Ride-Sharing App” with modern gradient)?  
It will appear on top and make your repo instantly eye-catching.

