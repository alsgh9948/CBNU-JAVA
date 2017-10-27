
public class DoubleArray {

	public static void main(String[] args) {
		int[][] ar = {{10,20}, {30, 40}};
		
		for(int i = 0 ; i<ar.length ; i++)
		{
			for(int j = 0 ; j < ar[i].length ; j++)
			{
				System.out.print(" " + ar[i][j]);
			}
			System.out.println();
		}

	}

}
