class Localvar
{
         String a="HI"; //global scope

	void userMeth()
	{
		String name="JAVA";     //local scope
		System.out.println(name);
	}
	void userDisp()
	{
                System.out.println(name); //throw error because we defined as local(String name="JAVA")
		System.out.println(a);  //access it because we defined as global(String a="HI")
	}
	public static void main(String agrs[])
	{
		Localvar lv=new Localvar();
		lv.userMeth();
		lv.userDisp();
                //System.out.println(a);   //we defined as static(static String a="HI") as global
                System.out.println(lv.a);  //while we define as non-static (eg:String a="HI")

	}
}