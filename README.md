

---

# 🎉 **PlayHive – Full Stack Multi-Game Web Platform**

### *A Complete Gaming Experience with HTML/CSS/JS Frontend & Java Spring Boot Backend*

<p align="center">
  <img src="https://img.shields.io/badge/Java-007396?style=for-the-badge&logo=java&logoColor=white" />
  <img src="https://img.shields.io/badge/SpringBoot-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/Spring%20Data%20JPA-6DB33F?style=for-the-badge&logo=springboot&logoColor=white" />
  <img src="https://img.shields.io/badge/Hibernate-59666C?style=for-the-badge&logo=hibernate&logoColor=white" />
  <img src="https://img.shields.io/badge/Controller-FF6F61?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/Repository-0D9488?style=for-the-badge&logoColor=white" />
  <img src="https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white" />
  <img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" />
  <img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" />
  <img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" />
</p>


---

# 🌿 **Overview**

**PlayHive** is a **full-stack web gaming platform** offering multiple mini-games with:

* 🎮 MindLoop – Brain challenges
* 🧩 ShapeShifter – Puzzle & pattern game
* 😀 Emoji Decoder – Fun decoding game
* 💻 Syntax Sprint – Coding challenge game

It provides:

* 👤 User registration, login, and profile management
* 📊 Leaderboards & score tracking
* 🛠 Admin panel for platform management
* REST APIs backed by **Spring Boot** and **MySQL**

**Project Folders:**

```
PlayHive Frontend/  – HTML/CSS/JS
PlayHive Backend/   – Spring Boot + MySQL
```

---

# ⭐ **Key Features**

## 🎮 **Mini-Games**

* MindLoop – Brain challenges
* ShapeShifter – Puzzle & pattern game
* Emoji Decoder – Fun decoding game
* Syntax Sprint – Coding challenge game

Each game includes:

* Gameplay page
* Rulebook
* Leaderboard (where applicable)

---

## 👤 **User System**

* 🔐 Register & login
* 📄 Profile management
* 📝 Secure logout

---

## 🧭 **General Pages**

* Home, Games Overview, About Us, Contact, Features
* Admin Panel for monitoring users and games

---

## 🗂 **Backend Support**

* User authentication & authorization
* Score submission & leaderboard retrieval
* Database storage in MySQL
* REST APIs for frontend integration

---

# 🔧 **Technologies & Tools**

## 🎨 Frontend

* HTML5, CSS3, JavaScript (ES6)
* Media assets (JPEG, PNG)

## ⚙ Backend

* Java 17+, Spring Boot, Spring Web (REST APIs)
* Spring Data JPA & Hibernate ORM
* MySQL, Maven

## 🛠 Tools

* Eclipse / IntelliJ IDEA
* Git / GitHub
* Browser-based testing

---

# 🧱 **System Architecture**

```
          ┌──────────────────────────┐
          │        Frontend          │
          │  HTML / CSS / JS         │
          └──────────┬───────────────┘
                     │  HTTP Requests (Fetch API)
                     ▼
          ┌──────────────────────────┐
          │        Backend           │
          │  Spring Boot REST API    │
          ├──────────────────────────┤
          │  Auth Controller         │
          │  Score Controllers       │
          │  Services (Business)     │
          │  Repositories (JPA)      │
          └──────────┬───────────────┘
                     ▼
          ┌──────────────────────────┐
          │         MySQL            │
          │  Users / Scores Tables   │
          └──────────────────────────┘
```

---

# 🗂 **Project Structure**

### Frontend

```
PlayHive Frontend/
 ├── index.html
 ├── main.html
 ├── games.html
 ├── features.html
 ├── aboutus.html
 ├── contactus.html
 ├── login.html
 ├── register.html
 ├── profile.html
 ├── admin-panel.html
 │
 ├── mindloop.html
 ├── mindlooprulebook.html
 ├── mindloopleaderboard.html
 │
 ├── shapeshifter.html
 ├── shapeshifterrulebook.html
 ├── shapeshifterleaderboard.html
 │
 ├── emojidecoder.html
 ├── emojiedecoderrulebook.html
 │
 ├── syntaxsprint.html
 ├── syntaxsprintrulebook.html
 │
 └── media/
```

### Backend

```
PlayHive Backend/
 ├── pom.xml
 ├── mvnw, mvnw.cmd
 ├── src/
 │   ├── main/java/com/games/
 │   │   ├── controller/
 │   │   ├── model/
 │   │   ├── repository/
 │   │   ├── service/
 │   │   └── Gamenest1Application.java
 │   └── main/resources/
 │       ├── application.properties
 │       └── static/
 │           ├── login.html
 │           └── signup.html
 └── target/ (compiled output)
```

---

# 🌐 **API Overview**

**Authentication**

* POST `/auth/signup`
* POST `/auth/login`

**MindLoop**

* POST `/mindloop/score`
* GET `/mindloop/leaderboard`

**ShapeShifter**

* POST `/shapeshifter/score`
* GET `/shapeshifter/leaderboard`

*(Additional controllers can be documented automatically)*

---

# 🔗 **Frontend–Backend Integration**

Example: login request from frontend:

```javascript
fetch("http://localhost:8080/auth/login", {
  method: "POST",
  headers: { "Content-Type": "application/json" },
  body: JSON.stringify({
    email: userEmail,
    password: userPassword
  })
})
.then(res => res.json())
.then(data => console.log(data));
```

Leaderboard pages call backend endpoints to retrieve live scores dynamically.

---

# ▶️ **How to Run**

### Backend

```bash
cd PlayHive Backend
./mvnw spring-boot:run
```

Backend runs at: `http://localhost:8080`

### Frontend

* Open `PlayHive Frontend/index.html` in browser
* Or use **Live Server** for local hosting

---


---



# 🌟 **Future Enhancements**

* Add more games & levels
* Responsive & mobile-first UI
* JWT authentication & security
* Real-time multiplayer
* React / Next.js frontend migration
* Deployment on Render / Vercel / Railway
* Swagger & API documentation
* UML & database ER diagrams

---

# 👩‍💻 **Developed By**

**Akanksha Sawant**

---

# 🔗 **License**

This project is **for learning and personal use only**.
All code, design, and content are © **Akanksha Sawant – All Rights Reserved**.
❗ Copying, redistributing, or reusing without permission is prohibited.

---

