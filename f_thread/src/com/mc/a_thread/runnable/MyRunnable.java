package com.mc.a_thread.runnable;

public class MyRunnable implements Runnable{
	 
	@Override
	public void run() {
		
		try {
			Thread.currentThread().join();
			
			 for (int i = 0; i < 100; i++) {
				 //쓰래드 이름을 출력
				 System.out.println(i + ":" + Thread.currentThread().getName());
					
				}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
