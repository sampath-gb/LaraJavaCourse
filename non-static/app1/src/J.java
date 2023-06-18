class J 
{
	void test1()//non-static
	{
		System.out.println("from test1");
	}
	static void test2() //static
	{
		J obj = new J();
		obj.test();//by using obj reference we are accessing non-static test1()
		System.out.println("from test2");
	}
}
