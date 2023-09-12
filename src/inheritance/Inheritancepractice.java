package inheritance;

public class Inheritancepractice {

	public static void main(String[] args) {
		C c1 = new C();
		c1.test1();
		c1.test3();
		System.out.println("c1.j");
		
		B b1 = new B();
		b1.test2();
		b1.test1();
		System.out.println("b1.j");
		
		D d1 = new D();
		d1.test1();
		d1.test4();
		System.out.println("d1.j");
		
	}}

class A{
	int j;
	public void test1() {
		
	}
}
class B extends A{
	public void test2() {
		
	}
}
class C extends A {
	public void test3() {
		
	}
}
class D extends A {
	public void test4() {
		
	}
}