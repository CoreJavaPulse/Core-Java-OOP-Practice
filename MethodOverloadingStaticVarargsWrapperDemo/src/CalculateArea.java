public class CalculateArea {
	
    // Circle: single double
    public double calcArea(double r) {
        return 3.14 * r * r;
    }
    
    // Rectangle: double first, double second  
    public double calcArea(double length, double breadth) {
        return length * breadth;
    }
    
    // Triangle: int first, double second (ORDER MATTERS)
    public double calcArea(int base, double height) {
        return 0.5 * base * height;
    }
    
    // Square: double first, int second (ORDER MATTERS)
    public double calcArea(double side, int unit) {
        return side * side;
    }
}
