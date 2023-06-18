class  G17
{
	public static void main(String[] args) 
	{
		{
			{
				int i = 10;
				System.out.println("outernormalblock:"+i);
			}
			System.out.println("innernormalblock:"+i);
		}
		System.out.println("main end:"+i);
	}
}
