package day07.task;

import java.util.Arrays;
import java.util.List;

public class Student {
	String name;
	int[] scores;
	int scoreSilgi;

	public Student(String name, int[] scores, int scoreSilgi) {
		this.name = name;
		this.scores = scores;
		this.scoreSilgi = scoreSilgi;
	}

	public int getAvg() {
//		return Arrays.stream(this.scores).average().getAsDouble();
		return this.getSum() / this.scores.length;
	}

	// 필기 점수의 합
	public int getSum() {
		return Arrays.stream(this.scores).sum();
	}

	public static void main(String[] args) {
		List<Student> students = Arrays.asList(
			new Student("정이준", new int[] { 45, 60, 50, 75, 85 }, 90),
			new Student("안도윤", new int[] { 80, 40, 65, 75, 55 }, 70),
			new Student("김하준", new int[] { 50, 65, 70, 80, 40 }, 75),
			new Student("고은우", new int[] { 60, 45, 75, 70, 45 }, 65),
			new Student("백서준", new int[] { 55, 80, 55, 90, 50 }, 60),
			new Student("김서아", new int[] { 90, 85, 90, 65, 50 }, 60),
			new Student("윤이서", new int[] { 35, 55, 80, 70, 45 }, 80),
			new Student("박아윤", new int[] { 50, 40, 75, 70, 60 }, 65),
			new Student("이지아", new int[] { 70, 90, 60, 85, 70 }, 55),
			new Student("정하윤", new int[] { 80, 65, 60, 80, 70 }, 80)
		);

//		1. 필기 점수의 평균을 구하고 평균 점수가 60점 이상인 학생의 이름 출력
		System.out.println("1번 평균 점수 60점 이상인 학생");
		students.stream()
		.filter( // 만약
				e -> Arrays.stream(e.scores) // 필기 점수를 스트림으로 변환
				.average() // 평균 점수
				.getAsDouble() >= 60) // 평균 점수가 60점 이상인 경우
		.map(e -> e.name) // 이름을
		.forEach(System.out::println); // 출력

//		2. 필기 점수 중 하나라도 40점 미만인 학생의 이름 출력
		System.out.println("2번 하나라도 40점 미만");
		students.stream()
		.filter( // 만약
				e -> Arrays.stream(e.scores) // 필기 점수 중
				.min() // 최솟값이
				.getAsInt() < 40) // 40점 미만이라면
		.map(e -> e.name) // 이름을
		.forEach(System.out::println); // 출력

//		3. 필기, 실기 통합, 모든 점수가 60점 이상인 학생 수 출력
		System.out.println("3번 모든 점수 60점 이상");
		students.stream()
		.filter( // 만약
			e -> Arrays.stream(e.scores) // 필기 점수 중 
				.min() // 최솟값이
				.getAsInt() >= 60 & // 60점 이상이고 
				e.scoreSilgi >= 60) // 실기도 60점 이상이라면
		.map(e -> e.name) // 이름을
		.forEach(System.out::println); // 출력

//		4. 필기와 실기 기준에 따른 합격자와 그 평균점수 출력
		System.out.println("4번 합격자와 평균점수");
		students.stream()
		.filter( // 만약
			e -> Arrays.stream(e.scores) // 필기 점수 중
			.min() // 최솟값이
			.getAsInt() >= 40 & // 40점 이상이고 
			(Arrays.stream(e.scores).sum() + e.scoreSilgi) // 필기, 실기 총합을
			/ (e.scores.length + 1) // 과목수로 나눈 전과목 평균이
			>= 60 & // 60점 이상이고 
			e.scoreSilgi >= 60 // 실기 점수도 60점 이상이면
		).forEach(e -> { // 합격자 이름과 전체 평균 출력
			System.out.println("합격자: " + e.name + "\n전체 평균 : "
					+ (Arrays.stream(e.scores).sum() + e.scoreSilgi) / (e.scores.length + 1));
		});

	}
}
