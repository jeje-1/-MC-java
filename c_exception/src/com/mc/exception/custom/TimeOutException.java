package com.mc.exception.custom;


// 예외클래스를 직접 만들어보자.
// checked Exception : Exception 클래스를 상속받은 클래스를 만들면, Checked Exception으로 사용할 수 있다.
// Unchecked Exception(Runtime Exception) : RuntimeException을 상속받은 클래스를 만들면 Unchecked Exception으로 사용할 수 있다. 
public class TimeOutException extends Exception{

	// 객체직렬화 시에 사용
	// 객체직렬화 : 통신에서 객체를 전달하기 위해 디지털 신호로 표현하기 위한 2진값으로 변경
	// serialVersionUID : 직렬화 과정에서 클래스를 고유하게 식별하기 위한 ID
	//					만약 작성하지 않을 경우, jvm 임의로 부여한다. 
	private static final long serialVersionUID = -6289611015850847914L;
	
	public TimeOutException(String message) {
		//Exception의 생성자 매개변수로 message를 전달
		//getMessage()를 통해서 확인
		//StackTrace를 출력시 함께 출력됨
		super(message);
	}

}
