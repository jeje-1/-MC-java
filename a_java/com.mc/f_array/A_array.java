package f_array;

import java.util.Arrays;

public class A_array {

	public static void main(String[] args) {

		
		
		
	}

	private static void studyDeepCopy() {
		String[] foodArr = {"pizza","hamburger","chicken","cake","cookies"};
		String[] copyArr = new String[foodArr.length];
		
		for (int i = 0; i < copyArr.length; i++) {
			copyArr[i] = foodArr[i];
			
		}
	
		System.out.println("copyArr : " +Arrays.toString(copyArr));
		
		copyArr[2] = "fudge";
		
		System.out.println("foodArr : " + Arrays.toString(foodArr));
		System.out.println("copyArr : " + Arrays.toString(copyArr));
		
		System.out.println("foodArr의 주소 : " + System.identityHashCode(foodArr));
		System.out.println("copyArr의 주소 : " + System.identityHashCode(copyArr));
	}

	private static void studyswallowCopy() {
		//얉은 복사 - 주소값이 넘어가는 상황
		String[] foodArr = {"pizza","hamburger","chicken","cake","cookies"};
		String[] copyArr = foodArr;
		
		copyArr[2] = "sandwich";
		
		System.out.println("foodArr의 주소 : " + System.identityHashCode(foodArr));
		System.out.println(Arrays.toString(foodArr));
		
		System.out.println("copyArr의 주소 : " + System.identityHashCode(copyArr));
		System.out.println(Arrays.toString(copyArr));
	}

	private static void stydyArray2() {
		int sum = 0;
		int sumArr = 0;
		
		
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		sum += num1;
		sum += num2;
		sum += num3;
		sum += num4;
		sum += num5;
		
		int[] iArr = {10,20,30,40,50};
		for (int i = 0; i < iArr.length; i++) {
			sumArr += iArr[i];
			
		}
		
		System.out.println(sum);
		System.out.println(sumArr);
	}

	private static void studyArray() {
		// 배열 : 같은 타입의 데이터들을 하나의 묶음으로 다루는 자료구조
		// 배열에 저장된 각 데이터들은 해당 데이터에 접근한ㄹ 수 있는 index 번호를 부여받는다.
		// 배열은 참조자료형으로 JVM heap 영역에 저장된다.
		// 참조형 변수(reference)를 통해 heap영역의 배열에 접근할 수 있고,
		// index를 통해 배열안의 데이터에 접근할 수 있다.

		// 배열 생성해보기
		// String 타입의 데이터를 5개 보관할 수 있는 배열 생성.
		String[] sArr = new String[5];

		sArr[0] = "pizza";
		sArr[1] = "hamburger";
		sArr[2] = "chicken";
		sArr[3] = "cake";
		sArr[4] = "cookies";
		
		System.out.println(sArr);
		System.out.println(sArr[4]);
		
		// 배열의 선언과 동시에 초기화 
		//크기가 5인 int[]를 선ㅎ고 각 인덱스에 5,4,3,2,1 값을 초기
		int[] iArr = new int[] {5,4,3,2,1};
		
		//iArr.length : 배열의 크
		for (int i = 0; i < iArr.length; i++) {
			
			System.out.print(iArr[i]);
		}
		System.out.println();
		
		//배열 리터럴 초기화
		int[] iArr2 = {1,2,3,4,5};
		for (int i = 0; i < iArr2.length; i++) {
			System.out.print(iArr2[i]);
		}
	}

}
