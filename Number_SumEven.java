import java.util.Scanner;
class Number_SumEven
{
	public static void main(String[] args) 
	{

		int sum = 0;

		Scanner sc = new Scanner(System.in);
		
		//System.out.println("Enter the a value : " );
		//int a = sc.nextInt();
		//System.out.println(a);
		
		//System.out.println("Enter the b value : " );
		//int b = sc.nextInt();
		//System.out.println(b);


		for (int i = 3; i<=13; i++)
		{
			if (i%2==0)
			{
					sum = sum+i;



			}

		}
			System.out.println(sum );
	}
}
