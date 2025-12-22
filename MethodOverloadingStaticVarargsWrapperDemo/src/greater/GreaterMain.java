package greater;
public class GreaterMain {
	
    public static void main(String[] args)
    {
        GreaterFinder finder = new GreaterFinder();
        
        // Test int overloading
        int maxInt = finder.greater(25, 18);
        System.out.println("Greater int (25,18): " + maxInt);
        
        // Test float overloading  
        float maxFloat = finder.greater(9.75f, 12.3f);
        System.out.println("Greater float (9.75,12.3): " + maxFloat);
        
        // Test char overloading
        char maxChar = finder.greater('Z', 'A');
        System.out.println("Greater char ('Z','A'): " + maxChar);
    }
}
