class Palindrome
{
  	public static void main(String arr[])
	{
		StringBuilder str=new StringBuilder("radar");
		StringBuilder ch=str.reverse();
		System.out.println(ch);
		if(str==ch)
		{
			System.out.println("It is palindrome");
		}
		else
		{
			System.out.println("no it's not palindrome");
		}
	}
}