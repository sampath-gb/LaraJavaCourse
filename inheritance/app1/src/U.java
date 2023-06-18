class A 
{
	A(int i)
	{
		System.out.println("A(int i)");
	}
}
class U extends A
{
	U( int i)
	{
		super(i);
		System.out.println("T(int)");
	}
	public static void main(String[] args) 
	{
		U u1 = new U(90);
		System.out.println("done");
	}
}
