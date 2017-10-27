
public class pratice2 {

	public static void main(String[] args) {
		int sum=0,a;
		
		for(a=1 ; sum<100 ;a++)
		{
			if(a%2==0)
			{
				sum-=a;
			}
			else
				sum+=a;
		}
		System.out.println(a);
	}
}
