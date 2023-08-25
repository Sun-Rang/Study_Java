package exam;

public class Ex10Format {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "나예호";
		int age = 21;
		String mbti = "ENFJ";
		
		// 이름 : 나예호, 나이 : 21(세), MBTI : ENFJ
		
		// 1. String.format()
		// 2. System.out.printf()
		
		// 2.System.out.printf()
		System.out.printf("이름 : %s, 나이 : %d(세), MBTI : %s%n",name, age, mbti);
		
		// 1. String.format()
		String info = String.format("이름 : %s, 나이 : %d(세), MBTI : %s",name, age, mbti);
		System.out.println(info);
		
		// %숫자s : 숫자 자릿수만큼 표현!! (오른쪽 정렬)
		// 왼쪽 정렬 : 숫자 앞에 - 붙여서
		System.out.printf("%s", "*");
	}

}
