package DAY3;

class Account
{
	int accNo;
	Account(){
		System.out.println("Default constructor of Account class called");
	}
	void display() {
		System.out.println(accNo);
	}
	
}
class Savings extends Account
{
	int svaccNo;
	Savings(int savAcNo){
		super.accNo=890;
		super.display();
		this.svaccNo=savAcNo;
		System.out.println(svaccNo);
	}
}
class FixedDeposit extends Account
{
	int fdaccNo;
	FixedDeposit(int fdAcNo){
		super.accNo=567;
		super.display();
		this.fdaccNo=fdAcNo;
		System.out.println(fdaccNo);
	}
}
class Current extends Account
{ 
	int curaccNo;
	Current(int curAcNo){
		super.accNo=234;
		super.display();
		this.curaccNo=curAcNo;
		System.out.println(curaccNo);
	}
}

public class HeirarchicalInheritance {

	public static void main(String[] args) {
		Current c1=new Current(1111);
		FixedDeposit fd=new FixedDeposit(2222);
		Savings s=new Savings(33333);
		
	}

}
////Not completed
