/**
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 * Find the sum of all the primes below two million.
 * 
 * Richard Bensics
 * 10/19/16
 */
public class Program 
{
	public static void main(String args[])
	{
		long primeSum = 2;
		int primeFlag;
		
		for(int i = 3; i < 2000000; i+=2)
		{
			primeFlag = 0;
			for(int j = 3; primeFlag == 0 && j <= Math.sqrt(i); j+=2)
			{
				if(i % j == 0)
					primeFlag = 1;
			}
			if(primeFlag == 0)
			{
				primeSum += i;
			}
		}
		System.out.println(primeSum);
	}
}
