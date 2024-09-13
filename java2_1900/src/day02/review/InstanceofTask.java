package day02.review;

public class InstanceofTask {

	public static void main(String[] args) {
		// 자식클래스 객체 호출
		Dog d = new Dog();
		
		// 부모클래스 객체 호출
		Animal a = new Animal();
		
		Animal dToA = d;
		
		System.out.println(d instanceof Animal); // true
		System.out.println(d instanceof Dog);	// true
		
		System.out.println(a instanceof Animal); // true
		System.out.println(a instanceof Dog);	// false
		
		System.out.println(dToA instanceof Animal); // true
		System.out.println(dToA instanceof Dog);	// true
		
		
		
	}

}
