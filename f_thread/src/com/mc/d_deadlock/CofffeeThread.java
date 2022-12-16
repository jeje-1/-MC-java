package com.mc.d_deadlock;

public class CofffeeThread implements Runnable {
	
	private School school;
	private Bottle bottle;
	
	public CofffeeThread(School school,Bottle bottle) {
		super();
		this.bottle = bottle;
		this.school = school;
	}
	@Override
	public void run() {
		while(true) {
			school.leaveSchool("커피소년");	
			System.out.println(Thread.currentThread().getName() + ": 커피 발견!");
			System.out.println(Thread.currentThread().getName() + ":" + bottle.input("커피") + " 마신다. ");
		
			}
	
	

}
		
}
