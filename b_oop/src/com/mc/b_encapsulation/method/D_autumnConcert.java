package com.mc.b_encapsulation.method;

public class D_autumnConcert {
	public void startConcert() {
		System.out.println("가을 콘서트 시작합니다!!");
		
		E_player player = new E_player("바이올린");
		player.play();
		
		System.out.println("가을 콘서트 마무리 합니다!!");
	}
	

}
