import java.util.Scanner;
class Print_EvenNumber  
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int num = sc.nextInt();
		
		while (num>0)
		{
			int dig = num%10;

			if(dig%2==0)
				{
					System.out.println(dig+ " is the even digits in the given number ");
				}

			num = num/10;
		}
		//	num = num/10;
	}
}
