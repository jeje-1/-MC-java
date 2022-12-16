package com.mc.e_soultion;

public class CofffeeThread implements Runnable {
	
	private Bottle bottle;
	
	public CofffeeThread(Bottle bottle) {
		super();
		this.bottle = bottle;

	}
	@Override
	public void run() {
		
		School school = new School();
		Home home = new Home(school);
		school.setHome(home);
		
		while(true) {
			school.leaveSchool("커피소년");	
			System.out.println(Thread.currentThread().getName() + ": 커피 발견!");
			System.out.println(Thread.currentThread().getName() + ":" + bottle.input("커피") + " 마신다. ");
		
			}
	
	

}
		
}
