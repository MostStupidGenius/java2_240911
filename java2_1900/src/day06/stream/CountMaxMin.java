package day06.stream;

import java.util.stream.IntStream;

public class CountMaxMin {

	public static void main(String[] args) {
//		통계함수
//		.count()
//		요소의 개수를 long타입의 값으로 반환한다.
		IntStream is = IntStream.rangeClosed(23, 394);
		System.out.println(is.count()); // 반환타입은 long

//		.max()
//		요소 중 가장 큰 요소를 참조하는 Optional 값을 반환
		is = IntStream.of(30, 45, 90, 72, 13);
		System.out.println(is.max().getAsInt());
//		.min()
//		요소 중 가장 작은 요소를 참조하는 Optional 값을 반환
	}

}
