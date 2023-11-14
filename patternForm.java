class PatternForm
{
	public static void main(String agrs[])
	{
		int i,j,k,row=4;
		for(i=0;i<=row;i++)
		{
		for(k=1;k<=i+1;k++)
		{
			System.out.print(" ");
		}
		for(j=row;j>i;j--)
		{
			System.out.print(" *");
		}
		/*for(k=1;k<=i+1;k++)
		{
			System.out.print(" *");
		}*/
		System.out.println();
		}
	}
}
