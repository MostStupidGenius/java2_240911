package day02.innerClass.task;

public class Whale extends Mammal implements Swim {

	@Override
	public void mammaling() {
		System.out.println("고래는 젖먹이 동물이다.");
	}
	
	@Override
	public void swimming() {
		System.out.println("포유류이지만 바다에 서식한다.");
	}
	
	public void useBlowhole() {
		System.out.println("고래는 숨을 쉬기 위해 분수공을 사용한다.");
	}

}
