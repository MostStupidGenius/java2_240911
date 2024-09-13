package day02.innerClass.task;

public class Bat extends Mammal implements Fly {
	@Override
	public void flying() {
		System.out.println("피막 달린 날개로 날다.");
	}

	public void useEcho() {
		System.out.println("초음파를 사용해 물체를 감지한다.");
	}
}
