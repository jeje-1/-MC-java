package com.mc.e_soultion;

public class School {
	
	private Home home;
	
	public School() {
		
	}

	public School(Home home) {
		super();
		this.home = home;
	}
	
	public synchronized void goToSchool(String name) {
		System.out.println(name + "학교로 가는 중 ...");
	}
	
	public synchronized void leaveSchool(String name) {
		System.out.println(name + "학교를 떠납니다.");
		home.gotToHome(name);
	}

	public Home getHome() {
		return home;
	}

	public void setHome(Home home) {
		this.home = home;
	}





	
	
	
}
