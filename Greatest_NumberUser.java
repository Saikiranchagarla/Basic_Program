import java.util.Scanner;
class Greatest_NumberUser
{
	public static void main(String[] args) 
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the a value :");
		int a = sc.nextInt();
		System.out.println(" Given value is :" + a);
		System.out.println("Enter the b value :");
		int b = sc.nextInt();
		System.out.println(" Given value of b is :" + b);
		if(a>b)
			{
				System.out.println(" Greatest value is :" + a);
				System.out.println(" Smallest value is :" + b);
			}
			else
				{
					System.out.println("Greatest value is :" + b );
					System.out.println(" Smallest value is :" + a);
				}

	}
}
