class K 
{
	K(int i)
	{
		System.out.println("K(int)");
	}
	K(boolean b)
	{
		System.out.println("K(boolean)");
	}
	public static void main(String[] args) 
	{
		K k1 = new K(90);
		System.out.println("--------");
		K k2 = new K(true);
		System.out.println("--------");
		K k3 = new K(4321);
		System.out.println("--------");
		K k4 = new K(false);
		System.out.println("--------");
	}
}
