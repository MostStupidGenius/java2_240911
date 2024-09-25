package day04.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ListTask {

	public static void main(String[] args) {
//		List 컬렉션 클래스
//		ArrayList<E>
//		어레이리스트는 여러 개의 동일한 타입의 값을 담을 수 있는 객체로
//		내부적으로 배열로 동작한다.
		ArrayList<String> arrStr = new ArrayList<String>();
		
//		.add(값)
//		리스트에 전달된 값 혹은 객체를 리스트의 가장 마지막에 추가한다.
//		arrStr.add("홍길동");
//		System.out.println(arrStr.get(0)); // "홍길동"
		
//		.remove(index|Object)
//		전달된 index 번째의 요소를 제거하거나
//		전달된 객체와 같은 요소 중 첫번째 요소를 제거한다.
//		arrStr.remove("홍길동");
//		System.out.println(arrStr.get(0)); // error
//		요소가 없기 때문에 에러가 발생한다.
		
//		.get(index)
//		해당되는 인덱스 번째의 요소를 가져온다.
//		System.out.println(arrStr.get(0)); // 0번째 요소를 가져온다.
		
		ArrayList<Integer> arrInt2 = new ArrayList<Integer>();
		arrInt2.add(3);
		arrInt2.add(31);
		arrInt2.add(12);
		arrInt2.add(24);
		arrInt2.add(9);

//		for (int i = 0; i < arrInt2.size(); i++) {
//			int current = arrInt2.get(i);
//			System.out.println(current);
//		}
//		.set(index, 객체)
//		전달된 인덱스 번째의 값을 전달된 객체로 덮어씌우는 메서드
//		성공적으로 요소 대체가 되면, 이전에 위치했던 요소의 값이 반환
//		해당 위치에 전달된 객체 혹은 값이 자리한다.
		int prev = arrInt2.set(1, 99);
		System.out.println(prev); // 31
		System.out.println(arrInt2.get(1)); // 99 
		
//		Collections.sort(컬렉션 객체) -> void
//		전달된 리스트 객체의 요소를 오름차순으로 정렬한다.
		Collections.sort(arrInt2);
		
//		for (int i = 0; i < arrInt2.size(); i++) {
//			int current = arrInt2.get(i);
//			System.out.println(current);
//		}
		
//		for (Integer i : arrInt2) {
//			System.out.println(i);
//		}
		
//		iterator()
//		요소를 next() 메서드를 사용하여 하나씩 가져오는 메서드다.
		Iterator<Integer> itr = arrInt2.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
