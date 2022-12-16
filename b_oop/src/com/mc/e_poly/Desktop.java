package com.mc.e_poly;

public class Desktop extends Computer{
	
	private boolean allInOne;
	
	public Desktop(String brand, String pName, int price) {
		super(brand, pName, price);
		// TODO Auto-generated constructor stub
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}

	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}
	
	public String toString() {
		return "Desktop [brand=" + brand + ", pName=" + pName + ", price=" + price + ", cpu=" + cpu + ", ram=" + ram
				+ ", allInOne=" + allInOne + "]";
	}

}
