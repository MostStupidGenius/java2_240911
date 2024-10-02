package day06.stream;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReduceTask {

	public static void main(String[] args) {
//		.foreach()
//		스트림의 각 요소를 순차적으로 소모하여
//		전달된 메서드를 반복적으로 수행하는
//		함수이다.
//		일반적으로 System.out::println을 실행할 코드로
//		전달하여 출력하는 용도로 많이 쓰인다.
//		각 요소는 다른 요소에 영향을 주지 않고
//		독립적으로 소모된다.
		
		
//		.reduce(before, after)
//		각 요소를 소모하여 연산한 뒤, 연산한 결과를
//		다음 연산의 대상 중 하나로 하여
//		연쇄적으로 연산을 하는 함수이다.
//		최종결과는 값 하나다.
		Stream<Integer> intStream = 
				Stream.of(3, 5, 12, 2, 9, 31);
		int result = intStream
				.reduce((bf, crrnt)->bf+crrnt)
				// 이전 결과값과 이번 요소의 값을 대상으로 하여 연산을 하고,
				// 그 값을 다시 다음 연산의 대상으로 다시 넣는다.
				.get() // 연산 최종 결과값을 Optional 클래스 타입으로 받아온다.
				.intValue(); // Optional타입을 원하는 원시자료형으로 변환한다.
		
		result = IntStream.rangeClosed(1, 100)
				// 1부터 100까지의 정수로 이루어진 스트림 생성
				.reduce((before, current) -> before + current)
				// 요소를 소모하여 이전 합과 현재 요소를 더한다.
				.getAsInt();// 결과값을 int타입으로 변환
		System.out.println(result);
		
		IntStream is = IntStream.rangeClosed(1, 100);
//		요소의 검사
//		.anyMatch() -> boolean
//		모든 요소에 대해서 조건식을 검사하는데,
//		하나라도 참이면 결과값은 참
		boolean is51 = is
//				.filter(e-> e%51 != 0)
				.anyMatch(e -> e % 51 == 0);
		System.out.println(is51);
		
//		.allMatch()
//		모든 요소에 대해서 조건식이 모두 참이어야
//		결과값이 참
		is = IntStream.rangeClosed(1, 100);
		boolean resultBool = is.allMatch(e->e < 100);
		System.out.println(resultBool);
		
//		.noneMatch()
//		모든 요소에 대해서 조건식이 모두 거짓이어야
//		결과값이 참
		is = IntStream.rangeClosed(1, 100);
		resultBool = is.noneMatch(e-> e > 100);
		System.out.println(resultBool);
		
		
		
		
		
		
		
		
	}

}
