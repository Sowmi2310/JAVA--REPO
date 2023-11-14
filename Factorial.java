import java.util.Scanner;

class Factorial
{
	Scanner sc=new Scanner(System.in);
	
	int facProgram(int a)
	{
		if(a==0)
		{
			return 1;
		}
		else
		{
			
			return(a*facProgram(a-1));
		}
		
		
	}
	void user()
	{
		System.out.println("value:");
		int a=sc.nextInt();
		System.out.print(facProgram(a));
	}
	
	public static void main(String arr[])
	{
		//Scanner sc=new Scanner(System.in);
		Factorial fa=new Factorial();
		//int a=sc.nextInt();
		//System.out.print(fa.facProgram(a));
		fa.user();
	}
}