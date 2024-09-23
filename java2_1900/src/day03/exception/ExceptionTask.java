package day03.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTask {

	public static void main(String[] args) {
//		예외 처리(Exception handling)
//		try { 예외가 발생할 수 있는 코드
//		} catch(~~~Exception e){ // 특정 예외 타입
//			예외가 발생했을 때 실행될 코드
//			catch로 예외를 잡아내면,
//			프로그램은 강제종료되지 않는다.
//		} catch(Exception e){ // 모든 예외 객체의 최상위 타입
//			정의되지 않은 다른 모든 예외에 대한 처리
//		} finally {
//			예외 발생 여부와 무관하게 반드시 실행되는
//			코드 블록
//		}
		// 숫자값을 전달받아 변수에 담아 사용한다.
		// 숫자가 아닌 값을 전달받을 경우,
		// 다시 입력받도록 예외 처리한다.
//		Scanner sc = new Scanner(System.in);
//		int inputNum = 0;
//		while (true) {
//			System.out.print("숫자 입력 >> ");
//			try {
//				inputNum = Integer.parseInt(sc.nextLine().strip().replaceAll(" ", ""));
//			} catch (NumberFormatException e) {
//				// 입력된 값이 기대했던 타입과 불일치할 때
//				// 발생하는 예외
////				System.err.println(e);
//				System.err.println("입력된 값이 숫자가 아닙니다.\n다시 입력해주세요.");
//				continue;
//			}
//			sc.close();
//			break;
//		}
		inputNum();

	}

	public static void inputNum() {
		int inputNum = 0;
		while (true) {
			// 참조객체는 더이상 참조하는 참조변수가 없으면
			// 자동으로 메모리에서 내려간다.
			Scanner sc = new Scanner(System.in);
			System.out.print("숫자 입력 >> ");
			try {
				inputNum = sc.nextInt();
				break;
			} catch (InputMismatchException e) {
				// 입력된 값이 기대했던 타입과 불일치할 때
				// 발생하는 예외
//				System.err.println(e);
				System.err.println("입력된 값이 숫자가 아닙니다.\n다시 입력해주세요.");
				continue;
			}
		}
		System.out.println(inputNum);
	}

}
