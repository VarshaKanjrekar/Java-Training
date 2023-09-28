package inheritance;

public class RuntimePolyAssignment1 {

	public static void main(String[] args) {
		Car c1 = new Maruti();
		c1.method2();//Only the methods of parent class Car should be call 

	}}
class Car{
public void method1(){
System.out.println("Car-method1");
}
}
class Maruti extends Car{
public void method1(){
System.out.println("Maruti-method1");
}
public void method2(){
System.out.println("Maruti-method2");
}
}
