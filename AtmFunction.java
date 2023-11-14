import java.util.Scanner;
class AtmFunction
{
   		int avlbal=100000;
		String name="sowmiya";
		int password=12345;
		Scanner sc=new Scanner(System.in);
	void checkFunction()
	{
		
		System.out.println("Enter your name:");
		String na=sc.nextLine();
		System.out.println("Enter your password:");
		int pas=sc.nextInt();
		if(name.equals(na) && password==pas)
		{
			System.out.println("welcome to our account");
			System.out.println("Enter your choice: =>1 for Withdraw => 2 for deposit =>3 for checkbook request =>4 for ministatement:");
			int y=sc.nextInt();
			switch(y)
			{
				case 1:
				withDraw();
				break;
				case 2:
				deposit();
				break;
				case 3:
				checkBook();
				break;
				default:
				System.out.println("Invalid Data 'TRY AGAIN'");
			}
		}
		else
	        {
		System.out.println("Invalid Information");
		}
	}
	void withDraw()
	{	                System.out.println("Enter your amount:");
				int m=sc.nextInt();
			if(m<=avlbal)
     			{
				
				int c=avlbal-m;
				System.out.println("Your amount has withdrawed successsfully!!!!!");
				System.out.println("your accout remaining balance:"+c);
			}
			else
			{
				System.out.println("your amount is insufficent to withdraw");
			}
	}
        
	
	void deposit()
        {
			       System.out.println("Enter your amount:");
			       int ad=sc.nextInt();
			       int add=avlbal+ad;
			       System.out.println("Your amount has been credited successsfully!!!!!");
			       System.out.println("Your amount balance:"+add);



        }
	void checkBook()
	{
		System.out.println("your checkbook request is accepted and you shortly receive your checkbook in your branch");
	}
	public static void main(String arr[])
	{
		AtmFunction mon=new AtmFunction();
		mon.checkFunction();
               
		
	}

}	