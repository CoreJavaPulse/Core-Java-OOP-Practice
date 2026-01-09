# 🛒 Customer Product Management System

A console-based **Java application** for managing customers with their products and addresses. Demonstrates **OOP principles** - Encapsulation, Composition, and Class Relationships.

## 🚀 Features
- ✅ Customer management with mobile numbers
- ✅ Address details (City, State, Pincode)
- ✅ Product catalog (ID, Name, Price, Quantity)
- ✅ Complete encapsulation with getters/setters
- ✅ Modular class design

## 🎯 OOP Concepts Demonstrated

- **Encapsulation**  
  Private fields (`customerId`, `mobNo`, etc.) with complete **getters/setters** for controlled access
- **Composition**  
  `Customer HAS-A` `Address` & `Product` - strong **"owns" relationship** through object references
- **Constructor Chaining**  
  Full parameterized constructors ensure **complete object initialization** from creation
- **Class Relationships**  
  **One-to-One mapping**: Each Customer owns exactly **1 Address + 1 Product**
  
## 🧩 Class Structure
```text
Customer
├── Address (Composition)
└── Product (Composition)
Address → city + state + pincode
Product → ID + name + price + quantity

``` 
## 🛠️ Tech Stack
- **Java** (JDK 17+)
- **Eclipse/VS Code**
- **OOP Principles**

## 📥 Setup & Run
```bash
git clone https://github.com/CoreJavaPulse/Customer-Product-Management.git
cd Customer-Product-Management
```
## 👨‍💻 Author
**Hitesh Mane**  
Java Full Stack Developer | Pune, India  
📧 Email : hiteshmane5hm@gmail.com 
💻 GitHub : https://github.com/CoreJavaPulse


