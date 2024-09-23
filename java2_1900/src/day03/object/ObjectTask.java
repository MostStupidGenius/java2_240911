package day03.object;

public class ObjectTask {
//		Object 최상위 클래스의 메서드들
//		최상위 클래스인 오브젝트는 모든 클래스가 상속을 받는다.
//		오브젝트에서 정의된 메서드들은 모든 클래스에서 override 할 수 있다.
//		이러한 메서드들을 배워보자.
	
	String name;
	int age;
	
	@Override
	public String toString() {
//		return super.toString();
		return "name is " + this.name + "\nage is " + this.age;
	}

	public static void main(String[] args) {
		ObjectTask ot = new ObjectTask();
		ot.name = "홍";
		ot.age = 30;
		System.out.println(ot);
	}

}
