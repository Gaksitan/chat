package lambda;

@FunctionalInterface // 메서드를 하나만 가지게 만드는 어노테이션 (람다 사용식을 사용시 오류를 줄이기 위해)
interface Unit10{
	String move();
	//void attack();
}

public class Ex07_LambdaRule3 {

	public static void main(String[] args) {
		
		Unit10 unit = () -> "인간형 유닛 이동"; // { return "인간형 유닛 이동"; };
		
		System.out.println(unit.move());
		
	}

}
