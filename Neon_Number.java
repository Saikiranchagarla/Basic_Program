import java.util.Scanner;
class Neon_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sqr = num*num;
		int sum = 0;
		System.out.println("The squares of the given number is a  " + sqr);
		while (sqr>0)
		{
			int dig = sqr%10;
			sum = sum + dig;
			sqr = sqr/10;
		}
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("The given value " + num + "is a neon number");
		}
		else
		{
			System.out.println("The given value " + num + "is not a neon number");
		}
	}
}
