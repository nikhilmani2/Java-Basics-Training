package DAY4;

public class ExceptionDemoTry {

	public static void main(String[] args) {
		try {
			int i=10;
			int j=0;
			System.out.println(i/j);
		}
		catch(ArithmeticException ae) {
			System.out.println("Divide by Zero");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		finally {
			System.out.println("Exception is handled");
		}
	}

}
