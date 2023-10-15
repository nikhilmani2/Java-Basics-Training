package DAY2;

public class Autoboxing {

	public static void main(String[] args) {
		int a=20;
		Integer i=Integer.valueOf(a);//converting int into integer explicitly
		Integer j=a;//autoboxing comoiler will do internally
		System.out.println(a+" "+i+" "+j);
	}

}
