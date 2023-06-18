import java.util.Scanner;
class I 
{
	public static void main(String[] args) 
	{
		System.out.println("please enter student roll number ");
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		
		System.out.println("please enter student name ");
		String B = sc.next();

		System.out.println("pleases enter student initials ");
		char C = sc.next().charAt(0);
		
		System.out.println("please enter student age ");
		int D = sc.nextInt();

		System.out.println("please enter student course ");
		String E = sc.next();

		System.out.println("please enter student skills ");
		String F = sc.next();

		System.out.println("please enter student fees ");
		double G = sc.nextDouble();

		
		System.out.println("\nStudent details are "+ "\nRoll number  "+A + "\nName  "+B+ "\nInitials "+C +"\nage "+ D+"\ncourse "+ E +"\nSkills "+ F+ "\nFees "+G );
	}
}
