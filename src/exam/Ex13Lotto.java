package exam;

import java.util.Arrays;
import java.util.Random;

public class Ex13Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] lotto = new int[6];

		// 1 ~ 45 중 하나를 랜덤하게 만들어서 대입!!

		Random rd = new Random();
//		lotto[0] = rd.nextInt(10) + 1;
//		System.out.println(lotto[0]);
//		
//		lotto[1] = rd.nextInt(45) + 1;
		// 이와 같은 방식으로 로또 번호를 6개를 뽑아 lotto배열에 대입!!
		for (int i = 0; i < 6; i++) {
	        lotto[i] = rd.nextInt(6) + 1;  // 1 ~ 45 중 하나를 랜덤하게 만들어서 대입

	        for (int j = 0; j < i; j++) {
	            if (lotto[i] == lotto[j]) {
	                i--;  // 중복이면 i를 감소시켜 다시 해당 위치의 번호를 생성
	                break;
	            }
	        }
	    }
	    System.out.println(Arrays.toString(lotto));
	}

}
