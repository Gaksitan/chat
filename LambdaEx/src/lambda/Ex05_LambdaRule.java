package lambda;

interface Unit8{
	void move(String s);
}

public class Ex05_LambdaRule {

	public static void main(String[] args) {
		Unit8 unit;
		
		unit = (String s) -> { System.out.println(s);};
		unit.move("Lambda : 줄임 없는 표현");
		
		unit = (String s) -> System.out.println(s);
		unit.move("Lambda : 중괄호 생략");
		
		unit = (s) -> System.out.println(s);
		unit.move("Lambda : 매개변수 형 생략");
		
		unit = s -> System.out.println(s);
		unit.move("Lambda : 매개변수 소괄호 생략");
		
		
		
	}

}
