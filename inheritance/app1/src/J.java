class I 
{
	static int m;
	int n;
	static void test1()
	{
		System.out.println("from test1");
	}
	void test2()
	{
		System.outprintln("from test2");
	}
}
class j extends i
{
	public static void main(String[] args) 
	{
		System.out.println(J.m);
		J.test1();

		j ref = new j();
		System.out.println(ref.n);
		ref.test2();
	}
}
