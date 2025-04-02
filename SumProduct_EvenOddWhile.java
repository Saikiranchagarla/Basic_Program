import java.util.Scanner;
class SumProduct_EvenOddWhile
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int value = sc.nextInt();
		int sum = 0;
		int product = 1;
		while(value>0)
			{
				int dig = value%10;
				if(value%2==0)
					{
						sum = sum+dig;
						product = product*dig;
					

					}	
					value = value/10;
			}
			System.out.println( "sum of all the even digits of a number : " + sum + "product of all the odd digits of a number are " + product);
	}
}
