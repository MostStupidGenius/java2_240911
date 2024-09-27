package day05.streamAPI;

import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Stream;

public class ArrayListToStream {

	public static void main(String[] args) {
//		스트림API
//		ArrayList를 Stream 객체로 바꾸는 연습
		ArrayList<Integer> arrInts = new ArrayList<Integer>();
		arrInts.add(3);
		arrInts.add(52);
		arrInts.add(33);
		arrInts.add(42);
		arrInts.add(13);
		
//		컬렉션 클래스 객체를 스트림 객체로 복사본을 만드는 메서드
//		.stream()
		Stream<Integer> streamInts = arrInts.stream();
		
//		.foreach()
//		전달된 스트림의 요소를 하나씩 소모하여 전달된 메서드 동작을 하는
//		함수다.
//		streamInts.forEach(e -> System.out.println(e));
//		빠른 메서드 호출
//		메서드 앞에 오는 System.out과 같은 내용을 콜론 두 개 :: 앞에 적고
//		메서드 이름만 콜론 뒤에 적음으로써
//		스트림의 요소 하나하나를 어떤 조작, 변경 없이 해당 기능을 수행하겠다는
//		의미의 문법이다.
//		streamInts.forEach(System.out::println);
		
		
//		중개 연산
//		.iterate()
//		주어진 방법에 따라서 등차, 등비 수열에 해당하는 요소 값을
//		새로운 스트림을 생성, 반환하는 함수
		Stream<Integer> ints = Stream
				.iterate(1, e -> e+1)
				.limit(100);
//		ints.forEach(System.out::println);
		
//		.filter()
//		요소에 대한 조건식을 전달하여
//		조건식을 만족하는 요소로만 이루어진
//		새로운 스트림을 생성, 반환하는 함수.
//			짝수이면서, 50보다 큰 요소로만 이루어진 스트림 객체 생성, 반환
//		ints.filter(e -> e % 2 == 0 & e > 50)
//			.forEach(System.out::println)
//			;
		
		ArrayList<Integer> doubleValues = new ArrayList<Integer>();
		doubleValues.add(3);
		doubleValues.add(3);
		doubleValues.add(5);
		doubleValues.add(5);
		doubleValues.add(6);
		doubleValues.add(6);
		
//		distinct()
//		중복을 제거하는 함수
		
		doubleValues
		.stream()
		.distinct()
//		.forEach(System.out::println)
		;
		
//		스트림 변환
//		map()
//		스트림의 요소를 하나씩 전달된 람다식에 따라서
//		새로운 값(자료형도 바꿀 수 있다)으로 변환시킨 후 새로운 스트림을 생성, 반환한다.
//		ints.map(e-> e + 10)
//		.forEach(System.out::println);
		
		ints = Stream.iterate(1, e -> e+1)
//		.iterate()
//		시드값을 첫번째 요소로 넣고
//		시드값을 람다식의 매개변수로 전달하여
//		반환되는 값을 다음 요소로 넣는 작업을
//		반복하여 새로운 스트림을 생성, 반환한다.
//		길이가 제한되어 있지 않기 때문에
//		.limit() 함수로 그 길이를 제한해야 한다.
				
//		.limit()
//		해당 스트림의 첫번째 요소부터 전달된 파라미터의 수(정수)
//		만큼의 요소를 가져와서 새로운 스트림을 반환한다.
			.limit(100);
		
//		.sorted()
//		비교자가 주어지지 않는다면, 기본적으로 사전순으로
//		요소를 정렬한 새로운 스트림을 생성, 반환한다.
//		비교자(comparator)를 정의한 경우엔
//		비교자에 따라 정렬한 새로운 스트림을 생성, 반환한다.
		Random r = new Random();
		ints = Stream.iterate(100, e->r.nextInt(100)).limit(100);
		
//		ints
//		.sorted()
//		.forEach(System.out::println);
		
//		.peek()
//		결과 스트림으로부터 요소를 소모하여 추가로 명시된 동작을 수행한다.
//		원본 스트림에서 요소를 소모하는 것이 아니기 때문에
//		주로 중개연산과 중개연산 사이에의 결과를 확인하고 싶을 때 사용한다.
//		일반적으로 디버깅하는 용도로 주로 사용된다.
		ints = Stream.iterate(100, e->r.nextInt(100)).limit(100);
		ints
		.filter(e->e % 2 == 0)
		.peek(e -> System.out.println("e : " + e))
		.map(e->e-1)
		.limit(10)
		.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	}

}
