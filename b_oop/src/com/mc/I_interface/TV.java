package com.mc.I_interface;

//클래스 명사 인터페이스 형용사 메서드 동사
public class TV extends Product{

	private int inch;
	
	public TV() {
		// TODO Auto-generated constructor stub
	}

	public TV(String brand, String pName, int price, int inch) {
		super(brand, pName, price);
		this.inch = inch;
	}

	public int getInch() {
		return inch;
	}

	public void setInch(int inch) {
		this.inch = inch;
	}
	
	public String toString() {
		return "Tv [brand=" + brand + ", pName=" + pName + ", price=" + price + ", inch=" + inch + "]";
	}
	
	
}
