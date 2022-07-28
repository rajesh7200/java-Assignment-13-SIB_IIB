class DemoSIB_IIB
{
	static
	{
		System.out.println("SIB 1");
	}
	
	{
		System.out.println("IIB 1");
	}
	
	static
	{
		System.out.println("SIB 2");
	}
	
	{
		System.out.println("IIB 2");
	}
	
	public static void main(String[]args)
	{
		new DemoSIB_IIB();
	}
}