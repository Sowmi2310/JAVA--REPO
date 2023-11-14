class BlockVar
{
	static void userVar()
	{
		int a=100;//local variable
		//int a=60; //cannot repalce(format:a=60)
		
		{ 
			int b=50;//block level
			b=10; //replace
			System.out.println(a+b);
		}
		a=90;
		System.out.println(a);
		int c=10;
		System.out.println(a+c);
	}
	public static void main(String agrs[])
	{
		//BlockVar bc=new BlockVar();
		//bc.userVar();
		//BlockVar.userVar(); //because we defined as static(static void userVar)
		userVar();
	}
}