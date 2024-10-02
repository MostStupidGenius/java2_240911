package day06.stream.maxBy;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Score {
//	점수들
	int math;
	int kor;
	int eng;
	String name;
	
	public Score(int m, int k, int e, String name) {
		math = m;
		kor = k; 
		eng = e;
		this.name = name;
	}
	
	public int getMath() {
		return this.math;
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return this.eng;
	}
	
	public String getName() {
		return this.name;
	}
	
	
	public static void main(String[] args) {
		Stream<Score> scores = Stream.of(
				new Score(80, 90, 75, "jason"),
				new Score(85, 70, 85, "john"),
				new Score(72, 85, 95, "mike")
		);
		Optional<Score> opS = scores.collect(
				Collectors
				.maxBy(Comparator
						.comparing(Score::getEng)
			)
		);
		Score mathMax = opS.get();
		System.out.println(mathMax.name);
		
		scores = Stream.of(
				new Score(80, 90, 75, "jason"),
				new Score(85, 70, 85, "john"),
				new Score(72, 85, 95, "mike")
		);
		Double resultDouble = scores.collect(
				Collectors
				.averagingInt(
	//				Score::getMath // 두 방식 모두 가능
					e -> e.getMath()
				));
		System.out.println((float)(double)resultDouble);
		
//		.joining(문자열 | 문자)
//		전달된 문자열이나 문자를 구분자로 하여
//		스트림의 요소들을 하나의 문자열로 합치는 기능
		scores = Stream.of(
				new Score(80, 90, 75, "jason"),
				new Score(85, 70, 85, "john"),
				new Score(72, 85, 95, "mike")
		);
//		....map(e -> e.getName())....
		String result = scores.map(Score::getName).collect(
				Collectors.joining(", ")
				);
		System.out.println(result);
		
		
		
		
		
		
		
	}
}
