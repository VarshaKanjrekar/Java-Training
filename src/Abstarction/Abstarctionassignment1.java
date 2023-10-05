package Abstarction;

public class Abstarctionassignment1 {

	public static void main(String[] args) {
		shape s = new Circle();
		s.draw();
	}

}
abstract class shape{
	abstract void draw();

}
class Rectangle extends shape {
	void draw(){
		System.out.println("Drawing Rectangle");
}
}
class Circle extends shape{
	void draw(){
		System.out.println("Drawing Circle");
	}
}
