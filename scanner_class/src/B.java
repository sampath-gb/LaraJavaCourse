import java.util.Scanner;
class B
{
	public static void main(String[] args) 
	{
		System.out.print("please enter your complete name");
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		System.out.println("Welcome: "+name);
	}
}
