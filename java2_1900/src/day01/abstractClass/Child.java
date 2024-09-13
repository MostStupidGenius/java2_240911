package day01.abstractClass;

public class Child extends ParentAbs {
	// 부모로부터 상속받은 추상 메서드는
	// (추상클래스가 아닌)자식클래스에서는 반드시
	// 그 내용을 구현하여 채워 넣어야 한다(강제성).
	@Override
	void printInfo() {
		System.out.println("내용");
	}
	
}
