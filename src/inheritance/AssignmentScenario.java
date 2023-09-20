package inheritance;

public class AssignmentScenario {

	public static void main(String[] args) {
		C c1 = new C(); 
		c1.test(); 
	} 
} 
class A{
	void test(){} 
} 

class B extends A{
	protected void test(){ } 
} 

class C extends B{
	public void test(){ } 

}
//Code gets execute successfully didn't got any error 