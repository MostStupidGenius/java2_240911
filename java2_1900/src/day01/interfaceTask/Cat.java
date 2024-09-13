package day01.interfaceTask;

public class Cat implements Animal {

	@Override
	public void eat() {
		System.out.println("물고기를 먹는다.");
	}

	@Override
	public void sleep() {
		System.out.println("낮에 자고 밤에 돌아댕긴다.");
	}
	
}
