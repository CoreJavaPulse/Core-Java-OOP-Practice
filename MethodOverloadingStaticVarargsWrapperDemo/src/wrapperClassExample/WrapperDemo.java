package wrapperClassExample;
import java.util.ArrayList;
import java.util.List;

public class WrapperDemo {
    public static void main(String[] args) {
    	
        // Autoboxing: primitive to wrapper
        int primitiveInt = 42;
        Integer wrapperInt = primitiveInt;  // Automatic conversion
        
        // Unboxing: wrapper to primitive
        int unboxedInt = wrapperInt;
        
        // Utility method - String to primitive
        String strNum = "100";
        int parsedInt = Integer.parseInt(strNum);
        
        System.out.println("Primitive: " + primitiveInt);
        System.out.println("Wrapper: " + wrapperInt);
        System.out.println("Unboxed: " + unboxedInt);
        System.out.println("Parsed int: " + parsedInt);
    }
}
