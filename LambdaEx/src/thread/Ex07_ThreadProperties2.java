package thread;

class MyThread extends Thread{
	@Override
	public void run() {
		for(long i = 0; i < 100000000000l; i++) {}
		System.out.println(getName() + "우선순위 : " + getPriority());
		
	}
}

public class Ex07_ThreadProperties2 {
	
	public static void main(String[] args) {
		
		System.out.println("코어 수 : " + Runtime.getRuntime().availableProcessors());
		
		for(int i = 0; i < 3; i++) {
			Thread thread = new MyThread();
			thread.start();
		}
		
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e){
			e.printStackTrace();
		}
		
		for(int i = 0; i < 10; i++) {
			Thread thread = new MyThread();
			thread.setName(i + "번째 쓰레드");
			// 우선 순위 직접 지정 : 1~10, 클수록 우선순위가 높음
			if(i == 9) thread.setPriority(10); // 우선 순위 10 으로 부여
			thread.start();
		}
		
	}
	
}
