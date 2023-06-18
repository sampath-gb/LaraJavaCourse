class  Z40
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i=1;
		System.out.println("main end:"+i);
		System.out.println(args[0]+","args[1]);
		System.out.println(args[0]+","args[3]);
		System.out.println(args[0]+","args[5]);
		test(i++ + i++ + i + i++);
	}
	public static void test(int i)
	{
		System.out.println("from test:"+i);
		i=30;
		String [] s1 = {"vijay","kumar"};
		main(null);
	}
}
