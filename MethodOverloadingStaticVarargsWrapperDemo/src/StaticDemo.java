import static java.lang.System.out; 
class StaticDemo {
    // Static variable
    static int count = 0;
    
    // Static block
    static {
        out.println("Static block executed.");
        count = 10;
    }
    
    // Static method
    static void displayCount() {
        out.println("Count: " + count);
    }
    
    // Non-static method (for contrast)
    void increment() {
        count++;
    }
}
