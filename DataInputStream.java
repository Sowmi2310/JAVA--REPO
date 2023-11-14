import java.io.DataInputStream;

class DataInputStream
{
	public static void main(String agrs[])throws Exceptions
	{
		DataInputStream dt=new DataInputStream(System.in);
		System.out.println("VALUE:1");
		int a=Integer.parseInt(dt.readLine());
		System.out.println("VALUE:2");
		int b=Integer.parseInt(dt.readLine());
		System.out.println(a+b);
         }
}
		