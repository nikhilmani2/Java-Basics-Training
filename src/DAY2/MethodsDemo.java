package DAY2;

class Addition{

	int a,b;

	//without RT without Arguements

	void add() {

		//int a = 20,b =60;

		System.out.println(a+b);

		

	}

	

	//without RT with Arguements

	void add_one(int a,int b) {

		System.out.println(a+b);

	}

	

	//with RT without Arguements

	int add_two() {

		//int a = 20,b =60;

		int c = a +b;

		return c;

	}

	

	//with RT with Arguements

	int add_three(int a,int b) {

		int c = a + b;

		return c;

	}

	

}

public class MethodsDemo {

	

	public static void main(String[] args) {

		Addition object = new Addition();

		

		object.a = 987;

		object.b = 908;

		

		int p=100,q=300;

		

		object.add();

		object.add_one(p,q);

		int res = object.add_three(40, 70);

		System.out.println(res);

		int result = object.add_two();

		System.out.println(result);

 

	}

 

}
