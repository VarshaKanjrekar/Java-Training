package inheritance;

public class Unidirectionalinheritance {

	public static void main(String[] args) {
		System.out.println("Unidirectional scenario");
	}

}
class T{
	int i;
	public void test1() {
		
	}
}
class U extends T {
	public void test2() {
		System.out.println(i);
		test1();
	}
}




//parents attributes can be given to child but reverse action is not possible like child to parent is not possible