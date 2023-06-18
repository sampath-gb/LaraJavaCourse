class  K4
{
	static int i;
	static 
	{
		K4 k4 =new K4();
		System.out.println("static:"+k4.i);
	}
}


//each end every static member(static variable and method) will be shared by all the objects of that class.
//static int i will be not loaded while creating the object to k4 class, bcz it is already loaded while k4 class is loading
//k4 object is just usig the already loaded static int i. even the future objects of all k4 class will be using the samw copy of static int i.

























