package exam;

public class Ex15Practice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 5 x 5 정방형 int형 Matrix
		int cnt = 1;
		
		int [][] array = new int [5][5];
		for (int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				array[i][j] = cnt++;	
			}
		}
		for (int i = 0; i < 5; i++)
		{
			for(int j = 0; j < 5; j++)
			{
				System.out.printf("%-2d  ",array[j][i]);
			}
			System.out.println();
		}

		
		//System.out.println(Arrays.deepToString(array));
	}

}
