package staticExample;

public class StaticDemoMain {
	
	 
    public static void main(String[] args) {
    	StaticDemo staticDemoobj = new StaticDemo();
    	staticDemoobj.displayCount();  // Called via class name
        
        StaticDemo obj1 = new StaticDemo();
        obj1.increment();
        StaticDemo obj2 = new StaticDemo();
        obj2.increment();
        
        staticDemoobj.displayCount();  // Shared value: 12
    }

}
