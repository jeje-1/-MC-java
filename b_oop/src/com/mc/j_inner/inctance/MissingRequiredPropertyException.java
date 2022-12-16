package com.mc.j_inner.inctance;

public class MissingRequiredPropertyException extends RuntimeException{
	
	private static final long serialVersionUID = -97011106426368164L;
	
	public MissingRequiredPropertyException() {
		super("반드시 필요한 속성 중 누락된 속성이 존재합니다.");
	}
	
	public MissingRequiredPropertyException(String msg) {
		super(msg);
	}

}
