package greater;
public class GreaterFinder {
    
    // Greater between 2 ints
    public int greater(int a, int b) {
        return (a > b) ? a : b;
    }
    
    // Greater between 2 floats  
    public float greater(float a, float b) {
        return (a > b) ? a : b;
    }
    
    // Greater between 2 chars (ASCII comparison)
    public char greater(char a, char b) {
        return (a > b) ? a : b;
    }
}
