package com.mc.d_deadlock;

public class SoyThread  implements Runnable {
	
	private Home home;
	private Bottle bottle;
	
	
	public SoyThread(Home home, Bottle bottle) {
		super();
		this.home = home;
		this.bottle = bottle;
	}


	@Override
	public void run() {
		
		while(true) {
		System.out.println(Thread.currentThread().getName() + ": 간장 발견!");
		System.out.println(Thread.currentThread().getName() + ":" + bottle.input("간장") + " 을 냉장고에 넣는다. ");
		home.leaveHome("간장소녀");
		}
}
	
	
}
