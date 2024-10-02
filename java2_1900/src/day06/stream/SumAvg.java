package day06.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

public class SumAvg {

	public static void main(String[] args) {
//		요소의 연산
//		IntStream, DoubleStream
//		숫자형 스트림에서 정의된 함수다.
//		.sum()
		IntStream is = IntStream
				.rangeClosed(1, 100); // 1부터 300까지의 숫자를 담는다.
		int result = is.sum(); // 모든 요소의 합
		System.out.println(result); // 출력
		
//		.average()
		DoubleStream ds = DoubleStream
				.iterate(1, e->e+0.2)
				.limit(100);
		double resultDouble = ds.average().getAsDouble();
		System.out.println((float)resultDouble);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
