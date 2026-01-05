# ⚙️ Java Advanced Features Demo

A comprehensive **Java console application** demonstrating **Method Overloading**, **Method Overriding**, **Static Members**, **VarArgs**, and **Wrapper Classes**.

## 🚀 Features Demonstrated
- ✅ **Method Overloading** - Multiple `calcArea()` & `greater()` methods
- ✅ **Static Blocks/Variables/Methods** - Class-level initialization
- ✅ **VarArgs** - Variable length arguments `int... args`
- ✅ **Wrapper Classes** - Autoboxing & Unboxing demo
- ✅ **Static Import** - `import static java.lang.System.out`

## 🎯 Java Concepts Demonstrated

- **Method Overloading**  
  Same method name, **different parameters** - `calcArea(double)`, `calcArea(double,double)`, etc.

- **Static Members**  
  **Class-level** variables (`static int count`), methods (`static void displayCount()`), blocks (`static {}`)

- **VarArgs**  
  `int... args` for **variable arguments** - `sum(1,2)`, `sum(1,2,3)`, `sum()`

- **Autoboxing/Unboxing**  
  `int` ↔ `Integer` **automatic conversion** - `Integer wrapperInt = 42;`

- **Static Import**  
  Direct `out.println()` usage - `import static java.lang.System.out`


## 🧩 Class Structure
```text
CalculateArea
├── calcArea(double) → Circle πr²
├── calcArea(double, double) → Rectangle
├── calcArea(int, double) → Triangle
├── calcArea(double, int) → Square

GreaterFinder
├── greater(int,int) → Integer comparison
├── greater(float,float) → Float comparison
└── greater(char,char) → Char comparison

VarArgs → sum(int... args)
StaticDemo → Static members demo
WrapperDemo → Autoboxing demo
```

## 🛠️ Tech Stack
- **Java 8+** (VarArgs, Generics, Wrappers)
- **Static Imports**
- **Method Overloading**

## 📥 Setup & Run
```bash
git clone https://github.com/CoreJavaPulse/Java-Advanced-Features-Demo.git
cd Java-Advanced-Features-Demo

# Compile all
javac *.java
```
## 👨‍💻 Author
**Hitesh Mane**  
Java Full Stack Developer | Pune, India
📧 Email : hiteshmane5hm@gmail.com 
💻 GitHub : https://github.com/CoreJavaPulse
