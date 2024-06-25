package lambda;

interface Unit9{
	int calc(int a, int b); // 반환타입이 있는 메서드 
}

public class Ex06_LambdaRule2 {

	public static void main(String[] args) {
		Unit9 unit;
		
		unit = (a, b) ->  a + b; 
		
		int num = unit.calc(10, 20);
		System.out.println("sumResult : " + num);
		
		unit = (a, b) -> a * b;
		System.out.println("multipleResult : " + unit.calc(5, 12));
		
		
	}

}
