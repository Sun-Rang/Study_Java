package exam;

import java.util.Arrays;

public class Ex19Sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정렬
		// 탐색하기 위해 자료를 규칙적으로 열거

		// 1. Bubble Sort
		int[] array = { 42, 7, 11, 82, 25 };
		int temp = 0;
		int cnt = 0;
		// 오름차순 정렬 후 : 7 12 25 42 82

		// cycle 2
		for (int j = array.length-1; j >= 1; j--) {
			for (int i = 0; i < j; i++) {
				if (array[i] > array[i + 1]) {
					// 치환
					temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
				}
			}
		}

		System.out.println(Arrays.toString(array));
	}

}
