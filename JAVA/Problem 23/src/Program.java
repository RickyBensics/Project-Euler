/**
 * Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
 * 
 * Richard Bensics
 * 5/25/17
 */

import java.util.ArrayList;

public class Program 
{
	public static void main(String[] args)
	{
		int sum = 0;
		boolean[] isAbundantSum = new boolean[28124]; //default values will be false
		ArrayList<Integer> abundantNumbers = new ArrayList<Integer>();
		
		for(int i = 0; i < 28124; i++)
		{
			if(isAbundantNum(i))
				abundantNumbers.add(i);
		}
		
		for(int i = 0; i < abundantNumbers.size(); i++)
		{
			for(int j = i; j < abundantNumbers.size(); j++)
			{
				if(abundantNumbers.get(i) + abundantNumbers.get(j) < 28124 )
				{
					isAbundantSum[abundantNumbers.get(i) + abundantNumbers.get(j)] = true;
				}
			}
		}
		
		for(int i = 0; i < isAbundantSum.length; i++)
		{
			if(isAbundantSum[i] == false)
				sum += i;
		}
		
		System.out.println(sum);
					
	}
	
	static boolean isAbundantNum(int x)
	{
		int sum = 0;
		
		for(int i = 1; i < x; i++)
		{
			if(x % i == 0)
				sum += i;
		}
		
		if(sum > x )
			return true;
		return false;
	}
}
