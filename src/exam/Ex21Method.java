package exam;

public class Ex21Method {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Method(기능) : Python 함수와 동일!
		// 자주 쓰는 기능을 정의
		
		System.out.println(sum(5,10));
		System.out.println(sum(10,20));
		System.out.println(sum(100,200));
		System.out.println(sum(200,300));
		
	}
	
	// Method 정의
	public static int sum(int a, int b) {
		int result = a + b;
		return (int)(result * 1.2);
	}
}
