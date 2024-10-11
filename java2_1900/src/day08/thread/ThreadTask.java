package day08.thread;

public class ThreadTask extends Thread {
	
	@Override
	public void start() {
		super.start();
//		스레드가 실행할 작업
		System.out.println("스레드 실행");
	}
	
	public static void main(String[] args) {
		ThreadTask tt = new ThreadTask();
		tt.start();
		
		
	}

}
