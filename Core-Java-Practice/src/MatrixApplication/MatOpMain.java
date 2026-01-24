package MatrixApplication;
import java.util.Scanner;

public class MatOpMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		MatrixOp mobj = new MatrixOp();
		String choice = null;
		do {
			System.out.println("---------------------------Main Menu-----------------------");
			System.out.println("1:Create Matrix 1\n2:Display\n3:Addition\n4:Subtraction\n5:Multiplication\n6:Transpose"
					+ "\n7:Sort Matrix Elements");
			System.out.println("Enter Your Choice");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1:
				mobj.createMatrix();
				break;
			case 2:
				mobj.displayMatrix();
				break;
			case 3:
				mobj.addMatrices();
				break;
			case 4:
				mobj.subMatrices();
				break;
			case 5:
				mobj.multiplyMatrices();
				break;
			case 6:
				mobj.transposeMatrix();
				break;
			case 7:
				mobj.sortMatrixElements();
				break;
			default:
				System.out.println("Enter Valid Choice!\n");
				break;
			}
			System.out.println("DO You Want To Continue.\nEnter Yes Or No");
			choice = sc.next();
		}while(choice.equalsIgnoreCase("yes"));
		System.out.println("----------------------------Thank You-------------------------");
		sc.close();

	}

}
