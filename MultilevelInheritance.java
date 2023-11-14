class Goa
{
	int rs=20000;
	void myFrist()
	{
		System.out.println("lets enjoy for"+rs);
	}
}
class London extends Goa
{
	int sr=30000;
	void mySecond()
	{
		System.out.println("lets goooo for"+sr);
		
	}
}
class Bangalore extends London
{
 	int re=80000;
	void myThrid()
	{
		System.out.println("lets vibessss for"+re);
		//mySecond();
	}

public static void main(String ee[])
{
 	Bangalore a=new Bangalore();
	a.myThrid();
	//System.out.println(a.re);
	a.mySecond();
	a.myFrist();
	
	London b=new London();
	b.myFrist();
	b.mySecond();
	//b.myThrid();
	
	Goa c=new Goa();
	c.myFrist();
	//c.mySecond();
	//c.myThrid();
	
	

}
}

