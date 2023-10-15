package DAY4;

public class ThrowDemo {

	static void check(int age) {
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else{
			throw new ArithmeticException("You are not eligible to vote");
		}
	}
	public static void main(String[] args) {
		check(5);
	}

}
