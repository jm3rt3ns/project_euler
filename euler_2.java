public class euler_2
{
	public static void main(String [] args)
	{
    int num1 = 1;
		int num2 = 2;
		int sum = 0;
		while(num2 < 4000000)
		{
			if(num2 % 2 == 0)
			{
				sum += num2;
			}
			num2 = num1 + num2;
			num1 = num2 - num1;
		}
    System.out.println("The result is " + sum);
	}
}
