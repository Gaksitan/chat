package thread;

class MyThread2 extends Thread{ // 스레드 상속
	
	@Override
	public void run() { // run 은 스레드가 행해야 할 일을 적는 메서드
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + sum);
		
		
	}
}

public class Ex02_ThreadClass {
	
	public static void main(String[] args) { // 메인 스레드
		
		MyThread2 thread = new MyThread2();
		thread.start(); // 스레드의 run 메서드는 start 로 실행을 시켜줘야 한다. 별도의 실행흐름을 가지게 됨 - 병렬처리.
		System.out.println("main : " + Thread.currentThread().getName());
		
		
	}
	
}
