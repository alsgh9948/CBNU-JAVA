interface Starcraft2 
{
	void attack(String s);
}
  
class Terran2 implements Starcraft2
{
	public void attack(String s) 
	{
		System.out.println("Terran2의  " + s + "Attack");
	}
}

class Protoss2 implements Starcraft2 
{
	public void attack(String s) 
	{
		System.out.println("Protoss2의  " + s + "Attack");
	}
}

class Zerg2 implements Starcraft2 
{
	public void attack(String s) 
	{
		System.out.println("Zerg2의  " + s + "Attack");
	}
}
class Output 
{
	public static void main(String args[]) 
	{
		Starcraft2 obj;   
		obj = new Terran2();
 		obj.attack("마린 ");
		obj = new Protoss2();
		obj.attack("드래곤");
		obj = new Zerg2();
		obj.attack("히드라리스크.");
	}
}
