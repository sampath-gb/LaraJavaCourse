package pack1;
class  O
{
	private O()
	{
		System.out.println("O");
	}
}
class p
{
	public static void main(String[] args) 
	{
		O o1 = new O();  //O() have private access in O
		System.out.println("done");
	}
}
