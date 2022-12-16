package c_control;

import java.util.Scanner;

//break : 반복문에서 즉시 탈출
// continue : 실행코드 안에서 continue를 만날 경우 즉시 반복문의 조건식으로 이
public class G_branching {

	public static void main(String[] args) {

		// 사용자로부터 문자열을 입력받아 반복출력하는 반복문을 작성하라.
		// 사용자로부터 end라는 문자열을 입력받을 경우 반복문은 멈춘다.

		// studyBranching();
		int sum = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 4 == 0) continue;
			sum += i;

		}

		System.out.println(sum);
	}



	private static void studyBranching() {
		Scanner sc = new Scanner(System.in);
		boolean flg = true;

		while (flg) {
			System.out.println("메세지를 입력하세요.");
			String message = sc.nextLine();

			if (!message.equals("end")) {
				System.out.println(message);
				continue;

			}

			System.out.println("프로그램을 종료합니다.");
			break;
		}

		System.out.println("반복문 수행 이후 메인메서드 종료");
	}

//if(message.equals("end") ) {
//System.out.println("프로그램을 종료합니다.");
//flg = false;
////return; //반복문 뿐만 아니라, 반복문이 사용된 메서드를 멈추고 호출부로 돌아가낟. 
//break; // 즉시 반복문 탈출
}
