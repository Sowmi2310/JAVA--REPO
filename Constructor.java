public class Constructor //default constructor initializing
{
	String name;
	int age;

//default constructor
public Constructor() 
{
	name="logesh";
	age=21;
}
//parameterlized constructor
public Constructor(String n,int a) 
{
	name=n;
	age=a;
}
//copy constructor
public  Constructor(Constructor orr)
{
	name=orr.name;
	age=orr.age;
}
public static void main(String arg[])
{
	Constructor arr=new Constructor();
	System.out.println(arr.name);
	System.out.println(arr.age);
	
	Constructor acr=new Constructor("kumar",20);
	System.out.println(acr.name);
	System.out.println(acr.age);
	
	Constructor ada=new Constructor(arr);
	System.out.println(ada.name);
	System.out.println(ada.age);
}
}


	