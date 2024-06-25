package thread;

class MyThread3 implements Runnable{ // 자바는 다중 상속이 안되기 때문에 그 문제를 개선하기 위해 스레드를 상속하는 대신 Runnable 인터페이스를 

	@Override
	public void run() {
		int sum = 0;
		for(int i = 0; i < 10; i++) {
			sum = sum + i;
		}
		
		String name = Thread.currentThread().getName();
		System.out.println(name + " : " + sum);
	}
	
	
}

public class Ex03_RunnableInterface {
	
	public static void main(String[] args) {
		Thread t = new Thread(new MyThread3());
		t.start();
		System.out.println("main : " + Thread.currentThread().getName());
	}
}
