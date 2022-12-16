package com.mc.c_race_condition;

public class Run {
	
	public static void main(String[] args) {
		
		Bottle bottle = new Bottle();
		
		
		Thread coffee = new Thread(new CofffeeThread(bottle));
		Thread soy = new Thread(new SoyThread(bottle));
		
		coffee.setName("커피소년");
		soy.setName("간장소년");
		
		coffee.start();
		soy.start();
		
	}
}
