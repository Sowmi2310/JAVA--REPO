import java.util.*;

class Difference
{
	public static void main (String arg[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
	for(int i=1;i<=num;i++)
	{
	if(i%3==0 && i%5==0)
	{
		System.out.println(i+" FIZZ");
	}
	else if(i%5==0)
	{
		System.out.println(i+" BUZZ");
	}
	else if(i%3==0)
	{
		System.out.println(i+" FIZZBUZZ");
	}
	else
	{
		System.out.println(i);
	}
	}
	}
}
		