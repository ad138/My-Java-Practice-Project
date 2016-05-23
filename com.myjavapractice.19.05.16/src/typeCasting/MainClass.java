package typeCasting;

public class MainClass {
	public static void animalBehaviour(Animal a1) {
		a1.eat();
	}
	public static void main(String args[]) {
		//Animal a1 = new Lion();
		//animalBehaviour(a1);
		animalBehaviour (new Lion());
		animalBehaviour (new Cow());
		animalBehaviour (new Dog());
	}
}
