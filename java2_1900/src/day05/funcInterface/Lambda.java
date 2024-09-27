package day05.funcInterface;

public class Lambda {

	public static void main(String[] args) {
//		람다식 == 익명 메서드
//		(매개, 변수, 목록) -> {로직}
//		Runnable 인터페이스를 구현해서 사용해야 한다.
		Runnable r = () -> {
			System.out.println("runnable");
		};
//		r.run();
		
//		함수형 인터페이스 : 일대일 함수
//		@FunctionalInterface라는 어노테이션을 붙인 인터페이스로,
//		하나의 추상 메서드만 가지고 있는 인터페이스를 의미한다.
//		메서드를 단 하나만 가지고 있기 때문에
//		람다식으로 구현할 때, 메서드 이름을 적을 필요가 없어진다.
		
//		기존에 배웠던 익명 클래스를 구현하는 방법은 아래와 같다.
		Operater sub = new Operater() {
			public int oper(int num1, int num2) {
				return num1 - num2;
			};
		};
		
		System.out.println(sub.oper(30, 20));
		
//		위와 같이 작성을 하면 너무 코드가 길어지고
//		함수형 인터페이스에는 하나의 메서드만 존재하기 때문에
//		굳이 메서드 하나를 구현하고자 네 줄을 쓰는 건 생산성 낭비다.
		
		Operater sum = (x, y) -> {
			return x+y;
		};
		
		int result = sum.oper(10, 23);
		System.out.println(result);
		
//		곱하기 기능을 람다식으로 구현
		Operater multi = (x, y) -> x * y;
		System.out.println(multi.oper(12, 36));
		
		
		
		
		
		
		
		
		
		
	}

}
