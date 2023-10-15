package DAY3;

class Accounts{
	int accNo=100;
	String accName="Nikhil";
	String accType="Savings";
	static String bankName="SBI";
	
	static void display() {//static methods can access only static variables
		System.out.println(bankName);
		bankName="SBIINDIA";
		System.out.println("bankName: "+bankName);
		//System.out.println(accName); This willl give error since accName is not static
	}
	void show() {//non static method can access static as well as non static variables
		System.out.println("accNo: "+accNo+" accName: "+accName+" accType: "+accType+" bankName: "+bankName);

	}
}

public class StaticDemo {

	static {
		System.out.println("Its first static block");//when ever we compile if we have static block it will first execute that nad the the main method
	}
	
	public static void main(String[] args) {
		Accounts.display();//to access static methods and variables we use class name and dot
		Accounts.bankName="RBI";
		Accounts.display();
		Accounts a =new Accounts();
		a.show();
	}

}
