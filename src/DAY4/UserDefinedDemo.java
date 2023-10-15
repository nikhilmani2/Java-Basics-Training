package DAY4;
class AgeCrieteriaException extends Exception{
	public AgeCrieteriaException(String message) {
		super(message);
	}
}
public class UserDefinedDemo {

	static void check(int age) {
		try {
		if(age>=18) {
			System.out.println("You are eligible to vote");
		}
		else{
			throw new AgeCrieteriaException("You are not eligible to vote");
		}}
		catch(AgeCrieteriaException ae) {
			System.out.println(ae.getMessage());
		}
	}
	
	public static void main(String[] args) {
		check(5);
	}

}
