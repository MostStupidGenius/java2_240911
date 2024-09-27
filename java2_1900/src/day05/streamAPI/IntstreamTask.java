package day05.streamAPI;

import java.util.stream.IntStream;

public class IntstreamTask {

	public static void main(String[] args) {
//		Intstream
//		정수 값들로 이루어진 스트림 객체를 다루는 인터페이스로
//		주로 range(start, end) 함수를 사용하여
//		start부터 end-1까지의 등차가 1인 등차수열인
//		IntStream을 생성, 반환한다.
		IntStream is = IntStream.range(0, 100);
		
//		.rangeClosed()함수는
//		start부터 end까지의 등차가 1인 등차수열을
//		IntStream으로 반환한다.
		is = IntStream.rangeClosed(1, 100);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
