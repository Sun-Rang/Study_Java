package exam;


public class EX25OOP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// OOP (Object - Oriented Programming)
		
		// 1. 기본 데이터 타입
		// 2. 레퍼런스 데이터 타입
		//	- 1) 배열에 대한 레퍼런스
		//	- 2) 클래스에 대한 레퍼런스
		//	- 3) 인터페이스에 대한 레퍼런스
		
		int num = 5;
		House dongJin_house = new House();
		dongJin_house.price = 200000000;
		dongJin_house.area = 20;
		dongJin_house.isApart = true;
		
		System.out.println(dongJin_house.price);
		
		House parent_house = new House();
		parent_house.price = 20000000;
		
		System.out.println(parent_house.price);
		System.out.println(dongJin_house.price);
		
	}

}
