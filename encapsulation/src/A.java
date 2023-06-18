class  A
{
	private String name;
	private int rollNumber;
	private int age;

	public String getname()
	{
		return name;        //this.name
	}
	public int getrollNumber()
	{
		return rollNumber; //this.rollNumber
	}
	public int getage()
	{
		return age;       //this.age
	}

	public void setname(String name)
	{
		this.name = name;
	}
	public void setrollNumber(int rollNumber)
	{
		this.rollNumber = rollNumber; 
	}
	public void setage(int age)
	{
		this.age = age;       
	}

}
class DriverClass
{
	public static void main(String[] args)
	{
		A a1 = new A();
		System.out.println(a1.getname());
		System.out.println(a1.getrollNumber());
		System.out.println(a1.getage());
		System.out.println("----------------------");
		a1.setname("Ashish");
		a1.setrollNumber(007);
		a1.setage(27);
		System.out.println(a1.getname());
		System.out.println(a1.getrollNumber());
		System.out.println(a1.getage());
	}
}