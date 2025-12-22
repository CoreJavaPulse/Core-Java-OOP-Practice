// Functional interface
interface Math {
    int calc(int a, int b);
}

public class Calculator {
    public static void main(String[] args) {
        // Lambda examples
        Math add = (a, b) -> a + b;
        Math multiply = (a, b) -> a * b;
        
        System.out.println(add.calc(5, 3));      // 8
        System.out.println(multiply.calc(5, 3)); // 15
    }
}
