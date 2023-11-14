interface A
{	
	int a=100;
	void userInfo();
	void userRun();
	void userDisp();
	void userDemo();
}
interface B
{
	void userRun();
	void userCome();
}
class Inter implements A,B
{ 	
	public void userCome()
	{
		System.out.println("good");
	}
	public void userInfo()
	{
		 //a=12;//error because final keyword is there in(final int a=100)
		System.out.println("welcome");
	}
	public void userRun()
	{
		System.out.println("value:"+a);
	}
	public void userDisp()
	{
		System.out.println("super");
		
	}
	public void userDemo()
	{
		System.out.println("awesome");
		userDisp();
		userRun();
		userInfo();
		userCome();
	}
	public static void main(String arr[])
	{
		Inter in=new Inter();
		in.userDemo();
	}
}