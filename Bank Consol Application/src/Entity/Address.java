package Entity;

public class Address {
    
    // 1. Fields (private, final where appropriate)
    private final String city;
    private final String state;
    private final int pinCode;
    
    // 2. Constructor
    public Address(String city, String state, int pinCode) {
        this.city = city != null ? city.trim() : "Unknown";
        this.state = state != null ? state.trim() : "Unknown";
        this.pinCode = Math.max(100000, Math.min(999999, pinCode)); // Valid PIN range
    }
    
    // 3. Getters (immutable - no setters needed)
    public String getCity() {
        return city;
    }
    
    public String getState() {
        return state;
    }
    
    public int getPinCode() {
        return pinCode;
    }
    
    // 4. toString() - Professional format
    @Override
    public String toString() {
        return String.format("%s, %s - %06d", city, state, pinCode);
    }
    
    // 5. equals() + hashCode() for comparisons
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Address)) return false;
        
        Address other = (Address) obj;
        return pinCode == other.pinCode && 
               city.equals(other.city) && 
               state.equals(other.state);
    }
    
    @Override
    public int hashCode() {
        int result = city.hashCode();
        result = 31 * result + state.hashCode();
        result = 31 * result + pinCode;
        return result;
    }
}
