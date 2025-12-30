class StaticDemo {
    // Static variable
    static int count = 0;
    
    // Static block
    static {
        System.out.println("Static block executed.");
        count = 10;
    }
    
    // Static method
    static void displayCount() {
        System.out.println("Count: " + count);
    }
    
    // Non-static method (for contrast)
    void increment() {
        count++;
    }
}
