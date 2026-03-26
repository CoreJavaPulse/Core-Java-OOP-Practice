import java.util.*;

public class LegacyExample {

    public static void main(String[] args) {

        // 1️⃣ Vector (old ArrayList)
        Vector<String> v = new Vector<>();
        v.add("Apple");
        v.add("Banana");
        v.add("Mango");

        System.out.println("Vector Elements:");
        Enumeration<String> e = v.elements();  // old iterator

        while (e.hasMoreElements()) {
            System.out.println(e.nextElement());
        }

        // 2️⃣ Stack
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(20);
        s.push(30);

        System.out.println("\nStack Elements:");
        while (!s.isEmpty()) {
            System.out.println(s.pop()); // LIFO
        }

        // 3️⃣ Hashtable (old HashMap)
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(1, "One");
        ht.put(2, "Two");
        ht.put(3, "Three");

        System.out.println("\nHashtable Elements:");
        for (Map.Entry<Integer, String> entry : ht.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}