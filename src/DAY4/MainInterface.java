package DAY4;

public class MainInterface implements InterfaceDemo,InterfaceDemoOne{

	public static void main(String[] args) {
		MainInterface mi=new MainInterface();
		mi.brake();
		mi.display();
		System.out.println(mi.age);
		System.out.println(mi.PI);
		InterfaceDemoOne.message();
	}

	@Override
	public void brake() {
		System.out.println("Implementation of an interface method is done in main()");
	}

	@Override
	public void display() {
		System.out.println("Implementation of another interface is done in main()");
	}
	
	
	
}
