package day02.innerClass.task;

public class Flyingfish extends Fish implements Fly {

	@Override
	public void egging() {
		System.out.println("날치는 알을 낳는다.");
	}

	@Override
	public void swimming() {
		System.out.println("날치는 바다에서 생활한다.");
	}

	@Override
	public void flying() {
		System.out.println("날치는 지느러미를 이용해 활강이 가능하다.");
	}
	
	public void horde() {
		System.out.println("날치는 데지어다닌다.");
	}

}
