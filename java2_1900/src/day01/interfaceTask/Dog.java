package day01.interfaceTask;

public class Dog implements Animal {

	@Override
	public void eat() {
		System.out.println("잡식이며, 사료를 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("밤에 자고 낮에 활동한다.");
	}

}
