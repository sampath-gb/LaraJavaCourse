class C2
{
	int i = 100 ;
	C2()
	{
		System.out.println("c()");
		i = 10;
	}
	public static void main(String[] args) 
	{
		C c1 = new C();
		System.out.println("-----");
		System.out.println(c1.i);
	}
}
