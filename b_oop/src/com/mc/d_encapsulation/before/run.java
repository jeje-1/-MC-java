package com.mc.d_encapsulation.before;

public class run {

	public static void main(String[] args) {
		
		// 부모클래스가 가진 속성, 메서드, 타입을 자식클래스에게 물려주는 것
		
		// 제조사, 상품명, 가격, 인치(크기)
		TV tv = new TV("LG,", "LG티비", 3000000, 52);
		// 제조사, 상품명, 가격, cpu, ram, 일체여부
		Desktop desktop = new Desktop("삼성", "울트라", 2000000, "intel", 16, true);
		// 제조사, 상품명, 가격, cpu, ram, 통신
		SmartPhone smartphone = new SmartPhone("사과", "아이폰", 13000000, "긱벤치", 8, "SKT");
		
		
		System.out.println(desktop);
		System.out.println(smartphone);
		System.out.println(tv);
		
		//세 클래스가 모두 가지고 있는 속성 : 제조사, 상품명, 가격     				=> Product
		//smartphone, desktop 이 공통으로 가지고 있는 속성 : cpu, ram 			=> Computer
	}
	
	

}
