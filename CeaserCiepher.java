class Encryption
{
public static void main(String args[])
	{String pt="Hello";
	String ct="";
	int key=2;					
	for(int i=0;i<pt.length();i++)
	{
		ct=ct+(char)(pt.charAt(i)+key);		
	}
	System.out.println(ct);
	}
	pt="";
	for(int i=0;i<ct.length();i++)
	{
		pt=pt+(char)(ct.charAt(i)-key);		
	}
	System.out.println(pt);
	}
}