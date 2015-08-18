import java.lang.Math;

public class euler_3
{
	public static void main(String [] args)
	{
		long max = 600851475143L;
		long maxPrime = 2L;
		for(long num = 3L; num < (long) Math.sqrt(max); num+=2)
		{
			if(max % num == 0)
			{
				if(isPrime(num))
				{
					maxPrime = num;
				}
			}
		}
    System.out.println("The result is " + maxPrime);
	}

	private static boolean isPrime(long num)
	{
		for(int i = 3; i < (long) Math.sqrt(num); i+=2)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
