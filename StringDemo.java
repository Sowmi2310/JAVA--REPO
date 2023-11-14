class StringDemo
{
	public static void main (String adg[])
	{
		String name="KGM";
		String n1="KGM";
		System.out.println(name==n1); //true because the value & address is same
		
		/*String name=new String("KGM"); 
		String n1=new String("KGM");
		System.out.println(name==n1);*/  // false because the address is differ
		
		String a="JAVA";
		String b="java"; //ignorecases of string
		System.out.println(a.equalsIgnoreCase(b));
		
		String d="teddy";
		System.out.println(d.indexOf("e"));
		System.out.println(d.toUpperCase());
		String join=d.concat("bear"); //join two strings
		System.out.println(join);
		
		int g=100;
		String s=String.valueOf(g); //convert given number to string(int g=100)
		System.out.println(s+23);
		
		String s1="java is oops";  
		System.out.println(s1.startsWith("j"));  
		System.out.println(s1.endsWith("s")); 
		
		String representation = Integer.toString(34);//convert object(integer) as string
		System.out.println(representation);
		
		StringBuilder e=new StringBuilder("welcome");
		//System.out.println(e.reverse());
		//StringBuffer obj=e.append("to JAVA");
		//StringBuffer obj=e.insert(0,"we");
		//StringBuffer obj=e.replace(0,3,"not");
		System.out.println(e.length()); 
		System.out.println(e.substring(3,7)); 
		  
		
		
		
	}
	
}