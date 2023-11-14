class OverLoad
{
	void greet()
	{
		System.out.println("Hello");
		
	}
	void greet(String a)
	{
		System.out.println(a);	
	}
	public static void main(String arr[])
	{
		OverLoad obj=new OverLoad();
		obj.greet();
		obj.greet("Hello Sansa");
	}
}