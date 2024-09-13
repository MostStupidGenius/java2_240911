package day02.innerClass;

public class Dog {
	String name;
	
	void bark() {
		System.out.println("짖다.");
	}
	
	public static void main(String[] args) {
		Dog d = new Dog() {
			@Override
			void bark() {
				System.out.println("멍멍 짖다.");
			}
			
		};
		
		d.bark();
		
		
		
		
		
	}
}
