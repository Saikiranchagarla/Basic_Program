import java.util.Scanner;
class Print_Odddigits 
{
	public static void main(String[] args) 
	{
		int product = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value : ");
		int num = sc.nextInt();
		//System.out.println("Enter the value : ");
		
		while (num>0)
		{
			int dig = num%10;

			if(dig%2!=0)
				{

					product = product*dig;
					///System.out.println(product);
					//	product = product*dig;
				//	System.out.println(product+ " are the product of the odd numbers in a given number ");
				}

			num = num/10;
			//System.out.println(product+ " are the product of the odd numbers in a given number ");
		}
		System.out.println(product+ " is the product of the odd numbers in a given number ");
	}
}
