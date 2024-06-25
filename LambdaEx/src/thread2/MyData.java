package thread2;
// 공유 객체
public class MyData {
	int data = 3;
	
	public void plusData() { // synchronized 쓰레드를 동기화 시켜줌 (실행되는 메서드 앞에 쓰면됨)
		
		synchronized(this) { // 동기화 블록 ()안 key 라고함, this key 한메서드안에 같은 키 로 여러개를 만들수 있지만 같은 키면 쓰레드가 그 키를 이용할때(진입) 같은 키를 가진 메서드안 기능이 잠김.
			int mydata = data; // 데이터 가져오기
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			data= mydata + 1;
		}
	}
}
