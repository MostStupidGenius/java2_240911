package day02.innerClass.task;

public class Penguin extends Bird implements Swim {

	@Override
	public void egging() {
		System.out.println("펭귄은 알을 낳는다.");
	}

	@Override
	public void swimming() {
		System.out.println("펭귄은 조류로 분류되지만 바다에서 사냥을 한다.");
	}
	
	public void sliding() {
		System.out.println("펭귄은 얼음 위에서 미끄러져 움직인다.");
	}

}
