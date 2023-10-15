package DAY2;
import java.util.Scanner;

public class SwitchCaseGrade {

	public static void main(String[] args) {
		int avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your avg marks: ");
		avg= sc.nextInt();
		switch(avg/10) {
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		case 5:
			System.out.println("E");
			break;
		default:
			System.out.println("Fail");
	}

	}

}
