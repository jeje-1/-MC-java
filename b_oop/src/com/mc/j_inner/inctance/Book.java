package com.mc.j_inner.inctance;

public class Book {
	
	private String name;
	private Integer price;
	private String author;
	private Boolean hasStock;
	
	private Book(Builder builder) {
		this.name = builder.name;
		this.price = builder.price;
		this.author = builder.author;
		this.hasStock = builder.hasStock;
	}
	
	//inner static 클래스를 사용해서 속성을 초기화
	public static class Builder{
		
		private String name;
		private Integer price;
		private String author;
		private Boolean hasStock;
		
		public Builder name(String name) {
			//inner static 클래스는 외부 클래스의 인스턴스변수에 접근이 불가능
			//외부클래스의 인스턴스 없이도 내부클래스를 인스턴스화 할 수 있기 때문.
			this.name = name;
			return this;
		}
		
		public Builder price(Integer price) {
			this.price = price;
			return this;
		}
		
		public Builder author(String author) {
			this.author = author;
			return this;
		}
		
		public Builder hasStock(Boolean hasStock) {
			this.hasStock = hasStock;
			return this;
		}
		
		public Book build() {
			//builder 메서드 호출시에 반드시 필요한 속성(name,price,author)이 모두 초기화 되지 않았다면 예외를 발생시켜보자. 
			if(name == null | price==0 | author == null | hasStock == false) throw new MissingRequiredPropertyException();
			return new Book(this);
		}
	}

	@Override
	public String toString() {
		return "Book [name=" + name + ", price=" + price + ", author=" + author + ", hasStock=" + hasStock + "]";
	}
	
	
	

}
