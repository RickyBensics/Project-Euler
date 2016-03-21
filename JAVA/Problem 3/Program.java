
/**
 * Richard Bensics
 * 3/21/16
 */
public class Program
{
    public static void main(String args[])
    {
        long x = 600851475143L;
        int largestPrime = -1;
        for (int i = 2; i <= x; i++)
        {
            if( prime(i) && (x % i == 0) )
            {
                largestPrime = i;
                x /= largestPrime;
            }
        }
        System.out.println(largestPrime);
    }
    
    public static boolean prime(int n) // checks if a number is prime
    {
        for(int i = 2; i < n; i++)
            if( n % i == 0)
                return false;
        return true;
    }
}
