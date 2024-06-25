package lambda;

interface Unit3{
	void move();
}

class HumanCamp3{
	private int speed = 15;
	
	public Unit3 getMarine() {
		
		/*
		class Marine3 implements Unit3{
			
			@Override
			public void move() {
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}
		}
		*/
		
		//return new Marine3();
		return new Unit3() { // 익명 내부 클래스, 위의 코드가 이걸로 바뀜 (Marine3 클래스 선언이 생략), 플러터에서 이벤트 기반의 코드를 짤때 주로 사용
			@Override
			public void move() {
				System.out.printf("인간형 유닛이 %d 속도로 이동합니다.\n", speed);
			}
		};
	}
}



public class Ex03_AnonymousInner {

	public static void main(String[] args) {
		HumanCamp3 hc = new HumanCamp3();
		Unit3 unit = hc.getMarine();
		unit.move();
		
		
	}

}
