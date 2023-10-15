package DAY3;

class Accountq{

	//non-static variable

	int accNo ;

	String accName;

	String accType;

	

	

	//Constructor

	public Accountq(int accNo, String accName, String accType) {

		super();

		this.accNo = accNo;

		this.accName = accName;

		this.accType = accType;

	}

	

	//static variable

	static String bankName = "SBI";

	

	//static method

	static void display() {

		bankName = "SBINDIA";

		//System.out.println("Bank Name : "+bankName);

	}

	//non-static method

	void putData() {

		System.out.println(accNo +" "+ accName+" " + accType+" "+bankName);

		

	}

	

}

 

 

public class StaticDemoTwo {

	

	static {

		System.out.println("Its first static block!");

	}

	static {

		System.out.println("Its first static block!");

	}

	static {

		System.out.println("Its first static block!");

	}

	

	public static void main(String[] args) {

		

		Accountq.display();

		Accountq a = new Accountq(101,"Kiruba","Savings");

		a.putData();

		Accountq a1 = new Accountq(102, "Akash", "Current");

		a1.putData();

		

		Accountq.bankName = "";

 

	}

	

 

}