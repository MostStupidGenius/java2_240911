package day02.innerClass.task;

public class Shark extends Fish {

	@Override
	public void egging() {
		System.out.println("상어는 난생이다.");
	}

	@Override
	public void swimming() {
		System.out.println("상어는 바다의 무법자로 불린다.");
	}
	
	public void hunt() {
		System.out.println("상어는 육식동물로, 사냥을 한다.");
	}
}
