package DAY1;
import java.util.Scanner;
public class ScannerInput {

	public static void main(String[] args) {
		int a;
		float b;
		String str;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input for a and b : ");
		a= sc.nextInt();
		b= sc.nextFloat();
		str=sc.next();
		System.out.println(a+b);
		System.out.println(str);

	}

}
