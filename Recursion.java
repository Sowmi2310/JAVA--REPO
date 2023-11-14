class Recursion
{
	int count=0;
	void msg()
	{
		if(count<=5)
		{
		count++;
		System.out.println("welcome");
		msg();
		}
	}
	public static void main(String arr[])
	{
		Recursion a=new Recursion();
		a.msg();
	}
}