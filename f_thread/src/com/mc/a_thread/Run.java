package com.mc.a_thread;

import com.mc.a_thread.runnable.MyDaemonThread;
import com.mc.a_thread.runnable.MyRunnable;

public class Run {

	public static void main(String[] args) {
		 System.out.println("메인메서드가 동작하는 쓰래드 :" + Thread.currentThread().getName());
		 
		 //새로운 쓰래드를 생성하여 실행
		 MyThread m1 = new MyThread();
		 m1.setName("m1");
		 
		 //새로운 쓰래드를 생성하여 실행
		 Thread m2 = new Thread(new MyRunnable());
		 m2.setName("m2");
		 
		//쓰래드를 시작, 쓰래드가 생성되고 실행될 준비가 끝나면 run()을 실행
		 m2.start();
		 
		 //쓰래드를 시작, 쓰래드가 생성되고 실행될 준비가 끝나면 run()을 실행
		 m1.start();
		 
		 //세번째 데몬쓰래드 생성
		 Thread daemon = new Thread(new MyDaemonThread());
		 daemon.setDaemon(true);
		 daemon.setName("daemon Thread");
		 daemon.start();
		 
		 //쓰래드 이름을 출력
		 for (int i = 0; i < 1000; i++) {
			System.out.println(i + ":" + Thread.currentThread().getName());
			
		}

		 System.out.println("====================");
		 System.out.println("메인메서드의 마지막 코드");
		 System.out.println("====================");
		
		 
	}

}
