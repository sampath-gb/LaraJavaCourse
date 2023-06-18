class A
{
	static
	{
		System.out.println("A-SIB");
	}
	A()
	{
		System.out.println("A()");
	}
	
	{
		System.out.println("A-IIB");
	}
}
class B extends A
{
	static
	{
		System.out.println("B-SIB");
	}
	B()
	{
		System.out.println("B()");
	}
	
	{
		System.out.println("B-IIB");
	}
}

class C extends B
{
	static 
	{
		System.out.println("C-SIB");
	}
}
class Z5
{
	static 
	{
		System.out.println("Z3-SIB");
	}
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		B b1 = new B();
		System.out.println("-----------");
		C c1 = new C();
		System.out.println("-----------");
		A a1 = new A();
		System.out.println("-----------");
		Z3 z3 = new Z3();
		System.out.println("-----------");
		System.out.println("main end");
	}
}
