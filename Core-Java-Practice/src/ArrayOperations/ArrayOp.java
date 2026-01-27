package ArrayOperations;
import java.util.Scanner;

public class ArrayOp {

	Scanner sc = new Scanner(System.in);

	public int[] create(int n) {
		// TODO Auto-generated method stub
		int arr[] = new int[n];
		System.out.println("Enter The Elements In The Arrray");
		for(int i=0;i<n;i++)
		{
			arr[i] = sc.nextInt();
		}
		return arr;
	}

	public void display(int[] arr) {
		// TODO Auto-generated method stub
		System.out.print("The Elements In The Array Are: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}	
		System.out.println(" ");
	}

	public void search(int arr[],int ser) {
		// TODO Auto-generated method stub
		boolean found = false;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ser) {
				System.out.println(ser + " Element Found At " + (i+1) + " Position.");
				found = true;
			}
		}
		if(!found) {
			System.out.println("Element Not Found!");
		}
	}

	public int[] insertpos(int arr[],int element, int pos)
	{
		if(pos < 1 || pos > arr.length + 1)
		{
			System.out.println("Invalid Position! (1 to " + (arr.length + 1) + ")");
			return arr;
		}

		int[] newArr = new int[arr.length + 1];
		for(int i = 0; i < pos - 1; i++) {
			newArr[i] = arr[i];
		}
		newArr[pos - 1] = element;
		for(int i = pos - 1; i < arr.length; i++) {
			newArr[i + 1] = arr[i];
		}
		arr = newArr;
		System.out.println("Element " + element + " inserted at position " + pos);
		return arr;
	}

	public int[] delete(int arr[],int element) {
		int index = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == element) {
				index = i;
				break;
			}
		}
		if(index == -1) {
			System.out.println("Element " + element + " Not Found!");
			return arr;
		}

		int[] newArr = new int[arr.length - 1];
		for(int i = 0; i < index; i++) {
			newArr[i] = arr[i];
		}
		for(int i = index + 1; i < arr.length; i++) {
			newArr[i - 1] = arr[i];
		}
		arr = newArr;
		System.out.println("Element " + element + " deleted successfully!");
		return arr;
	}

	public void sort(int[] arr) {
		// TODO Auto-generated method stub
		for(int i = 0; i < arr.length-1; i++)//3
		{     
			for(int j = 0; j < arr.length-1-i; j++)//3-1-0 
			{ 
				if(arr[j] > arr[j+1])
				{               
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}
}
