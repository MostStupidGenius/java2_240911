package day02.innerClass.task;

public class AnimalTask {
	public static void main(String[] args) {
		Bat bat = new Bat();
		Flyingfish flyfish = new Flyingfish();
		Penguin peng = new Penguin();
		Shark shark = new Shark();
		Sparrow sprw = new Sparrow();
		Whale whale = new Whale();
		
		Fly[] arrFlys = new Fly[] {
			flyfish,
			bat,
			sprw,
		};
		
//		for (Fly fly : arrFlys) {
//			fly.flying();
//		}
		
		Swim[] arrSwims = new Swim[] {
			flyfish,
			whale,
			shark,
			peng,
		};
		
		for (Swim swim : arrSwims) {
//			((Mammal)swim).mammaling();// 런타임 에러 가능성
			if(swim instanceof Mammal) { // 타입 검사 후
				// Mammal로 캐스팅 해준다.
				((Mammal) swim).mammaling();
			}
			swim.swimming();
			
		}
		
		Fish[] arrFishs = new Fish[] {
				flyfish,
				shark,
		};
		
		for (Fish fish : arrFishs) {
			if(fish instanceof Fly) {
				((Fly)fish).flying();
			}
			fish.egging();
			fish.swimming();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
