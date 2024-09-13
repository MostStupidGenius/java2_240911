package day01.inheritance;

public class Child extends ParentClass {
	
	// 생성자
	// 자식클래스의 생성자는
	// 부모클래스의 기본생성자를 보이지 않지만,
	// 생성자 최상단에 한번 호출을 해야 한다.
	// 그런데, 부모클래스에 기본 생성자가 정의되어있지 않다면
	// 다른 생성자를 호출하거나, 부모클래스에 기본생성자를 만들어야 한다.
	
	public Child() {
//		super(""); // 부모클래스의 생성자를
		// 가장 위에 호출해야 한다.
		System.out.println("");
	}
	
//	public Child(String name) {
//		super(name);
//	}
	
	@Override
	public void printInfo() {
//		super.printInfo();
		System.out.println(this.name + " " + this.age);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		Child c = new Child();
		c.name = "hong";
		c.age = 30;
		c.setName("kim");
		c.printInfo();
		
		System.out.println(c.toString());
		
		
		
	}
}
