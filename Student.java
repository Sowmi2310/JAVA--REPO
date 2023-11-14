import java.util.Scanner;

class Student
{	
	//data members
	int stdid;
	String stdname;
	int stdage;
	Scanner sc=new Scanner(System.in);
	
	//member function
	
	public void acceptDetails()
	{
		System.out.println("Enter id:");
		stdid=sc.nextInt();
		System.out.println("Enter name:");
		stdname=sc.next();
		System.out.println("Enter age:");
		stdage=sc.nextInt();
	}
	public void displayDetails()
	{
		System.out.println("student Id:"+ stdid);
		System.out.println("student name:"+ stdname);
		System.out.println("student age:"+ stdage);
	}




	public static void main(String arr[])
	{
		Student a=new Student();
		a.acceptDetails();
		a.displayDetails();
	        
		Student b=new Student();
		b.acceptDetails();
		b.displayDetails();

	}
}
		
