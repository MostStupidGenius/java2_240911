package day01.polymorph;

public class AnimalTask {
	public static void main(String[] args) {
		Person p = new Person();
//		p.eat();
		Cat c = new Cat();
//		c.eat();
		
		Animal[] arrAnimal = new Animal[] {p, c};
		
		for (Animal animal : arrAnimal) {
//			animal.eat();
			if(animal instanceof Cat) { // 자식클래스 타입 검사
				Cat c2 = (Cat)animal;
				c2.claw();
			}
			animal.printType();
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
