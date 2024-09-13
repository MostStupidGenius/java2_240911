package day01.polymorph;

public class Person extends Animal{
	
	@Override
	public void eat() {
//		super.eat();
		System.out.println("음식을 입으로 먹는다.");
	}
}
