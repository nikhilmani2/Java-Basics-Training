
//we use interface to achieve abstraction and multiple inheritance
package DAY4;
//NOTE:we can not create an object of abstract class and interface
public interface InterfaceDemo {
	float PI=3.14f;//these are by default final variables
	//variables ---> static and final by default
	//float x; we can not do this since it is final
	void brake();
	//void data() {//interface can not have non abstract mmethod
	//methods in interface can be abstract, final and default	
	//}
}
