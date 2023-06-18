class K
{
	static void test()
	{
		System.out.println(i=10);
	}

	static 
	{
		test();
	}

	static int i;

	public static void main(String[] args) 
	{
		System.out.println("done");
	}
}


/*using variable before initializing in static method
if we use in static block we will gwt IFR erroe
output: 
0
done


*/