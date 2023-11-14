import java.util.Scanner;
class PrimeNumber
{
	Scanner sc=new Scanner(System.in);
	
	void userGet()
	{
		System.out.println("Enter number:");
	        int n=sc.nextInt();
		int flag=0;
		
		for(int i=2;i<n;i++)
		{
		if(n%i==0)
		{
			flag++;
			break;
		}
		}
		if(flag==0)
		{
			System.out.println("yes,it's a prime number");
		
			
		}
		else
		{
			System.out.println("No,it's not a prime number");
			
		}
		
		
		
	}
	public static void main(String arg[])
	{
		PrimeNumber pr=new PrimeNumber();
		pr.userGet();
		
	}
}

		
	
		
		