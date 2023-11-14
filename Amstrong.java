//import java.util.Scanner;
 class Amstrong
{		
	public static void main(String arg[])
	{
	 
	 int a = 153;
	  int temp=a;
	int sum=0;
	while(temp!=0){
		int b= temp%10;//take last number
		sum+=Math.pow(b,3);
		temp/=10;//omit last number
	}
	if(sum==a){
		System.out.println("arms");
	}
	else
	System.out.println(" not arms");
			

			
		

	}
}
