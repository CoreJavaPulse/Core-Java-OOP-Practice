public class StringBuilderDemo
{
	public static void main(String[] args)
	{
		StringBuilder buf = new StringBuilder("Fullstack Java Developer");

		// Identical API to StringBuffer
		buf.append(" Job");                      
		buf.insert(0, "Junior ");                

		System.out.println("1. After append/insert: " + buf);

		int lastSpace = buf.lastIndexOf(" ");
		System.out.println("2. lastIndexOf(' '): " + lastSpace);

		String jobTitle = buf.substring(lastSpace + 1);
		System.out.println("3. substring(): " + jobTitle);

		buf.delete(0, 7);
		buf.reverse();
		System.out.println("4. After delete/reverse: " + buf);

		String finalResult = buf.toString().toUpperCase();
		System.out.println("5. toString(): " + finalResult);

		// Single-threaded API response (most common use)
		StringBuilder response = new StringBuilder();
		response.append("User: ").append("Hitesh")
		.append(", Role: ").append("Developer");
		System.out.println("API Response: " + response.toString());
	}
}
