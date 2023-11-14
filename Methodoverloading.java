class MethodOverloading
{
	static int method(int x, int y)
	{
		return x*y;
	}
	static float method(float a,float b,float c)
	{
		return a+b+c;
	}
	static double method(double g,double i)
	{
		return g+i;
	}

public static void main(String ww[])
{
	/*MethodOverloading  me=new MethodOverloading();
	me.method(10, 10);
	me.method(10,10,10);
	me. method(10,5);*/
	int var=method(10, 10);
	float var1=method(10,10,10);
	double var2=method(10,20);
	System.out.println(var);
	System.out.println(var1);
	System.out.println(var2);

}
}	