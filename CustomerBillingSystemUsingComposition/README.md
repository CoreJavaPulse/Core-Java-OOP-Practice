# 🛒 E-Shopping Bill Generator System

A complete **Java console-based shopping application** with **customer management**, **product cart**, **GST billing**, and **address handling**. Demonstrates **composition**, **arrays**, and **business logic**.

## 🚀 Features
- ✅ **Customer Registration** - ID, Name, Mobile, Address
- ✅ **Dynamic Product Cart** - Multiple products with quantity
- ✅ **Automatic GST Calculation** - CGST(6%) + SGST(6%)
- ✅ **Complete Billing** - Bill number, date, totals
- ✅ **Formatted Display** - Customer, products, bill details
- ✅ **Array Handling** - Product array management

  ## 🎯 Java OOP Concepts Demonstrated

- **Composition**  
  `Customer HAS-A Address + Product[]` - **strong ownership relationship**

- **Encapsulation**  
  Private fields + **complete getters/setters** - data protection & access control

- **Array Handling**  
  **Dynamic product array** creation - `Product prodArr[] = new Product[n]`

- **Business Logic**  
  **GST calculation** - CGST(6%) + SGST(6%) = 12% total tax

- **Date API**  
  `java.util.Date` for **real-time billing timestamps**

- **Method Organization**  
  **Separation of concerns** - `create()`, `calculateBill()`, `display()`

## 🧩 Class Structure
```text
Customer → Address + Product[]
Product → ID + Name + Price + Quantity
Bill → Number + Date + CGST + SGST + Total
ShopInfo → Business Logic (create, calculate, display)
ShopMain → Main Driver
```

## 🛠️ Tech Stack
- **Java 8+** (Date API)
- **Scanner** for console input
- **Arrays** for product cart
- **OOP Composition**

## 📥 Setup & Run
```bash
git clone https://github.com/CoreJavaPulse/EShopping-Bill-Generator.git
cd EShopping-Bill-Generator
javac *.java
java ShopMain
```

## 👨‍💻 Author
**Hitesh Mane**  
Java Full Stack Developer | Pune, India  

📧 **Email**: [hiteshmane5hm@gmail.com](mailto:hiteshmane5hm@gmail.com)  
💻 **GitHub**: [CoreJavaPulse](https://github.com/CoreJavaPulse)  
📍 **Location**: Pune, Maharashtra  
