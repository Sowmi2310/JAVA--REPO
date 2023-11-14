class Parents
{
	void display()
	{
		System.out.println("welcome to my house");
	}
}
	
class Child extends Parents
{

	void display()
	{
		super.display();
		System.out.println("Its a wonderfull");
	}
public static void main(String err[])
{
	Child sp=new Child();
	sp.display();
}
}
	
	