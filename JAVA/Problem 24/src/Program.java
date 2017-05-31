/**
 * What is the millionth lexicographic permutation of the digits 0, 1, 2, 3, 4, 5, 6, 7, 8 and 9?
 * 
 * Richard Bensics
 * 5/31/17
 * 
 */

public class Program<T> 
{
	public static int count = 0;
	public static String permutation = null;
	
	public static void main(String[] args)
	{
		System.out.println(permutation("0123456789"));
	}
	
	public static String permutation(String str)
	{
		return permutation("", str);
	}
	
	private static String permutation(String prefix, String str)
	{
		int n = str.length();
		if (n == 0 && count < 1000000)
		{
			permutation = prefix;
			count++;
		}
		else
		{
			for(int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
		}
		return permutation;
	}
}
