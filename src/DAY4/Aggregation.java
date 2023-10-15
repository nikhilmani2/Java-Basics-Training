package DAY4;

class Customer{
	int id;
	//String fName;
	//String mName;
	//String lName;
	Name name;
	String address;
	public Customer(int id,Name name,String address) {
		super();
		this.id=id;
		this.name=name;
		this.address=address;
	}
	void display() {
		System.out.println(id);
		System.out.println(this.name.fName+" "+this.name.mName+" "+this.name.lName);
		System.out.println(address);
	}
	
}

public class Aggregation {

	public static void main(String[] args) {
		Name name1=new Name("Nikhil","S","Mani");
		Customer c1=new Customer(100,name1,"Bihar");
		c1.display();
	}

}
