package com.mc.d_encapsulation.after;


public class Run {

	public static void main(String[] args) {
		
		
		// 제조사, 상품명, 가격, 인치(크기)
				TV TV = new TV("LG,", "LG티비", 3000000, 52);
				// 제조사, 상품명, 가격, cpu, ram, 일체여부
				Desktop Desktop = new Desktop("삼성", "울트라", 2000000, "intel", 16, true);
				// 제조사, 상품명, 가격, cpu, ram, 통신
				SmartPhone SmartPhone = new SmartPhone("사과", "아이폰", 13000000, "긱벤치", 8, "SKT");
		
				System.out.println(Desktop);
				System.out.println(TV);
				System.out.println(SmartPhone);
				
	
	}

}
