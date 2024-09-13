package day02.innerClass.task;

public class Sparrow extends Bird implements Fly {

	@Override
	public void egging() {
		System.out.println("참새는 알을 낳는다.");
	}

	@Override
	public void flying() {
		System.out.println("참새는 작은 날개로 날아다닌다.");
	}
	
	public void chirp() {
		System.out.println("참새는 지저귄다.");
	}
}
