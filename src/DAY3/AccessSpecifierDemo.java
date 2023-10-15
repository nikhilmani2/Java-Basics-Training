package DAY3;

import DAY1.AccessOutsidePackage;

public class AccessSpecifierDemo {

	public static void main(String[] args) {
		AccessDemo d=new AccessDemo();
		AccessOutsidePackage aop=new AccessOutsidePackage();
		aop.putData();
		d.display();
	}

}
