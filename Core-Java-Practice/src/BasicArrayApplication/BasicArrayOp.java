package BasicArrayApplication;

public class BasicArrayOp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Traversing Array
		int[] arr = {12, 4, 5, 2, 5};
		System.out.println("Using for loop:");
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Element " + i + ": " + arr[i]);
		}
		System.out.println("Using for-each:");
		for (int i : arr) {
			System.out.println(i);
		}

		//Largest Value
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Largest element: " + max);

		//Sum Of Array Elements.
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		System.out.println("Sum: " + sum);
		
		//Copy Array.
		 int arr1[] = new int[arr.length];
	        for (int i = 0; i < arr.length; i++) {
	            arr1[i] = arr[i];
	        }
	        System.out.print("Copied array: ");
	        for (int num : arr1)
	            System.out.print(num + " ");
	        
	    //Reversed Array.
	        int left = 0, right = arr.length - 1;
	        while (left < right) {
	            int temp = arr[left];
	            arr[left] = arr[right];
	            arr[right] = temp;
	            left++;
	            right--;
	        }
	        System.out.print("\nReversed Array: ");
	        for (int num : arr)
	            System.out.print(num + " ");
	}
}
