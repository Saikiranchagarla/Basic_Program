import java.util.Scanner;
class Spy_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		int sum = 0;
		int product = 1;

		while(num>0)
		{
			int dig = num%10;
			sum = sum+dig;
			product = product*dig;
			num = num/10;
		}
		System.out.println("Sum of digits of a given number :  " + sum);
		System.out.println("product of digits of a given number :  " + product);
		if(sum==product)
		{
			System.out.println("The given number is a Spy number ");
		}
		else
		{
			System.out.println("The given number is not a Spy number ");
		}
	}
}
