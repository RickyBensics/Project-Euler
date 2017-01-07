/**
 * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
 * What is the sum of the digits of the number 2^1000?
 * 
 * Richard Bensics
 * 1/7/17
 */

import java.math.*;
public class Program 
{
	public static void main(String[] args)
	{
		long sum = 0;
		BigInteger num = BigInteger.valueOf(2);
		
		num = num.pow(1000);
		String[] stringArray = num.toString().split("");
		
		for(int i = 0; i < stringArray.length; i++)
			sum += Integer.parseInt(stringArray[i]);
		
		System.out.println(sum);
	}
}
