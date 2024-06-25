package thread2;

public class TheNeedForSynchronized {
	
	public static void main(String[] args) {
		// 공유 객체 생성
		MyData myData = new MyData();
		
		// plusThread1
		Thread plusThread1 = new PlusThread(myData);
		plusThread1.setName("plusThread1");
		plusThread1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// plusThread2
		Thread plusThread2 = new PlusThread(myData);
		plusThread2.setName("plusThread2");
		plusThread2.start();
		
		
		
	}
}
