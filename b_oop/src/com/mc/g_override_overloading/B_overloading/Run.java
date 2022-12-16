package com.mc.g_override_overloading.B_overloading;

public class Run {

	public static void main(String[] args) {
		
		Circle circle = new Circle();
		circle.setRadius(5);
		
		double area = AreaCalculator.calArea(circle);
		System.out.println(area);
		
		Rectangle rectangle = new Rectangle();
		rectangle.setHeight(7);
		rectangle.setWidth(4);
		
		double recArea = AreaCalculator.calArea(rectangle);
		System.out.println(recArea);

	}

}
