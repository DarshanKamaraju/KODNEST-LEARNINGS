import java.util.Scanner;

public class Main {
	public static void categorizeAge(int age)
	{
		if(age>0 && age<=12)
		{
			System.out.println("Child");
		}
		else if(age<19 && age>13)
		{
			System.out.println("Teen");
		}
		else if(age<59 && age>20)
		{
			System.out.println("Adult");
		}
		else
		{
			System.out.println("Senior");
		}
	}
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=scan.nextInt();
		categorizeAge(age);
		scan.close();
	}
}