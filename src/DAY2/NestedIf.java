package DAY2;

public class NestedIf {

	public static void main(String[] args) {
		int age=18;
		String citizen ="Indian";
		if(citizen == "Indian") {
			if(age>=18) {
				System.out.println("You are eligible to vote");
			}
			else
			{
				System.out.println("Age is not valid");
			}
		}
		else
		{
			System.out.println("You have to be indian to vote");
		}
	}

}
