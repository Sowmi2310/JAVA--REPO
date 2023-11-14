class MethodName
{
		static String talk()
		{
			
			System.out.println("HELLO");
		}
		static String talk(String b)
		{
			System.out.println(talk (b));
		}
		public static void main(String arg[])
		{
		MethodName d=new MethodName();
		d.talk();
		d.talk("RAM");
		}
}
		