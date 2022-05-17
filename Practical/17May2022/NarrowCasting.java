package TypeCasting;

public class NarrowCasting 
{

	public static void main(String[] args)
	{
		double d = 200.06;
		long l = (long)d;
		int i = (int)l;
		
		System.out.println("Double Data Type Value:"+d);
		System.out.println("Long Data Type Value:"+l);
		System.out.println("Integer Data Type Value:"+i);
		
		
		byte b = 70;
		int c = (int)b;
		c = (c*2);
		System.out.println("Integer Data Type:"+c);
	}

}
