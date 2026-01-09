# 👨‍💼 Java Inheritance Hierarchy Demo

A comprehensive **Java console application** demonstrating **Inheritance**, **Constructor Chaining**, **Method Overriding**, **super keyword**, and **Runtime Polymorphism**.

## 🚀 Features Demonstrated
- ✅ **Multi-level Inheritance** - A → B, Father → Son
- ✅ **Constructor Chaining** - `super()` calls
- ✅ **Method Overriding** - `showAge()`, `show()`
- ✅ **super Keyword** - Access parent class members
- ✅ **Encapsulation** - Private fields + getters/setters
- ✅ **Runtime Polymorphism** - Manager, Developer hierarchy

  ## 🎯 Java OOP Concepts Demonstrated

- **Inheritance**  
  `extends` keyword creates **IS-A relationship** - `Manager IS-A Employee`

- **Constructor Chaining**  
  `super(empId, empName, empSalary)` calls **parent constructor** first

- **Method Overriding**  
  Child class **redefines** parent method - `Son.showAge()` calls `Father.showAge()`

- **super Keyword**  
  `super.showAge()`, `super.x` - **access parent class** members

- **Encapsulation**  
  Private fields + **public getters/setters** - controlled data access

- **Runtime Polymorphism**  
  Same method call, **different behavior** based on object type


## 🧩 Inheritance Hierarchy
```text
Level 1: Basic Inheritance (A → B)
A ──(extends)──> B

Level 2: Father-Son
Father ──(extends)──> Son

Level 3: Employee Hierarchy
Employee ──┬── Manager (bonus)
└── Developer (hours)
```

## 🛠️ Tech Stack
- **Java 8+**
- **Inheritance & Polymorphism**
- **Constructor Chaining**

## 📥 Setup & Run
```bash
git clone https://github.com/CoreJavaPulse/Java-Inheritance-Demo.git
cd Java-Inheritance-Demo
javac *.java
java Inheritance1
java EmployeeMain  
java MainClass

  ```
## 👨‍💻 Author
**Hitesh Mane**  
Java Full Stack Developer | Pune, India  
📧 Email : hiteshmane5hm@gmail.com 
💻 GitHub : https://github.com/CoreJavaPulse


