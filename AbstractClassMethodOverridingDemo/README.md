# 📐 OVERRIDDING Examples

A **Java console application** demonstrating **Abstract Classes**, **Inheritance**, **Polymorphism**, and **Runtime Method Dispatch** using Shape hierarchy.

## 🚀 Features
- ✅ **Abstract Base Class** `Shape` with `area()` method
- ✅ **Circle** - πr² calculation
- ✅ **Triangle** - (1/2)×base×height calculation
- ✅ **Runtime Polymorphism** - Same reference, different objects
- ✅ **Method Overriding** - Shape-specific area formulas

  ## 🎯 Java OOP Concepts Demonstrated

- **Abstract Class**  
  `Shape` **cannot be instantiated** - forces concrete subclasses

- **Method Overriding**  
  Each shape **implements `area()` differently** - Circle: πr², Triangle: ½bh

- **Runtime Polymorphism**  
  `Shape s = new Circle()` → **Circle's `area()` executes** at runtime

- **Encapsulation**  
  Private fields (`radius`, `base`, `height`) with **constructor initialization**

- **Upcasting**  
  Child object (`Circle`, `Triangle`) to **parent reference** (`Shape s`)


## 🧩 Class Hierarchy
```text
Shape (Abstract)
↑ extends
├── Circle (radius)
├── Triangle (base, height)
└── ShapeMain (Polymorphism Demo)
```

## 🛠️ Tech Stack
- **Java 8+**
- **Abstract Classes**
- **Polymorphism**
- **Inheritance**

## 📥 Setup & Run
```bash
git clone https://github.com/CoreJavaPulse/Shape-Polymorphism-Demo.git
cd Shape-Polymorphism-Demo
javac *.java
java ShapeMain
```

## 👨‍💻 Author
**Hitesh Mane**  
Java Full Stack Developer | Pune, India  
📧 Email : hiteshmane5hm@gmail.com 
💻 GitHub : https://github.com/CoreJavaPulse

