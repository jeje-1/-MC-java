package com.mc.e_soultion;

public class Home {
	
	private School school;

	public Home(School school) {
		super();
		this.school = school;
	}
	
	public synchronized void gotToHome(String name) {
		System.out.println(name + "집에 갑니다.");
	}
	
	public synchronized void leaveHome(String name) {
		System.out.println(name + "집을 떠나 학교에 갑니다.");
		school.goToSchool(name);
	}

}
