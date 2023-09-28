package inheritance;

public class MultilevelInheritancetype {

	public static void main(String[] args) {
		U1 u1 =new U1();
		u1.childSofR();
		u1.childTofS();
		u1.childUofT();

	}
}
class R1{
	public void Parent() {
		
	}
}
class S1 extends R1{
	public void childSofR() {
		
	}
}
class T1 extends S1{
	public void childTofS() {
		
	}
}
class U1 extends T1{
	public void childUofT(){
	}
}