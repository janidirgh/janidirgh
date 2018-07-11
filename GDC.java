class GCD
{
	public static void main(String args[])
	{
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		 
		while(b>0)
		{
			int r=a%b;
			a=b;
			b=r;
		}
		
		while(c>0)
		{
			int s=a%c;
			a=c;
			c=s;
		}
		System.out.println("The GCD of Two Numbers is");
		System.out.println(a);		
	
	}


}