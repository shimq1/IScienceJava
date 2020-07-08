package icehs.science.chapter07;

public class ItBook {
	private String title;
	private int price;
	private double discountRate;
	
	public ItBook(String title, int price, double discountRate) {
		this.title = title;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	private int calculatePriceWithDiscount() {
		double afterPrice = price * (100 - discountRate) / 100;
		return (int)afterPrice;
	}
	public void printBookInfo() {
		System.out.println("���� : " + this.title + ", ���� : " + this.price + ", ������ : " + this.discountRate + "%, ���ΰ� : " + this.calculatePriceWithDiscount() + " ��");
	}
}