package day03.arrays;

import java.util.Arrays;
import java.util.List;

public class ArrayTask {
	public static void main(String[] args) {
//		Arrays
//		배열을 다루기 위한 클래스다.
//		copyOf(T[], int length)
//		T타입의 원본배열과 복사하고자 하는 길이를 전달하여
//		원본 배열의 0번째부터 length 개수 만큼
//		그 요소를 복사하여 새로운 배열을 반환한다.
		int[] arrInt = new int[10]; // 0, 0, 0,...

		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = i;
		}
//		for (int i : arrInt) {
//			System.out.println(i);
//		}
		System.out.println();
		int[] copiedArr = Arrays.copyOf(arrInt, arrInt.length);
		// 원본 배열의 길이만큼 복사하기 때문에
		// 원본 배열과 동일한 새로운 배열을 반환한다.
//		for (int i : copiedArr) {
//			System.out.println(i);
//		}

		arrInt[0] = 33;
//		System.out.println(copiedArr[0]);
//		System.out.println(arrInt);
//		System.out.println(copiedArr);

//		copyOfRange(T[], int start, int end)
//		원본 배열을 start번째 인덱스부터, end-1번째 인덱스까지(exclude)
//		요소를 가져와서 복사하는 메서드

//		for (int e : Arrays.copyOfRange(arrInt, 3, arrInt.length)) {
//			System.out.println(e);
//		}

//		fill(T[], T) -> void
//		원본 배열의 요소를 전달된 T타입의 값으로 모두 바꿔넣는다.
//		원본 배열을 직접 수정한다는 것을 주의해야 한다.
//		-> 새로운 배열을 만드는 게 아니다.
		Arrays.fill(copiedArr, 10);
		for (int i : copiedArr) {
//			System.err.println(i);
		}

//		sort(T[])
//		원본 배열을 오름차순으로 정렬하는 메서드다.
//		원본 배열을 직접 수정하는 메서드이기 때문에
//		주의하여 사용해야 한다.
		int[] arrInt2 = new int[] { 33, 20, 11, 93, 45 };
		Arrays.sort(arrInt2);
		for (int i : arrInt2) {
			System.out.println(i);
		}

//		asList(Object...)
//		특정 타입의 값이나 객체를 전달하면
//		해당 타입의 요소로 이루어진 리스트 객체를 반환한다.
//		Arrays.asList();
		List<int[]> l = Arrays.asList(arrInt2);

	}
}
