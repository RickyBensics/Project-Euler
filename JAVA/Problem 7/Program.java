/**
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 * What is the 10001st prime number?
 * 
 * Richard Bensics
 * 10/05/16
 */
public class Program
{
    public static void main(String args[])
    {
        int primeCount = 1;
        boolean isPrime;
        for(int i = 2; i < Integer.MAX_VALUE; i++)
        {
            isPrime = true;
            for(int j = 2; j < i; j++)
            {
                if ( (i % j == 0) && (i != j) )
                {
                    isPrime = false;
                    break;
                }
            }
            if ( isPrime == true)
            {
                if(primeCount == 10001)
                {
                    System.out.println(i);
                    break;
                }
                primeCount++;
            }
        }
    }
}
