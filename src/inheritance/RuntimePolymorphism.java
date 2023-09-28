package inheritance;

public class RuntimePolymorphism {

	public static void main(String[] args) {
		Car c1 = new Maruti();
		c1.method1();
		//Maruti c2 = new Car();   //Getting error because parent class can be use as reference in method
	    //c2.method1();// but for child class method names should be same 

	}

}
class Car{
public void method1(){
System.out.println("Car-method1");
}
}
class Maruti extends Car{
public void method1(){
System.out.println("Maruti-method1");
}
}
