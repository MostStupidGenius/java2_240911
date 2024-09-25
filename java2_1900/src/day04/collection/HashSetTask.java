package day04.collection;

import java.util.HashSet;
import java.util.Random;

public class HashSetTask {

	public static void main(String[] args) {
//		Set 컬렉션 클래스
//		HashSet
//		중복된 값을 허용하지 않는, 순서가 없는 자료구조.
//		<> 안에 정의된 클래스 타입을 가진 객체만 저장할 수 있다.
		HashSet<String> setStr = new HashSet<String>();
		setStr.add("hong");
		setStr.add("kim");
		setStr.add("lee");
		
//		중복된 값을 추가하면, false값이 반환된다.
		System.out.println(setStr.add("lee")); // false
		
//		.contains(객체)
//		전달된 객체가 요소 중에 있는지 여부를 반환하는 메서드.
		System.out.println(setStr.contains("lee")); // true
		System.out.println(setStr.contains("leee")); // false
		
		
		Random r = new Random();
		HashSet<Integer> setInt = new HashSet<Integer>();
		int length = 20;
		
		
		for (int i = 0; i < 10; i++) {
			int rNum = r.nextInt(length);
			if(setInt.contains(rNum)) {
				System.out.println(rNum);
				i--;
				continue;
			} else {
				setInt.add(rNum);
			}
		}
		
		System.out.println("========");
		for (Integer i : setInt) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
