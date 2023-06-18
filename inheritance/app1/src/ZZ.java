class A
{
	static
	{
		System.out.println("A-SIB");
	}

//	{
//		System.out.println("A-IIB");
//	}
}
class B extends A
{
	static 
	{
		System.out.println("B-SIB");
	}
}

class C extends B
{
	static 
	{
		System.out.println("C-SIB");
	}
}
class ZZ
{
	static 
	{
		System.out.println("ZZ-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		A a1 = new A();
		System.out.println("main end");
	}
}
