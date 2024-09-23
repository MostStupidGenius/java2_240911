package day03.stringClass;

public class StringTask {

	public static void main(String[] args) {
		String str = "Hello, world";
		
//		.chatAt(int index)
//		해당 문자열의 index번째 문자를 문자형(char)으로
//		반환하는 메서드
//		System.out.println(str.charAt(5));
//		System.out.println(str.length());
		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ch >= 'a' & ch <= 'z') {
				// 이 문자는 소문자 자료형이다.
				System.out.print(ch);
			} else if(ch >= 'A' & ch <= 'Z') {
				// 이 문자는 대문자 자료형이다.
				System.out.print(ch);
			}
		}
		System.out.println();
//		.compareTo(String str2)
//		원본 문자열과 전달된 문자열을 비교하여
//		두 문자열 사이의 거리를 정수로 나타내는 메서드다.
		
		System.out.println("Hello".compareTo("Hello"));
		
		
		
		
		
		
		
		
		
		
	}

}
