class Pen
{
	void blue()
	{
		System.out.println("Its good");
	}
}
class BlackInk extends Pen
{
	void novel()
	{
		System.out.println("Its nice");
	}
}
class BlueInk extends Pen
{
	void colors()
	{
		System.out.println("black is mine");
	}
public static void main(String ww[])
{
	BlackInk bc=new BlackInk();
	bc.novel();
	bc.blue();
	//bc.colors();
		
	BlueInk bl=new BlueInk();
	bl.colors();
	bl.blue();
}
}