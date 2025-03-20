import java.util.Scanner;
class Number_Product 
{
	public static void main(String[] args) 
	{

		int product = 1;		

		Scanner sc = new Scanner(System.in);

		for(int i = 2; i<=20; i++)
		{
			if(i%2!=0)
			{
				product = product*i;

				//System.out.println(product);
			}
				//System.out.println( "The product of odd numbers from 2 to 20 is " + product);

		}
		System.out.println( "The product of odd numbers from 2 to 20 is " + product);
	}
}
