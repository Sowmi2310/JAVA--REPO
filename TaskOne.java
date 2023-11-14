import java.util.Arrays;

class TaskOne
{   

 	void userGet()
	{
		String a="WELCOME";
		char r=a.charAt(4);
		System.out.println(r);
		StringBuilder b=new StringBuilder("welcome");
		System.out.println(b.reverse());
		String str="we are developers!";
		System.out.println(str+"="+str.replace(" ",""));
		System.out.println(str.substring(3,6));

	}
	void sor()
	{
		String sor="JAVA PROGRAMMING";
		char[] ch=sor.toCharArray();
		Arrays.sort(ch);
		System.out.println(ch);
	}
	public static void main(String arr[])
	{
		
		char c='M';
		String s=String.valueOf(c);
		System.out.println(s);
		TaskOne w=new TaskOne();
		w.userGet();
		w.sor();
	}
}




