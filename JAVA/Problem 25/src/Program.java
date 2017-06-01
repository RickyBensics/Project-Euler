/**
 *  What is the index of the first term in the Fibonacci sequence to contain 1000 digits?
 * 
 * Richard Bensics
 * 6/1/17
 */

import java.math.BigInteger;

public class Program 
{
	public static void main(String[] args)
	{
		BigInteger f, n = BigInteger.ONE, m = BigInteger.ONE, index = BigInteger.valueOf(2); 
		while(true)
		{
			index = index.add(BigInteger.ONE);
			f = m.add(n);
			if(f.toString().length() == 1000)
			{
				System.out.println("The first fibonacci number with 1000 digits is: " + index);
				break;
			}
			n = m;
			m = f;
		}
	}
}
