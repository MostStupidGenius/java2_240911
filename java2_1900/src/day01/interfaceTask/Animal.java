package day01.interfaceTask;

public interface Animal {
	
	// 추상 메서드와
	// 상수만 선언 가능하다.
	public final int TYPE = 0;
	
	public abstract void eat();
	public abstract void sleep();
	
}
