
public class pratice3 {

	public static void main(String[] args) {
		int i,j;

		for(i=2 ; i<9 ; i+=2)
		{
			for(j=1 ; j<=3 ; j++)
			{
				System.out.print(i + "*" + j + "=" + i*j + "        ");
				System.out.print(i+1 + "*" + j + "=" + (i+1)*j + "        ");
				if(i+2==10)
				{
					System.out.println();
					continue;
				}
				System.out.println(i+2 + "*" + j + "=" + (i+2)*j);
				
			}
			System.out.println();
		}
	}
}
