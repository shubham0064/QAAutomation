package Interface;

interface i1{
	
}
interface Drawing{
	void draw();
}
class Rectangle implements Drawing{
	public void draw() {
		System.out.println("Draw a rectangle");
	}
}
class Circle implements Drawing{
	public void draw() {
		System.out.println("Draw a circle");
	}
}
public class Interface1 {
	public static void main(String args[]) {
		Rectangle r = new Rectangle();
		r.draw();
		Circle c = new Circle();
		c.draw();
		//or
		System.out.println("_________");
		
		Drawing d = new Rectangle();
		Drawing d1 = new Circle();
		d.draw();
		d1.draw();
	}
}
