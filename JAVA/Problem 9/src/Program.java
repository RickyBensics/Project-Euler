/**
 *A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 * For example, 3^2 + 4^2 = 9 + 16 = 25 = 52.
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 * 
 * Richard Bensics
 * 10/16/16
 */
public class Program 
{
	public static void main(String args[])
	{
		double a, b, c;
		
		for (b = 1; b <= 1000; b++)
		{
			for (a = 1; a <= b; a++)
			{
				if ((c = Math.sqrt(a*a+b*b)) % 1 == 0)
				{
					if((a + b + c) == 1000)
					{
						System.out.println(a + " " + b + " " + c);
						break;
					}
				}
			}
		}
	}
}