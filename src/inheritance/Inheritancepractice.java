package inheritance;

public class Inheritancepractice {

	public static void main(String[] args) {
		System.out.println("Heirarchial inheritance");
		R c1 = new R();
		c1.test1();
		c1.test3();
		System.out.println("c1.j");
		
		Q b1 = new Q();
		b1.test2();
		b1.test1();
		System.out.println("b1.j");
		
		S d1 = new S();
		d1.test1();
		d1.test4();
		System.out.println("d1.j");
		
	}}

class P{
	int j;
	public void test1() {
		
	}
}
class Q extends P{
	public void test2() {
		
	}
}
class R extends P {
	public void test3() {
		
	}
}
class S extends P{
	public void test4() {
		
	}
}

