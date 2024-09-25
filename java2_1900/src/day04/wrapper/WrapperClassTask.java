package day04.wrapper;

public class WrapperClassTask {

	public static void main(String[] args) {
//		래퍼 클래스(Wrapper Class)
//		기본 자료형(원시 자료형)을 객체처럼 다루기 위해
//		만들어진 클래스로, 해당 자료형에 유용한 메서드들이 내장되어 있다.
//		int -> Integer
//		char -> Charater
//		두 개의 타입을 제외한 나머지는 모두 첫글자만 대문자로 바꿔주면 래퍼클래스가 된다.
		
//		박싱(boxing), 언박싱(un-boxing)
//		기본 자료형과 래퍼 클래스 자료형 간의 타입 변환을 가리키는 이름
//		기본 자료형 -> 래퍼 클래스 자료형 : 박싱
//		래퍼 -> 기본 : 언박싱
//		JDK1.5버전 이후로는 이러한 박싱과 언박싱이 자동으로 이루어지는데
//		이를 오토박싱, 오토언박싱이라고 부른다.
		
		Integer autoBoxing = 13; // 오토박싱
		int autoUnboxing = new Integer(30); // 오토언박싱
		autoUnboxing = Integer.valueOf(30); // 언박싱
		
//		기본자료형은 동등연산자(==)를 이용하여 그 값의 동일 여부를
//		판단할 수 있지만
//		참조 자료형(클래스, 배열,...)은 주소값을 담고 있기 때문에
//		동등연산자로는 참조하고 있는 주소값이 같은지를 비교한다.
//		때문에, 래퍼 클래스의 값이 서로 동등한지 비교하려면
//		.equals(비교하고자하는값)메서드를 사용해야 한다.
		System.out.println(Integer.valueOf(30)== Integer.valueOf(30)); // true
		System.out.println(new Integer(30) == new Integer(30)); // false 주소값 비교
		System.out.println(new Integer(30).equals(new Integer(30))); // 값을 직접 비교
		
		
		
		
		
		
		
		
	}

}
