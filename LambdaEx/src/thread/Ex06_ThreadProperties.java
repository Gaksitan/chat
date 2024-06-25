package thread;

public class Ex06_ThreadProperties {

	public static void main(String[] args) {
		
		Thread curThread = Thread.currentThread();
		System.out.println("현재 쓰레드의 이름 : " + curThread.getName());
		System.out.println("동작하는 쓰레드의 개수 : " + Thread.activeCount());
		
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			// 쓰레드 이름 직접 지정
			thread.setName(i + "번째 쓰레드");
			System.out.println(thread.getName());
			thread.start();
		}

		for(int i = 0; i < 3; i++) {
			Thread thread = new Thread();
			System.out.println(thread.getName());
			thread.start();
		}
		
		System.out.println("동작하는 쓰레드 개수 : " + Thread.activeCount()); // 동작하는 쓰레드를 체크하기전에 끝나버려서 
		
	}

}
