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
		
		System.out.println("Hello".compareTo("World"));
		
//		.compareToIgonoreCase(String str2)
//		compareTo()메서드와 동일하지만 문자열의 대소문자를 구분하지 않는다.
		System.out.println("HELLO".compareToIgnoreCase("hello"));
		
//		.comcat(String str)
//		문자열과 전달된 문자열을 서로 연결시켜 새로운 문자열을 반환하는 메서드다.
		String text = "Hello".concat(", World").concat("!");
		System.out.println(text);
		
//		.indexOf(String|char)
//		해당 문자열에서 전달된 문자 혹은 문자열이 처음으로 등장하는
//		번째의 인덱스 값을 반환하는 메서드다.
//		만약에 해당되는 문자나 문자열을 찾을 수 없으면
//		-1을 반환한다.
		
		int index = "Hello".indexOf("lo");
		System.out.println(index);
		
//		.trim() & .strip()
//		문자열의 앞뒤 공백문자를 제거해주는 메서드.
		System.out.print("  H\n ".strip());
		System.out.print("  H.\t\n ".trim());
		System.out.println();
		
//		.toLowerCase() & .toUpperCase()
		String text2 = "Hello, Wolrd";
		System.out.println(text2.toLowerCase());
		System.out.println(text2.toUpperCase());
		
//		.repeat(int)
//		전달된 파라미터의 수만큼 해당 문자열을 반복한
//		새로운 문자열을 만들어 반환하는 메서드.
		System.out.println(text2.repeat(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
