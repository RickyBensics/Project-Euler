/**
 * Find the sum of the digits in the number 100! (factorial)
 * 
 * Richard Bensics
 * 1/22/17
 */

import java.math.BigInteger;

public class Program
{
    public static void main( String[] args )
    {
        BigInteger num = BigInteger.ONE;
        int sumDigits = 0;
        int factorialNum = 100;
        
        for( int i = 1; i <= factorialNum; i++ )
        {
            num = num.multiply(BigInteger.valueOf(i));
        }
        
        String[] digits = num.toString().split("");
        
        for( int i = 0; i < digits.length; i++ )
        {
            sumDigits += Integer.parseInt(digits[i]);
        }
        
        System.out.println("The sum of digits of " + factorialNum + "! is " + sumDigits);
    }
}
