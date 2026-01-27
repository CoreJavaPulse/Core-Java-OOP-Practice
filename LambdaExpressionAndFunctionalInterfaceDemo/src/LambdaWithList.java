import java.util.Arrays;
import java.util.List;

public class LambdaWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		numbers.stream()
		    .filter(n -> n % 2 == 0)  // Lambda: even numbers only
		    .forEach(n -> System.out.println(n));  // 2, 4
	}
}
