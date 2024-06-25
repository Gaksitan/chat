package lambda;

public class Outer1 {
	
	private int speed = 10;
	
	class MemberInner1 { // 내부 클래스 - Outer1 만 전용으로 사용하는 클래스 (inner 클래스를 outer 클래스만 쓰겠다)
		
		public void move() {
			System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
		}
		
	}
	
	public void getMarine() {
		MemberInner1 inner = new MemberInner1();
		inner.move();
	}
	
	
}
