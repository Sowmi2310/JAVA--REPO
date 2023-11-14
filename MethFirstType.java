import java.util.Scanner;

class MethFirstType
{
	Scanner sc=new Scanner(System.in);
	int whole()
	{
		System.out.println("value1:");
		int a=sc.nextInt();
		System.out.println("value2:");
		int b=sc.nextInt();
		int c=a+b;
		System.out.println("output:"+c);
		return c;
	}
	int add()
	{
		int c=whole();
		System.out.println("value:");
		int a=sc.nextInt();
		int d=c+a;
		System.out.println("add:"+d);
		return d;
	}
	int sub()
		{
			int c=add();
			System.out.println("value:");
			int a=sc.nextInt();
			int s=c-a;
			System.out.println("sub:"+s);
			return s;
		}
	int mul()
		{
			int c=sub();
			System.out.println("value:");
			int a=sc.nextInt();
			int m=c*a;
			System.out.println("sub:"+m);
			return m;
		}
	void div()
		{
			int c=mul();
			System.out.println("value:");
			int a=sc.nextInt();
			int d=c/a;
			System.out.println("div:"+d);
			
		}
	



	public static void main(String ars[])
	{
		MethFirstType a=new MethFirstType();
		a.div();
	}
}	