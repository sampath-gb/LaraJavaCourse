//each ad every class will be extending object class either directly or indirectly
//if class is not extending any other class than that calss is direct subclass of object class
//if the class is already extending another class than that class is int indirect sub-class of object class
//weather we keep it or not compiler only keeps the extends for all the classes
class K
{
	K()
	{	
		super();//if you dont keep any explicit super or this calling statement in the constructor body as a first statement, then compiler only keeps the super with no arguments calling statement
		System.out.println("K()");
	}
}
class L extends K
{ 
	L()
	{
		super();
		System.out.println("L()");
	}
	public static void main(String[] args) 
	{
		L obj = new L();
	}
}
