/**
 * Evaluate the sum of all the amicable numbers under 10000.
 * 
 * Richard Bensics
 * 5/16/17
 */

public class Program 
{
	public static void main(String[] args)
	{
		int sum = 0;
		for(int i = 0; i < 10000; i++)
			if(isAmicableNumber(i))
				sum += i;
		System.out.print(sum);
	}
	
	static boolean isAmicableNumber(int input)
	{
		int sum = divisorSum(input);
		if(input == divisorSum(sum) && input != sum)
			return true;
		else return false;
	}

	static int divisorSum(int input)
	{
		int sum = 0;
		for(int i = 1; i < input; i++)
			if(input%i == 0)
				sum += i;
		return sum;
	}
}