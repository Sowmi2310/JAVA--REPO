class Person
{	
	String name;
	int age;
	String degree;
	
		
	 pubilc Person(String name,int age)
	{
		this.name=name;
		this.age=age;
		System.out.println(name+age);
			
	}
	
}
class Teacher extends Person
{
	 public Teacher(String name,int age,String degree)
	{
		super.person("Dharma",30);
		System.out.println(name+age+degree);
			
	}
	public static void main(String aa[])
	{
		Teacher te=new Teacher();
		te.Teacher("Dhana",32,"PhD");
		
		
	}
}
			
	
