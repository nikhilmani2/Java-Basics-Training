package DAY2;
import java.util.Scanner;

public class GradeAssign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks: ");
		marks= sc.nextInt();
		if(marks>=90)
		{
			System.out.println("A Grade");
		}
		else if(marks>=80)
		{
			System.out.println("B Grade");
		}
		else if(marks>=70)
		{
			System.out.println("C Grade");
		}
		else if(marks>=60)
		{
			System.out.println("D Grade");
		}
		else if(marks>=50)
		{
			System.out.println("E Grade");
		}
		else
		{
			System.out.println("Fail");
		}
		
	}

}
