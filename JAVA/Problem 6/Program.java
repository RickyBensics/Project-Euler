/**
 * The sum of the squares of the first ten natural numbers is 1^2 + 2^2 + ... + 10^2 = 385
 * The square of the sum of the first ten natural numbers is (1 + 2 + ... + 10)^2 = 55^22 = 3025
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 * 
 * We could aproach this using summation formulas, but let's assume that I didn't know what they were.
 * 
 * Richard Bensics
 * 9/29/16
 */
public class Program
{
    public static void main(String args[])
    {
        int[] SumOfSquares = new int[100];
        int[] SumOfNumbers = new int[100];
        SumOfNumbers[0] = 1;
        SumOfSquares[0] = 1;
        for(int i = 1; i < 100; i++)
        {
            SumOfNumbers[i] = SumOfNumbers[i-1] + i+1;
            SumOfSquares[i] = SumOfSquares[i-1] + (i+1)*(i+1);
        }
        System.out.println( (SumOfNumbers[99]*SumOfNumbers[99]) - SumOfSquares[99] );
    }
}