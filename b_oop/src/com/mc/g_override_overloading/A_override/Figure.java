package com.mc.g_override_overloading.A_override;

public abstract class Figure {
	private String privateTest = "private 변수도 상속이 안됩니다.";
	public int area = 0;
	
	public abstract double calArea();
	
	public void testBody() {
		System.out.println("추상클래스에도 구현부가 있는 메서드를 만들 수 있다.");
	}
	
	private void testExtends() {
		System.out.println("private은 상속이 안됩니다.");
	}
	
	public static void testStaticExtends() {
		System.out.println("static은 상속이 안됩니다.");
	}

}
