
public class Accident {

	public static void main(String[] args) {
		try {
			int Jumsu = Integer.parseInt(args[0]);
			if(Jumsu>100)
			{
				throw new NumberFormatException("������ �ʹ� ŭ");
			}
		}
		catch(NumberFormatException e)
		{
			System.out.println("==================================");
			System.out.println(e.getMessage() + "���� �߻�");
		}
	}
}