# 📐 InterfaceExamples

A **Java console application** demonstrating **Interface Implementation**, **Polymorphism**, and **Abstract Contract** using Shape interface with Rectangle class.

## 🚀 Features
- ✅ **Interface Implementation** - `implements Shape`
- ✅ **Method Overriding** - `findarea()`, `sayThanks()`
- ✅ **Encapsulation** - Private fields + constructor
- ✅ **Polymorphism Ready** - Can work with Shape reference

  ## 🎯 Java OOP Concepts Demonstrated

- **Interface Implementation**  
  `implements Shape` - **Contract adherence** to abstract methods `findarea()`, `sayThanks()`

- **Method Overriding**  
  **Concrete implementation** of abstract interface methods in Rectangle class

- **Encapsulation**  
  Private `length`, `breadth` fields with **controlled access** through constructor

- **Polymorphism**  
  `Shape rect = new Rectangle()` - **Parent reference, child object** runtime behavior

## 🧩 Class Structure
```text
Shape (Interface)
↑ implements
Rectangle
├── length (double)
├── breadth (double)
├── findarea() → length * breadth
└── sayThanks() → "Rectangle Thanks"
```

## 🛠️ Tech Stack
- **Java 8+**
- **Interfaces & Polymorphism**
- **Method Overriding**

## 📥 Setup & Run
```bash
git clone https://github.com/CoreJavaPulse/Rectangle-Shape-Demo.git
cd Rectangle-Shape-Demo
javac *.java
java MainClass
```
## 👨‍💻 Author
**Hitesh Mane**  
Java Full Stack Developer | Pune, India  
📧 Email : hiteshmane5hm@gmail.com 
💻 GitHub : https://github.com/CoreJavaPulse


