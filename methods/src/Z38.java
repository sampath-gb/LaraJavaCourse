class Z38 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		test(i++);
		System.out.println("main end:"+i);
	}
	public static void test(int i)
	{
		System.out.println("from test:"+i);
		i=30;
		test2(i);
	}

	public static void test2(int i)
	{
		System.out.println("from test2:"+i);
		i = 40;
	}
}
