class  O
{
	public static void main(String[] args) 
	{
		int i = 0;
		while ( i <2)
		{
				System.out.println("loop1 begin");
				//--------------------------------------
				int j = 0;
				while (j <3)
				{
					j++;
			    	System.out.println("loop2 begin");
					//---------------------------
					if (j>1)
					{
						break;
					}
			    	System.out.println("loop2 end");
					}
					System.out.println("loop1 end");
					i++;
		}
		System.out.println("program end");

	}
}
