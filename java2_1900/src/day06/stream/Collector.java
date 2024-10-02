package day06.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Collector {
	
	int age;
	public Collector(int age) {
		this.age = age;
	}
	
	int getAge() {
		return this.age;
	}

	public static void main(String[] args) {
//		요소의 수집
//		배열이나 컬렉션 클래스 타입으로 변환
//		.toArray(), .Collection(), toList(), toSet(), toMap()
//		.toArray()는 스트림의 요소를 요소로 하는 배열을 반환.
		Stream<String> strStream = Stream.of("kim", "hong", "choi","lee");
		Object[] strArr = strStream.toArray();
		String[] newStr = new String[strArr.length];
		for (int i = 0; i < newStr.length; i++) {
			newStr[i] = (String)strArr[i];
		}
		
		Stream<Integer> intStream = Stream.of(3, 5, 1, 2);
//		Integer[] intArr = (Integer[])intStream.toArray();
		
		IntStream intStreams = IntStream.of(3, 1, 2, 7, 13);
		int[] intArrs = intStreams.toArray();
		
//		.collect(-> Collectors.toList() .toSet() .toMap())
//		원하는 것으로 바꾸는 함수를 전달하여 
//		스트림 객체를 컬렉션 클래스 타입으로 변환한다.
		Stream<String> strStream2 = Stream.of("하나", "둘", "셋", "야");
		List<String> listStr = strStream2.collect(Collectors.toList());
		for (String string : listStr) {
			System.out.println(string);
		}
		
//		통계, 연산 -> 집계함수
//		.counting()
		Stream<Integer> is = Stream.of(3, 5, 1, 9, 13, 29);
		long result = is.collect(Collectors.counting());
//		System.out.println(result);
		
//		maxBy() minBy()
		is = Stream.of(3, 5, 1, 9, 13, 29);
//		int resultInt = is
//				.collect(
//						Collectors
//						.maxBy(Comparator.comparing())
//						.get().intValue();
//		System.out.println(resultInt);
		
//		summingInt() averagingInt()
		
		
		
		
	}

}
