package inheritance;

public class RuntimePolyRealtimeExp {

	public static void main(String[] args) {
		Animal a1 = new Dog();
		Animal a2 = new Cat();
		Animal a3 = new Lion();
		a1.eat();
		//a2.eat();
		//a3.eat();
}}
class Animal{  
	public void eat(){System.out.println("eating...");}  
}  
class Dog extends Animal{  
	public void eat1(){System.out.println("eating bread...");}  
}  
class Cat extends Animal{  
	public void eat2(){System.out.println("eating rat...");}  
}  
class Lion extends Animal{  
	public void eat3(){System.out.println("eating meat...");}  
}  
