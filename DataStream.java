//import java.io.DataInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;

class DataStream
{
	public static void main(String agrs[])throws Exception
	{
		//DataInputStream dt=new DataInputStream(System.in);
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("VALUE:1");
		int a=Integer.parseInt(br.readLine());
		System.out.println("VALUE:2");
		int b=Integer.parseInt(br.readLine());
		System.out.println(a+b);
         }
}
		