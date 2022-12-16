package com.mc.coffeemanager.service.code;


//enum(enumerated type) : 열거형 
//서로 연관된 상수들의 집합
//서로 연관된 상수들을 편한게 다루기 위한 enum만의 문법과 메서드가 제공된다. 
public enum OrderStatus {


	//OK(0, "주문 생성 성공") -> public static final OrderStatus OK = new OrderStatus(0, "주문 생성 성공");
	OK(0, "주문 생성 성공"),
	FAIL_CAUSE_SOLDOUT(1, "품절로 인한 주문 실패"),
	FAIL_CAUSE_STOCK(2, "재고 부족으로 인한 주문 실패"),
	FAIL_CAUSE_SEASON(3, "시즌상품은 시즌에만 주문가능합니다."),
    COMPLETE(4, "주문완료");
	
	private int code;
	private String desc;
	
	private OrderStatus(int code, String desc) {
		this.code = code;
		this.desc = desc;
	}
	
	public boolean isOK() {
		return code == OK.code;
	}
	
	public boolean isComplete() {
		return code == COMPLETE.code;
	}
	
	public boolean isFail() {
		
		if(code == FAIL_CAUSE_SOLDOUT.code ||
		   code == FAIL_CAUSE_STOCK.code ||
		   code == FAIL_CAUSE_SEASON.code) {
			return true;
		}
		return false;
	}
	public String desc() {
		return desc;
	}

}


