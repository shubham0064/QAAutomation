package Poly;

class Animal {
	void eat() {
		System.out.println("Animals Eat");
	}
}
class herbivores extends Animal {
	void eat() {
		System.out.println("Herbivores Eat Plants");
	}
}
class omnivores extends Animal {
	void eat() {
		System.out.println("Omnivores Eat Plants and meat");
	}
}
class carnivores extends Animal {
	void eat() {
		System.out.println("Carnivores Eat meat");
	}
}
public class Runtime {

	public static void main(String[] args) {
		Animal A = new Animal();
		Animal h = new herbivores(); // upcasting
		Animal o = new omnivores(); // upcasting
		Animal c = new carnivores(); // upcasting
		A.eat();
		h.eat();
		o.eat();
		c.eat();
	}
// NOTES: here runtime poly. acheived bcz 1)m.overriding 2)inheritance 3)upcasting
	
// when parent class ref variable points child class object==> upcasting occurs(implicit)
}
