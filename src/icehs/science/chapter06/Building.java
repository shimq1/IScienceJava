package icehs.science.chapter06;
// 건물명, 주소, 전체 층 수 를 속성으로 가지고,
// "엘리베이터를 운행한다.", "주소를 변경한다." 라는 행동을 하는 건물 클래스를 작성해보자.

public class Building {
	String name;			// 건물명
	String address;			// 주소
	int totalFloor;			// 전체 층 수
	
	public void moveElevator() {
		System.out.println("엘리베이터를 운행합니다.");
	}
	
	public void changeAddress(String newAddress) {
		address = newAddress;
	}
}
