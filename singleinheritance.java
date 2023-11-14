class ParentClass
{
	void myParent()
	{
		System.out.println("I am parent class");
	}
}
class ChildClass extends ParentClass
{
	void myChild()
	{
		System.out.println("I am child");
		myParent();
	}

 

public static void main(String arr[])
{
	ChildClass obj=new ChildClass();
	obj.myChild();
	
	//ParentClass obj1=new ParentClass();
	//obj1.myParent();
	//obj1.myChild();
	
}
}