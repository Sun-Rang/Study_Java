package exam;

import java.util.Scanner;

public class Ex07Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 1. for
		// 대개 반복 횟수가 정해져 있을 때
		// 가로로 1 ~ 10까지 출력
		// 문법 아두이노(C++)와 동일
		for (int i = 0; i < 11; i++)
		{
			System.out.print(i + " ");
		}
		System.out.println("");
		// 2. while
		// 대개 반복 횟수가 정해져 있지 않을 때
		
		// 사용자로부터 정수를 입력받아
		// 누적 합을 출력!!
		
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int count = 0;

		System.out.print("Enter a number: ");
		while ((num = sc.nextInt()) != -1)
		{
		    count += num;
		    System.out.println("Cumulative Sum: " + count);
		    System.out.print("Enter a number: ");
		}
		System.out.println("Result: " + count);
	}

}
