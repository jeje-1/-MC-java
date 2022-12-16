package com.mc.I_interface;

//인터페이스끼리는 다중 상속이 가능하다.
public interface Communicatable extends HTTP, FTP{
	void sendMessage();
	void receiveMessage();
}
