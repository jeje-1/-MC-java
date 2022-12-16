package com.mc.a_modifier;

public class statictest {

	public static void main(String[] args) {
		

		//static
		System.out.println(b_static.staticVal);
		
		//heap영역에 인스턴스변수의 공간을 확보하고 초기화
		b_static nonStatic = new b_static();
		b_static ns2 = new b_static();
		
		
		//heap 영역에 올라간 객체주소를 저장하고 있는 레퍼런스를 통해 인스턴스 변수 호출
		System.out.println("nonStatic : " +nonStatic.nonStatic);
		System.out.println("ns2 : " + ns2.nonStatic);
		
		nonStatic.nonStatic = "not static";
		
		System.out.println(nonStatic.nonStatic);
		System.out.println(ns2.nonStatic);
		
		
		System.out.println(">>>>>>> nonStatic : " + nonStatic.staticVal);
		nonStatic.staticVal = "yes static";
		System.out.println(">>>>>>> nonStatic : " + ns2.staticVal);
		
		System.out.println(ns2.staticVal);
		
		System.out.println();
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

		b_static.testStatic();
		nonStatic.testMethod();
		
		

	}

}