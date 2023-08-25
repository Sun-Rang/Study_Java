package exam;

public class Ex14TwoDArray {
	public static void main(String[] args) {
		String[] snacks = {"초코송이","빼빼로","포카칩"};
		String[] drinks = {"아침햇살", "포카리스웨트", "봉봉"};
		String[] coffee = {"아아", "디카페인커피", "라떼"};
		
		
		// 배열 생성시 반드시 "길이, 크기"가 정의
		// 다차원 배열 선언시 데이터 타입은 하위 차원의 자료형을 따른다
		// [1차원 3개][인덱스?]
		
		String[][] store = new String[3][];
		store[0] = snacks;
		store[1] = drinks;
		store[2] = coffee;
		
		System.out.println(drinks[1]);
		System.out.println(store[1][1]);
		
		String[][] store2 = {snacks,drinks,coffee};
	}
}
