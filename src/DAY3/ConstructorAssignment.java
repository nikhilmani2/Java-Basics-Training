package DAY3;

class Addition{

	int a,b;

	Addition(int a,int b){
		this.a=a;
		this.b=b;
	}
	
	void add() {
		System.out.println(a+b);
	}


	void add_one(int a,int b) {
		System.out.println(a+b);
	}

	
	int add_two() {
		int c = a +b;
		return c;
	}



	int add_three(int a,int b) {
		int c = a + b;
		return c;
	}
	
}

public class ConstructorAssignment {

	public static void main(String[] args) {
		
        Addition object = new Addition(23,45);

		int p=100,q=300;
		
		object.add();

		object.add_one(p,q);

		int res = object.add_three(40, 70);

		System.out.println(res);

		int result = object.add_two();

		System.out.println(result);

	}

}
