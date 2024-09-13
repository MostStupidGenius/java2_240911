package day01.interfaceTask;

public class AnimalTest {

	public static void main(String[] args) {
		Animal[] animals = new Animal[] {new Dog(), new Cat()};
		
		for (Animal animal : animals) {
			animal.eat();
		}
		
	}

}
