package day01.inheritance;

public class ParentClass {
	
	String name;
	int age;
	
	// 기본생성자를 막아본다.
	public ParentClass(String name) {
		this.name = name;
	}
	
	public ParentClass() {
	}
	
	// 상속
	// 부모 클래스
	// 아무것도 상속을 받지 않은 클래스는
	// 기본적으로 Object라는 최상위 클래스를 상속받는다.
	@Override
	// 오버라이드(어노테이션을 이용한 문법)
	// 부모로부터 상속받은 메서드를 수정하는 것.
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
	
	public void printInfo() {
		System.out.printf("name: %s\nage: %d", this.name, this.age);
	}
	
	public static void main(String[] args) {
		ParentClass p = new ParentClass("hong");
		p.name = "hong";
		p.age = 30;
		p.printInfo();
		
	}
	
}
