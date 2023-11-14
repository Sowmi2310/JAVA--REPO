import java.util.Scanner;

abstract class Atm
{
	abstract void cash();
}
abstract class WithDraw extends Atm
{
	abstract void pin();
	abstract void wrongPin();
	void balance()
	{
		System.out.println("your available balance is 20000000");
	}

}
class Abstraction extends WithDraw
{
	void pin()
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter pin:");
		int a=sc.nextInt();
	}
	
	void cash()
	{
		System.out.println("get money");
	}
	void wrongPin()
	{
		System.out.println("wrong pin");
	}
public static void main(String arg[])
{
	Abstraction ab=new Abstraction();
	ab.pin();
	ab.cash();
	ab.wrongPin();
	ab.balance();
}
}

