package exam;

import java.util.Arrays;

public class Ex18Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 정렬
		// 2. Selection Sort
		int[] array = { 98, 7, 70, 13, 24 };
		int maxIndex = 0;
		int temp = 0;

//		if(array[0] > array[maxIndex])
//		{
//			maxIndex = array[0];
//		}
//		if(array[1]>array[maxIndex])
//		{
//			maxIndex = array[1];
//		}
		// cycle 1
		maxIndex = 0;
		
		for(int j = 5; j > 1; j--)
		{
			maxIndex = 0;
			for (int i = 1; i < j; i++) {
				if (array[i] > array[maxIndex]) {
					maxIndex = i;
				}
			}
			temp = array[j - 1];
			array[j - 1] = array[maxIndex];
			array[maxIndex] = temp;
		}
		

		System.out.println(Arrays.toString(array));
	}

}
