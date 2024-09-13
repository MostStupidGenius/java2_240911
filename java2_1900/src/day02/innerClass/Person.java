package day02.innerClass;

public abstract class Person {
	String name;
	
	abstract void printName();
	
	public static void main(String[] args) {
		Person p = new Person() {
			
			@Override
			void printName() {
				System.out.println(name);
			}
		};
		p.name = "hong";
		
		p.printName();
		
		Person p2 = new Person() {
			
			@Override
			void printName() {
				System.out.println("내 이름은 " + name);
			}
		};
		
		p2.name = "kim";
		p2.printName();
		
		
		
		
		
		
		
		
	}
}
