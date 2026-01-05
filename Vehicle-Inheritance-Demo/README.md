# 🚗 AutoMobile Showroom Management System

A **Java console-based showroom application** demonstrating **Multiple Interface Inheritance**, **Polymorphism**, **Nested Menu System**, and **toString() overriding** for vehicle catalog display.

## 🚀 Features
- ✅ **Multi-level Interface Hierarchy** - `AutoMobile` ← `Bike`
- ✅ **Nested Menu System** - Car/Bike → Brand selection
- ✅ **Polymorphism** - Single `display()` method for all vehicles
- ✅ **Complete Vehicle Catalog** - Maruti, Toyota, HeroHonda, TVS
- ✅ **toString() Override** - Formatted vehicle details display

  ## 🎯 Java OOP Concepts Demonstrated

- **Interface Implementation**  
  **Multiple interface hierarchy** - Classes implement `AutoMobile`/`Bike` contracts

- **Multiple Inheritance**  
  `Bike extends AutoMobile` - **Interface-level multiple inheritance**

- **Polymorphism**  
  Single `display()` method works for **all vehicle types** - Cars & Bikes

- **Method Overriding**  
  Custom `toString()` for **each vehicle** - formatted Model/Color/Price/CC display

- **Nested Loops**  
  **Multi-level menu navigation** - Main → Car/Bike → Brand selection

## 🧩 Interface & Class Hierarchy
```text
AutoMobile (Interface)
├── getModel(), getPrice(), getColor()
↑ extends
Bike (Interface) → +getcc()

Maruti ──┐
Toyota ──┤ implements AutoMobile
HeroHonda ─┐
TVS ───────┘ implements Bike
```

## 🛠️ Tech Stack
- **Java 8+**
- **Interface Implementation**
- **Polymorphism**
- **Scanner Menus**

## 📥 Setup & Run
```bash
git clone https://github.com/CoreJavaPulse/AutoMobile-Showroom-Demo.git
cd AutoMobile-Showroom-Demo
javac *.java
java AutoMobileMain
```

## 👨‍💻 Author
**Hitesh Mane**  
Java Full Stack Developer | Pune, India  

📧 **Email**: [hiteshmane5hm@gmail.com](mailto:hiteshmane5hm@gmail.com)  
💻 **GitHub**: [CoreJavaPulse](https://github.com/CoreJavaPulse)  
📍 **Location**: Pune, Maharashtra  
