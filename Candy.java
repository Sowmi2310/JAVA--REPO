class Candy
{
	void taste()
	{
		System.out.println("tastes chocolately");
	}
}
class Chocolate extends Candy
{
	void taste()
	{
		System.out.println("tastes sweety!!");
		super.taste();
	}
	public static void main(String arr[])
	{
	Chocolate cr=new Chocolate();
	cr.taste();
	}
}
	