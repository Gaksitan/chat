package stream;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
		
	}
	
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = { "안녕하세요~~~(8-k)", "hello(5-e)", "Good Morning(12-e)", "반갑습니다. ^^(9-k)" };
		System.out.println(Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if(s1.getBytes().length >= s2.getBytes().length) return s1;
			else return s2;
		})); // reduce(초기값, 전달되는 요소 -> 실행코드)
		
		
		String str = Arrays.stream(greetings).reduce(new CompareString()).get();
		System.out.println(str);
		
	}

}
