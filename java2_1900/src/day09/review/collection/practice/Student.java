package day09.review.collection.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Student {

	private static int seq;

	private Integer id;
	private String name;
	private HashMap<String, Integer> scores;
	private static HashSet<String> subjects;

	static {
		seq = 0;
		List<String> subjectsTemp = Arrays.asList("Korean", "Math", "English");
		subjects = new HashSet<String>(subjectsTemp);
	}

	{
		seq++;
		this.id = seq;
	}
	
	public Student(String name, HashMap<String, Integer> scores) {
		this.name = name;
		this.scores = scores;
	}
	
	public Student(String name) {
		this(name, new HashMap<String, Integer>());
	}

	public static int getSeq() {
		return seq;
	}

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 전체 점수를 가져오는 메서드
	public HashMap<String, Integer> getScores() {
		return scores;
	}
	
	// 특정 과목을 전달하면 그 과목의 점수를 가져오는 메서드
	public Integer getScore(String subject) {
		return this.getScores().get(subject);
	}

	public void setScores(HashMap<String, Integer> scores) {
		this.scores = scores;
	}
	
	// 특정 과목의 점수를 넣는 메서드
	public Integer setScore(String subject, Integer score) {
		return this.getScores().put(subject, score);
	}

	public static HashSet<String> getSubjects() {
		return subjects;
	}

	public static void main(String[] args) {

	}

}
