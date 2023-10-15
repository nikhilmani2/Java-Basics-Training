package DAY4;

interface ParentOne{
	void behaviour();
}
interface ParentTwo{
	void race();
}

class Child implements ParentOne,ParentTwo{

	@Override
	public void race() {
		System.out.println("Its race is from ParentTwo");
	}

	@Override
	public void behaviour() {
		System.out.println("Its behaviour is from ParentOne");
	}
	
}

public class MultipleInheritance {
//NOTE: multiple inheritance can be achieved only with the help of interface in java
	
	public static void main(String[] args) {
		Child c=new Child();
		c.behaviour();
		c.race();
	}

}
