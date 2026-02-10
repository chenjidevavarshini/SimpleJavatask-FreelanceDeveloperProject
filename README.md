# Simple Java REST API – Item Management System

This project is a **Spring Boot RESTful backend application** created as part of a freelance sample task. It demonstrates basic CRUD-style API design using **in-memory storage (ArrayList)** without a database.

---

## 📌 **Project Objective**

To build a simple Java backend that provides REST APIs to:

* Add a new item
* Retrieve an item by its ID

The application follows basic REST principles and includes input validation.

---

## 🛠️ **Technologies Used**

* Java 17
* Spring Boot
* Spring Web MVC
* Spring Validation
* Maven
* In-memory storage using `ArrayList`
* Deployed on **Render Cloud**

---

## 📦 **Data Model (Item)**

Each item contains the following fields:

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop"
}
```

| Field       | Type    | Description                   |
| ----------- | ------- | ----------------------------- |
| id          | Integer | Unique identifier of the item |
| name        | String  | Name of the item (required)   |
| description | String  | Short description of the item |

---

## 🌐 **Live Demo (Deployed URL)**

```
https://simple-java-task.onrender.com
```

> Note: This is a backend API, so the browser may show 404 or blank page — this is expected.

---

## 🔗 **API Endpoints**

### ➤ **1. Add a new Item (POST)**

**URL:**

```
POST https://simple-java-task.onrender.com/api/items
```

**Headers:**

```
Content-Type: application/json
```

**Request Body:**

```json
{
  "id": 1,
  "name": "Laptop",
  "description": "Gaming Laptop"
}
```

**Possible Responses:**

* `201 Created` → Item added successfully
* `400 Bad Request` → Missing or invalid fields

---

### ➤ **2. Get Item by ID (GET)**

**URL:**

```
GET https://simple-java-task.onrender.com/api/items/1
```

**Possible Responses:**

* `200 OK` → Returns the item
* `404 Not Found` → Item with given ID does not exist

---

## 🧪 **How to Test (Postman Instructions)**

1. Open **Postman**
2. Select **POST**
3. Paste:

```
https://simple-java-task.onrender.com/api/items
```

4. Choose **Body → raw → JSON**
5. Paste sample JSON and send request.

Then test GET with:

```
https://simple-java-task.onrender.com/api/items/1
```

---

## ▶️ **How to Run Locally**

### Step 1 — Clone the repository

```
git clone https://github.com/chenjidevavarshini/SimpleJavatask-FreelanceDeveloperProject.git
```

### Step 2 — Navigate to project

```
cd SimpleJavatask-FreelanceDeveloperProject
```

### Step 3 — Build the project

```
mvn clean package
```

### Step 4 — Run the application

```
java -jar target/*.war
```

The application will run at:

```
http://localhost:8080
```

---

## 🧱 **Storage Strategy**

* No database used
* All items are stored in an **in-memory ArrayList**
* Data is lost when the application restarts (intended for this task)

---

## 👩‍💻 **Author**

**Deva Varshini Chenji**
Java Full Stack Developer

GitHub:

```
https://github.com/chenjidevavarshini
```

Project Repository:

```
https://github.com/chenjidevavarshini/SimpleJavatask-FreelanceDeveloperProject
```

---

## ✅ **Task Completion Checklist**

| Requirement       | Status |
| ----------------- | ------ |
| Item Model        | ✔ Done |
| In-memory storage | ✔ Done |
| POST API          | ✔ Done |
| GET by ID         | ✔ Done |
| Input validation  | ✔ Done |
| Documentation     | ✔ Done |
| Live deployment   | ✔ Done |

---


















