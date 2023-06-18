class  G
{
	int i;
	public static void main(String[] args) 
	{
		G g1= new G();//object creation
		System.out.println(g1.i);//by using th reference of G class object we can access the non statis variable i
	  //this g1 reference is local to main method
	}
}



//an object is a real world entity
//class is a blue print to create the objects
//objects will be having attributes and behaviours
//ex: Dog object properties or attributes:name, age, colour, breed, gender, weight
   //behaviours: bark(), chasecat(), bite(), chase vehicle()
   //properties = data members
  //behaviours = member functions
//for one class we can create any number of objects
// G g1= G(class name), g1(reference varibale) (name can be anything)
//= assignment operator(left side assignment operator)
// new is a keyword and also an operator
//G(); - calling G class no argument constructor
//variable, method follow the case like VariableNumberOne,methodNumberOne
//varible name shoiuld be valid identifier
//while you are refrfering to the class case must be same(as a standard we will write the class anme in camel case like ThisIsTheCamelCase
//objects are srtored inside heap memory
//non-static members are loding to the memory while objects are created
//all the non-static members are loading to the memory while we are creating that particular class.it can be non-variable or can be non-static method or it can be a non static block





