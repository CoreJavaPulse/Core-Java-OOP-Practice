public class StringMethodsDemo {

	public static void main(String[] args)
	{
		String text = "  Java Developer Hitesh!  ";
		String email = "Hiteshmane5hm@gmail.com";
		String csvData = "Hitesh,Mane,25,Engineer";
		String url = "/api/users/profile";

		// Basic methods
		System.out.println("1. length(): " + text.length());                    // 22
		System.out.println("2. charAt(3): " + text.charAt(3));                   // a

		// Substring operations
		System.out.println("3. substring(2): " + text.substring(2));             // Java Developer Job!  
		System.out.println("4. substring(2,6): " + text.substring(2,6));         // Java

		// Search methods
		System.out.println("5. indexOf('J'): " + text.indexOf('J'));             // 2
		System.out.println("6. lastIndexOf('!'): " + text.lastIndexOf('!'));     // 23

		// Comparison methods
		System.out.println("7. equals(): " + "Java".equals("java"));             // false
		System.out.println("8. equalsIgnoreCase(): " + "Java".equalsIgnoreCase("java")); // true

		// Case conversion
		System.out.println("9. toLowerCase(): " + text.toLowerCase());           
		System.out.println("10. toUpperCase(): " + text.toUpperCase());

		// Trimming & validation
		System.out.println("11. trim(): '" + text.trim() + " ");                 // "Java Developer Job!"
		System.out.println("12. isEmpty(): " + text.isEmpty());                    // true

		// Search & validation
		System.out.println("13. contains('Dev'): " + text.contains("Dev"));      // true
		System.out.println("14. startsWith('  '): " + text.startsWith("  "));    // true
		System.out.println("15. endsWith('!  '): " + text.endsWith("!  "));      // true

		// Replacement
		System.out.println("16. replace(' ', '-'): " + text.replace(' ', '-'));  
		System.out.println("17. replaceAll('\\s+', '_'): " + text.replaceAll("\\s+", "_")); // Multiple spaces

		// Parsing
		System.out.println("18. split(','): " + java.util.Arrays.toString(csvData.split(","))); // [Hitesh, Mane, 25, Engineer]

		// Practical API validation
		System.out.println("\n--- API Validation Examples ---");
		System.out.println("Email endsWith .com: " + email.endsWith(".com"));     // true
		System.out.println("API startsWith /api: " + url.startsWith("/api"));     // true
		System.out.println("CSV split result: " + csvData.split(",")[0]);        // Hitesh
	}
}
