package DAY2;
import java.util.Scanner;

public class EligibleVote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age: ");
		a= sc.nextInt();
		if(a>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			System.out.println("Not eligible");
		}
	}

}
