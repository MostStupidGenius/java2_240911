package day09.review.collection;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ListPractice {

	public static void main(String[] args) {
//		ArrayList<E>
		ArrayList<Integer> arrInt = new ArrayList<Integer>();
//		값의 추가
//		.add(넣을 값)
		arrInt.add(3);
		arrInt.add(7);
		arrInt.add(2);
		arrInt.add(9);
		
//		for (Integer integer : arrInt) {
//		for (int i = 0; i < arrInt.size(); i++) {
//			System.out.println(i > 0 ? arrInt.get(i-1) : arrInt.get(i));
//		}
		
		Stream<Integer> arrIntStream = arrInt.stream();
		arrIntStream.filter(e->e % 2 == 1)
			.forEach(System.out::println);
		
		
		
		
		
		
		
		
		
		
		
	}

}
