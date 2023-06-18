class Student 
{
	int roll_number;
	String name;
	String college_name;

	Student (int roll_number, String name)
	{
		this.roll_number = roll_number;
		this.name = name;
	}

	{
		this.college_name = "Lara";
	}

	public static void main(String[] args) 
	{
		Student s1 = new Student(101,"Ashish");
		System.out.println("-------");
		Student s2 = new Student(102,"chatu");
		System.out.println("-------");
	}
}
