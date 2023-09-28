package inheritance;

public class SingleInheritancetype {

	public static void main(String[] args) {
		Q1 q1 = new Q1();
		q1.test10();
		q1.test11();

	}
}
class P1{
	public void test10() {
		
	}
}
class Q1 extends P1{
	public void test11() {
		
	}
}


//Single parent to child means single inheritance type