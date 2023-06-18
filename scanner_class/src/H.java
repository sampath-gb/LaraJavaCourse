import java.util.Scanner;
class H
{
	public static void main(String[] args) 
	{
		System.out.print("please enter 1st int value ");
		Scanner sc = new Scanner(System.in);
		int value1 = sc.nextInt();
		System.out.print("please enter 2nd int value ");
		Scanner ed = new Scanner(System.in);
		int value2 = sc.nextInt();
		System.out.print("please enter 3rd int value ");
		Scanner ew = new Scanner(System.in);
		int value3 = sc.nextInt();
		System.out.println("addtition of three int values are "+ (value1 + value2 + value3));
	}
}


//byte<short<int<long<float<double