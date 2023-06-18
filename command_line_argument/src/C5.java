class  C
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments"+args.length);
		System.out.println("-------------");
		//String s1 = args[0];
		char c1 = args[0].charAt(0);//its not converting from string to char
		//its just fetching from a particular string index
		//we can not convert string to char
		System.out.println(c1);
	}
}
//internally strings are also array of characters, and will be having indexes. index starts from 0