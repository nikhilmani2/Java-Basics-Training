package DAY2;
import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input for a: ");
		a= sc.nextInt();
		if(a%2==0)
		{
			System.out.println("The number is even");
		
		}
		else
		{
			System.out.println("The number is odd");
		}

	}

}
