package Abstarction;

public class InterfaceAssignment {

	public static void main(String[] args) {
		A a = new B();
		a.a();

}
}
interface A{
	void a();
}
class B implements A{
	public void a() {
		System.out.println("I am a");
	}
}