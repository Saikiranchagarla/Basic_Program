class  Assignment_Operator3 
{
	public static void main(String[] args) 
	{

		int a = 14;
		int b = 20;
		int c = 3;
		System.out.println(a+b);
		System.out.println(a++);
		System.out.println((b--)+(c--));
		a = ((b--)+(c--));
		System.out.println(a);
	}
}
