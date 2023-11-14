class Play
{
	void footBall()
	{
		System.out.println("welcome");
	}
}
class Game extends Play
{
	void footBall()
	{
		
		System.out.println("to play");
	}
public static void main(String arr[])
{
	Play obj1=new Play();
	obj1.footBall();
	Game obj=new Game();
	obj.footBall();
	
}
}