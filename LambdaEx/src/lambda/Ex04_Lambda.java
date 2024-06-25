package lambda;

interface Unit6{
	void move(String s);
}


public class Ex04_Lambda {

	public static void main(String[] args) {
		
		Unit6 unit = (String s) -> { // new Unit6() 없앰, lambda 를 사용하기 위해서는 메서드가 하나만 존재해야지 사용가능
			// 구현체, -> 를 람다 표현식이라고함.
			System.out.println(s);
			
		};
		
		unit.move("anonymous : Unit 6......");
		
	}

}
