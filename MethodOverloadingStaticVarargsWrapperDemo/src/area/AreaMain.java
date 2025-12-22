package area;
public class AreaMain {
	
    public static void main(String[] args) {
    	
        CalculateArea area = new CalculateArea();
        System.out.println("Circle: " + area.calcArea(5.0));           // (double)
        System.out.println("Rectangle: " + area.calcArea(5.0, 4.0));   // (double,double)  
        System.out.println("Triangle: " + area.calcArea(5, 4.0));      // (int,double)
        System.out.println("Square: " + area.calcArea(5.0, 1));        // (double,int)
    }
}
