import java.util.Scanner;
class G_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the vaule : ");

		int a = sc.nextInt();

		System.out.println(" a valur is :" + a);

		int b = sc.nextInt();
	
		System.out.println(" b valur is :" + b);

		int c = sc.nextInt();
	
		System.out.println(" c valur is :" + c);

		 if (a>b)

			{
				System.out.println(" The greatest value is  :" + a);
			}
		else if(b>c)

			{
				System.out.println(" The greatest value is :" + b);
			}
		else
			{
				System.out.println("The greatest value is :" + c);
			}
	}
}
