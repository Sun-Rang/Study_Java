package exam;

public class Ex24MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(5,10);
		sum(5,10,15);
		
		// 메소드 중복정의 : Method Overloading
		// *한 클래스 내*에서 매개변수 타입(혹은 개수)이 다르게 중복정의
		
		// 헷갈리면 안된다!!
		// 일대일 대응 !!
	}
	
	public static void sum (double num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void sum(int num1, double num2) {
		System.out.println(num1 + num2);
	}
	
	public static void sum(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void sum(int num1, int num2, int num3) {
		System.out.println(num1 + num2 + num3);
	}
	
	

}
