public class StringBufferDemo
{
	public static void main(String[] args)
	{
		StringBuffer buf = new StringBuffer("Fullstack Java Developer");

		// Original methods
		buf.append(" Job");                      // Fullstack Java Developer Job
		buf.insert(0, "Junior ");                // Senior Fullstack Java Developer Job

		System.out.println("1. After append/insert: " + buf);

		// NEW: lastIndexOf() - finds last occurrence
		int lastSpace = buf.lastIndexOf(" ");
		System.out.println("2. lastIndexOf(' '): " + lastSpace);  // 24

		// NEW: substring() - extracts portion
		String jobTitle = buf.substring(lastSpace + 1);  // "Job"
		System.out.println("3. substring(after last space): " + jobTitle);

		// Delete and reverse
		buf.delete(0, 7);                        // Fullstack Java Developer Job
		buf.reverse();                           // boJ repeleveD avaJ kcatsllufS

		System.out.println("4. After delete/reverse: " + buf);

		// NEW: toString() - converts to String
		String finalResult = buf.toString().toUpperCase();
		System.out.println("5. toString() + upper: " + finalResult);

		// Practical API response building
		System.out.println("\n--- Real-world Usage ---");
		StringBuffer response = new StringBuffer();
		response.append("User: ").append("Hitesh")
		.append(", Role: ").append("Developer")
		.append(", Status: ").append("Active");

		// Extract parts using substring and lastIndexOf
		int roleIndex = response.lastIndexOf(", Role: ");
		String rolePart = response.substring(roleIndex + 7, response.lastIndexOf(","));
		System.out.println("Extracted role: " + rolePart);  // "Developer"

		System.out.println("Final JSON-like response: " + response.toString());
	}
}
