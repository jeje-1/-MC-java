package com.mc.d_deadlock;

public class Run {

	public static void main(String[] args) {
		
		School school = new School();
		Home home = new Home(school);
		school.setHome(home);
		
		Bottle bottle = new Bottle();
		Thread coffee = new Thread(new CofffeeThread(school,bottle));
		Thread soy = new Thread(new SoyThread(home,bottle));
		
		coffee.setName("커피소년");
		soy.setName("간장소년");
		
		coffee.start();
		soy.start();
		
	}
}
