package day08.thread;

public class Counter extends Thread {
	
	private static int count = 0;
	
//	카운트 값을 1씩 증가시키는 메서드
	public synchronized void increaseCount() {
		count++;
	}
	
	public synchronized int getCount() {
		return count;
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		Counter cnt1 = new Counter();
		Counter cnt2 = new Counter();
		cnt1.start();
		cnt2.start();
		
		Counter[] cnts = new Counter[] {cnt1, cnt2};
		cnts[0].increaseCount();
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.err.println(e);
		}
		cnts[1].increaseCount();
		System.out.println(cnts[0].getCount());
		Thread.sleep(1000);
		cnts[0].increaseCount();
		Thread.sleep(1000);
		cnts[1].increaseCount();
		System.out.println(cnts[0].getCount());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
