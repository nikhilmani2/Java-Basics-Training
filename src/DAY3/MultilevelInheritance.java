package DAY3;

class RBI //Grandparent
{
	String branch_name;
	int branch_code;
	RBI(){
		System.out.println("RBI constructor called");
	}
	void display() {
		System.out.println(branch_name+" "+branch_code);
	}
}

class ICICI extends RBI//child of rbi & parent of iciciprudential
{
	ICICI(String branch_name,int branch_code){
		super();
		super.branch_name="Mumbai";
		super.branch_code=12345678;
		super.display();
		this.branch_name=branch_name;
		this.branch_code=branch_code;
		super.display();
	}
}

class ICICIPrudential extends ICICI//child class of icici
{
	ICICIPrudential(String branch_name,int branch_code){
		super("Delhi",12345);
		this.branch_name=branch_name;
		this.branch_code=branch_code;
		super.display();
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		ICICIPrudential object=new ICICIPrudential("KN",10234);
	}

}
