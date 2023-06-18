class  K5
{
	static int i ;//this member will be loaded each and every timr whenever we are creating object of k5 class,

	static K5 k5 = new K5();

	static
	{
		System.out.println("SIB begin:"+i);
		k5.i = 50;
		System.out.println("SIB end:"+i);
	}

	public static void main(String[] args) 
	{
		System.out.println("main:"+i);
	}
}
