package day08.IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileController {
	File file;
	String filePath;
	
//	생성자로 파일명 전달받기
	public FileController() {
		this.file = null;
	}
	
	public FileController(String filePath) {
		this.setFilepath(filePath);
	}
	
//	파일경로 입력 메서드
	public void setFilepath(String filePath) {
		this.filePath = filePath;
		this.file = new File(filePath);
	}
	
//	파일에 내용 쓰기
	public void write(String text) throws Exception {
		if(!file.exists()) { // 파일이 없다면
			file.createNewFile(); // 새 파일을 만들어라
		} else { // 파일이 이미 있다면
			// 덮어쓰기 물어보고
			System.out.println("filepath is already exists.");
			System.out.print("overwrite? (y/n)");
			Scanner sc = new Scanner(System.in);
			String answer = sc.nextLine();
			if(!answer.toLowerCase().equals("y")) {
				// 입력한 값이 Y 혹은 y가 아닌 값이라면
				return; // 메서드 종료
			}
		}
		FileWriter writer = new FileWriter(file);
		BufferedWriter bwriter = new BufferedWriter(writer);
		bwriter.write(text);
		bwriter.close();
		System.out.println(this.filePath + " 경로에 저장되었습니다.");
	}
	
//	public ArrayList<String> read() throws Exception {
//		ArrayList<String> result = new ArrayList<String>();
//		FileReader reader = new FileReader(file);
//		BufferedReader breader = new BufferedReader(reader);
//		String line = "";
//		
//		while((line = breader.readLine()) != null) {
//			result.add(line);
//		}
//		breader.close();
//		return result;
//	}
	public ArrayList<String> read() {
		ArrayList<String> result = new ArrayList<String>();
		try {
			if(!file.exists()) {
				return result;
			}
			FileReader reader = new FileReader(file);
			BufferedReader breader = new BufferedReader(reader);
			String line = "";
			
			while((line = breader.readLine()) != null) {
				result.add(line);
			}
			breader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public static void main(String[] args) {
		FileController fc = new FileController("test1.txt");
//		try {
//			fc.write("hello, world.\ngood day.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		try {
//			for (String string : fc.read()) {
//				System.out.println(string);
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		
	}

}
