package day01.polymorph;

public class Animal {
	
	public void eat() {
		System.out.println("음식을 먹는다.");
	}
	
	public void breath() {
		System.out.println("숨을 쉰다.");
	}
	
	public void printType() {
		// instanceof
		// 클래스 타입을 검사하는 문법
		// 객체 instanceof 클래스이름 -> boolean
		if(this instanceof Person) {
			System.out.println("is person");
		} else if(this instanceof Cat) {
			System.out.println("is cat");
		} else {
			System.out.println("is animal");
		}
		
		
		
		
		
	}
	
	
	
	
	
	
}
