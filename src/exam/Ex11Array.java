package exam;

import java.util.Arrays;

public class Ex11Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 배열 : 동일한 자료구조를 index를 통해 관리
		// 자료 구조 : 대량의 데이터를 효율적으로 다루기 위해
		// 배열, 리스트, 큐, 스택, 트리

		// 변수의 선언
		int num; // 변수의 선언
		num = 5; // 변수의 할당 (최초 할당 : 초기화)
		num = 10; // 변수의 재할당

		int num2 = 21; // 변수의 선언 및 초기화

		// 금주 로또 번호를 담고 있는 배열 lotto
		// 래퍼런스 변수 -> 생성(new)
		int[] lotto; // 배열의 선언
		lotto = new int[6]; // 배열 생성시
		
		lotto[0] = 1;
		lotto[1] = 2;
		lotto[2] = 3;
		lotto[3] = 4;
		lotto[4] = 5;
		lotto[5] = 6;

		// 배열 index는 0-index 체계
		for (int i = 0; i < lotto.length; i++) {
			System.out.println(lotto[i] + " ");
		}
		System.out.println();
		System.out.println(Arrays.toString(lotto));
		
		// 배열 생성과 동시에 초기화!!
		
		int[] nums = new int[] {1,2,3,4,5};
		int[] nums2 = {5,6,7};

	}

}
