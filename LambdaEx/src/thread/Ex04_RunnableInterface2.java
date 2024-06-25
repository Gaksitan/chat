package thread;

public class Ex04_RunnableInterface2 {
	
	public static void main(String[] args) {
		
		Runnable task = () -> {
			
			try {
				Thread.sleep(3000); // 3초 뒤에 실행
			}catch(Exception e) {
				e.printStackTrace();
			}
			int sum = 0;
			for(int i = 0; i < 10; i++) {
				sum = sum + i;
			}
			
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + sum);
			
		};
		
		Thread t = new Thread(task);
		t.start();
		
		System.out.println("main : " + Thread.currentThread().getName()); 
		
	}
	
	
}
