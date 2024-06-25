package thread;

class DemonThread extends Thread {
	@Override
	public void run() {
		
		System.out.println(getName() + " : " + (isDaemon() ? "데몬쓰레드" : "일반쓰레드"));
		for(int i = 0; i < 6; i++) {
			System.out.println(getName() + " : " + i + "초");
			try {
				Thread.sleep(1000);
			}catch (InterruptedException e){
				e.printStackTrace();
			}
		}
	}
}

public class Ex09_DemonThread2 {
	// 데몬 쓰레드 (테스트)
	public static void main(String[] args) {
		
		Thread thread1 = new DemonThread();
		thread1.setDaemon(true); // 데몬쓰레드 설정
		thread1.setName("daemon");
		thread1.start();
		
		// 3초 후 main 쓰레드 종료
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main Thread 종료......");
		
	}
	
	
}
