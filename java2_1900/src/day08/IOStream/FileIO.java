package day08.IOStream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileIO {

	public static void main(String[] args) {
		try {
			File file = new File("test.txt");
			
			// 만약 해당되는 파일 경로에 해당 파일이 없다면
			if(!file.exists()) {
//				해당 파일 경로에 파일을 새로 만들어라.
				file.createNewFile();
			}
			
//			파일에 데이터 쓰기
			FileWriter writer = new FileWriter(file);
			BufferedWriter bwriter = new BufferedWriter(writer);
			
			bwriter.write("hello, world");
			bwriter.close();
			
//			파일에서 데이터 읽기
			FileReader reader = new FileReader(file);
			BufferedReader breader = new BufferedReader(reader);
			
			String line = "";
			while((line = breader.readLine())!= null) {
				System.out.println(line);
			}
			breader.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
	}

}
