# Core Java OOP Practice Projects

This repository contains **simple and honest Core Java console programs** created to practice **Object-Oriented Programming (OOP) fundamentals**.
Each project name directly reflects **what the code actually demonstrates**, making this repository ideal for **Java freshers and beginners**.

---

## 📁 Project Structure

```
Core-Java-OOP-Practice
│
├── Employee-Class-Demo
│   ├── Employee.java
│   └── EmployeeMain.java
│
├── Product-Class-Demo
│   ├── Product.java
│   └── ShopMain.java
│
└── Customer-Shopping-OOP-Demo
    ├── Address.java
    ├── Customer.java
    ├── Product.java
    ├── ShopInfo.java
    └── ShopMain.java
```

Each folder is an **independent Core Java program** focusing on specific OOP concepts.

---

## 🧑‍💼 Employee-Class-Demo

### 🔹 Employee.java

**Purpose:**
Demonstrates a basic Java class using encapsulation.

**What this class contains:**

* Private data members

  * `employeeId`
  * `employeeName`
  * `employeeSalary`
* Constructors

  * Default constructor
  * Parameterized constructor
* Getter and Setter methods
* `toString()` method

**OOP Concepts Practiced:**

* Class & Object
* Encapsulation
* Constructors
* Data hiding

---

### 🔹 EmployeeMain.java

**Purpose:**
Acts as the driver class for testing the `Employee` object.

**Responsibilities:**

* Creates `Employee` object
* Assigns values
* Displays employee details

**Concepts Used:**

* Object creation
* Method calling

---

## 📦 Product-Class-Demo

### 🔹 Product.java

**Purpose:**
Represents a simple product entity.

**Attributes:**

* Product ID
* Product Name
* Product Price

**Features:**

* Constructors
* Getter and Setter methods
* `toString()` for output

**Concepts Used:**

* Encapsulation
* Class design

---

### 🔹 ShopMain.java

**Purpose:**
Tests the `Product` class by creating and displaying a product object.

**Concepts Used:**

* Object instantiation
* Data display

---

## 🏬 Customer-Shopping-OOP-Demo

This project focuses on **HAS-A (Composition) relationships** in Java.

---

### 🔹 Address.java

**Purpose:**
Represents address details of a customer.

**Attributes:**

* City
* State
* Pincode

**Concepts Used:**

* Encapsulation
* Reusable class design

---

### 🔹 Customer.java

**Purpose:**
Models a customer with an address.

**Attributes:**

* Customer ID
* Customer Name
* Address object

**Concepts Used:**

* HAS-A relationship (Composition)
* Object nesting

---

### 🔹 Product.java

**Purpose:**
Represents a product associated with the customer.

**Attributes:**

* Product ID
* Product Name
* Product Price

---

### 🔹 ShopInfo.java

**Purpose:**
Handles object creation and linking between Customer, Address, and Product.

**Key Methods:**

* `create()` – Creates and connects all objects
* `display()` – Displays complete customer and product information

**Concepts Used:**

* Object collaboration
* Method abstraction

---

### 🔹 ShopMain.java

**Purpose:**
Entry point of the shopping OOP demo.

**Program Flow:**

1. Create `ShopInfo` object
2. Call `create()` method
3. Call `display()` method

---

## 🎯 Core Java Concepts Covered

* Classes & Objects
* Encapsulation
* Constructors
* Getter & Setter methods
* `this` keyword
* HAS-A Relationship (Composition)
* Console-based execution

---

## ▶️ How to Run

1. Clone the repository

   ```bash
   git clone <your-repo-url>
   ```
2. Open the project in **Eclipse / IntelliJ / VS Code**
3. Run the `Main` class of each folder

---
## 📌 Author

**Hitesh Mane**
Java Full Stack Developer (Fresher)

---

⭐ This repository focuses on **clarity, correctness, and fundamentals** — the right approach for mastering Core Java.
