class Test1
{
	static void method(int a,int b)
	{
		System.out.println("Addition is "+(a+b));
	}

	static void method(int a,int b,int c)
	{
		System.out.println("Addition is "+(a+b+c));
	}
	
	static void method(int a,int b,int c, int d)
	{
		System.out.println("Addition is "+(a+b+c+d));
	}

	static void method(int ... a )
	{
		int x=0;
		for(int i:a)
		{
			x=x+i;
		}
		System.out.println("Addition is"+x);
	}
	
}