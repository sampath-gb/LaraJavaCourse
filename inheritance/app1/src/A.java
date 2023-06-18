class A  //parent class or base class or super class
{            //single inheritance
	int i ;
}

class B extends A //child class or derived class or sub class
{
	int j;
	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println(b1.i);
		System.out.println(b1.j);
	}
}
