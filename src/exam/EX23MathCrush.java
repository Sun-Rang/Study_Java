package exam;

public class EX23MathCrush {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.out.println(isDivisior(10,2));
//		
//		System.out.println(isDivisior(9,2));
//		
//		getDivisior(10);
//		getDivisior(16);
//		getDivisior(24);
//		getDivisior(1000);
//		
//		boolean perfect = isPerfectNumber(6);
//		System.out.println(perfect);
		
		int startValue = 2;
		int endValue = 10000;
		
		for(int i = startValue; i <= endValue; i++) {
			if (i == startValue) {
				System.out.print("완전수 : ");
			}
			if(isPerfectNumber(i)) {
				System.out.printf("%d ",i);
			}
		}
	}
	
	public static boolean isPerfectNumber(int num) {
		return num * 2 == getSumOfDivisors(num);
	}
	
	public static boolean isDivisior(int a, int b) {
		return a % b == 0;
	}
	// boolean 데이터 타입이므로 return에 조건식을 넣으면 그게 true면 true를 출력하고 false면 false를 출력함
	
	public static void getDivisior(int num) {
		System.out.println(num + "의 약수의 합 : " + getSumOfDivisors(num));
		
		System.out.printf("%d 의 약수 :",num);
		System.out.printf("%d ", 1);
		
		for (int i = 2; i <= num / 2; i++)
		{
			if (isDivisior(num, i))
			{
				System.out.printf("%d ",i);
			}
		}
		System.out.print(num);
		System.out.println();
		
	}
	
	public static int getSumOfDivisors(int num) {
		int result = num+1; // num 어차피 마지막에 더 할거니까
		for (int i = 2; i <= num / 2; i++)
		{
			if (isDivisior(num, i))
			{
				result += i;
			}
		}
		return result;
	}
}
