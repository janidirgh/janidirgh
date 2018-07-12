class Construct
{
	Construct()
	{
		System.out.println("Default Constructor Called");
	}
	Construct(int a,int b)
	{
		a=0;	
		b=0;
		System.out.println("Parameterized Constructor Called");
	}

	{
		System.out.println("Inside Instance Block");
	}
	static
	{
		System.out.println("Inside Static Block");
	}
	public static void main(String args[])
	{
		Construct o1=new Construct();
		Construct o2=new Construct(5,10);
		
	}

}