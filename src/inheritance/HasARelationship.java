package inheritance;

public class HasARelationship {

	public static void main(String[] args) {
		System.out.println("Has a Relationship");
	}
}
class M{
	int i;
	public void test01() {
		
	}
}
class N{
	public void test02() {
		M m1 = new M();
		System.out.println("m1.i");
		m1.test01();
		
	}
}
