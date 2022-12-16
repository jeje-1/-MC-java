package a_varaiable;

import java.util.Scanner;

public class Test {
		
		private static void q4() {
			Scanner sc = new Scanner(System.in);
			System.out.print("1P :");
			String p1 = sc.next();
			System.out.print("2P : ");
			String p2 = sc.next();
			String result = "";

			if (p1 == p2) {
				System.out.println(result = "비김");
			} else if (p1 == "가위") {
				if (p2 == "바위") {
					System.out.println(result = "패");
				} else {
					System.out.println(result = "승");
				}
			} else if (p1 == "보") {
				if (p2 == "바위") {
					System.out.println(result = "승");
				} else {
					System.out.println(result = "패");
				}
			} else if (p1 == "바위") {
				if (p2 == "가위") {
					System.out.println(result = "승");
				} else {
					System.out.println(result = "패");
				}
			}
			System.out.println(result);
		}

	}

