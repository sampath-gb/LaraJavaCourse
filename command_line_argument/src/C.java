class C 
{
	public static void main(String[] args) 
	{
		System.out.println("total arguments"+args.lenghth);
		for(String arg : args)
		{
			System.out.println(arg);
		}
	}
}
/*
- JVM will be calling the main method by supplying empty string array object if you dont supply anything as a command line argument while executing any class
- if you directly print the array reference you will be getting the memory address of the array object
- each and every array will be having a lenght. we can find out the array length by using  'length' property(calling lenghth property on the array reference)
- arrays are also objects in java 
- array index will be starting from 0 but length we will calculate from no 1
- if there are no elements are present in the array then we say that array is empty or size length is 0
- by default whatever the value you are supplying as a command line argument that will be considered as string type


















*/