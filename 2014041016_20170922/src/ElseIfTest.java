
public class ElseIfTest {

	public static void main(String[] args) {
	int jumsu = 100;
	if(jumsu >= 90 && jumsu < 100)
	{
		System.out.println("����� ������  A�Դϴ�.");
	}
	else if(jumsu >= 80 && jumsu < 90)
	{
		System.out.println("����� ������ B�Դϴ�.");
	}
	else if(jumsu >= 70 && jumsu < 80)
	{
		System.out.println("����� ������  C�Դϴ�.");
	}
	else if(jumsu >= 60 && jumsu < 70)
	{
		System.out.println("����� ������  F�Դϴ�.");
	}
	else if(jumsu >= 0 && jumsu < 60)
	{
		System.out.println("����� ������  D�Դϴ�.");
	}
	else
		System.out.println("�߸��� �����Դϴ�.");
	}
}