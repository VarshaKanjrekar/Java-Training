package inheritance;

public class OverridingScenario {

	public static void main(String[] args) {
		System.out.println("Overide Scenario");
		X x1 = new X();
		x1.test();

		Y y1 = new Y();
		y1.test();

		Z z1 = new Z();
		z1.test();

	}
}
class X{
	protected void test() {
	}
}
class Y extends X{
	protected void test() {

	}
}
class Z extends Y{
	protected void test() {

	}
}
