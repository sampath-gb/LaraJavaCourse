class K3
{
	static 
	{
		i = 100
	}
	static int test()
	{
		return i = 90;
	}
	static int i;
	
	static int j = i;

	public static void main(String[] args) 
	{
		System.out.println("done "+test());
		System.out.println("done "+j);
		System.out.println("done "+i);
	}
}
