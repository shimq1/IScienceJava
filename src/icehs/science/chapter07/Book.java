package icehs.science.chapter07;

public class Book {
	String title;
	String author;
	int price;
	
	Book(){
		
	}
	
	Book(String title, int price){
		this(title);
		this.price = price;
	}
	
	Book(String title, String author, int price){
		this(title, price);
		this.author = author;
	}
	
	Book(String title){
		this.title = title;
	}
	
	void printBookInfo() {
		System.out.println(this.title);
		System.out.println(this.price);
	}
}
