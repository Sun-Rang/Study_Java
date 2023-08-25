package exam;

public class EX22Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		printsum(1,2);
		System.out.println(getName());
		todayGwangjuWeather();
	}
	
	// 매개변수 O, 리턴타임 O
	public static int sum(int a, int b) {
		return a + b;
	}
	// 매개 변수 O, 리턴타입 X
	public static void printsum(int a, int b) {
		System.out.println(sum(a,b));
	}
	// 매개 변수 X, 리턴타입 O
	public static String getName() {
		return "선동진";
	}
	// 매개 변수 X, 리턴타입 X
	public static void todayGwangjuWeather() {
		System.out.println("오늘 광주 하늘은 비옴");
	}
}
