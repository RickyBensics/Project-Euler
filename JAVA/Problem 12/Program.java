/**
 * The sequence of triangle numbers is generated by adding the natural numbers.
 * What is the value of the first triangle number to have over five hundred divisors?
 * 
 * Richard Bensics
 * 12/15/16
 */

import java.util.*;
public class Program
{
    public static void main(String args[])
    {
        ArrayList<Long> triangleNumbers = new ArrayList<Long>();
        triangleNumbers.add(Long.valueOf(1));
        int divisorCount = 0;
        while(true)
        {
            divisorCount = 0;
            triangleNumbers.add(triangleNumbers.get(triangleNumbers.size()-1)+triangleNumbers.size()+1); // Dynamic programming :)
            for(long i = 1; i <= Math.sqrt(triangleNumbers.get(triangleNumbers.size()-1)); i++)
            {
                if( triangleNumbers.get(triangleNumbers.size()-1) % i == 0)
                {
                    divisorCount+=2;// if i is a divisor of the triangle number, then the number divided by i is also a divisor
                }
            }
            //System.out.println(triangleNumbers.get(triangleNumbers.size()-1) + " " + divisorCount);
            if(divisorCount > 500)
                break;
        }
        System.out.println("The first triangle number with over 500 divisors is " + triangleNumbers.get(triangleNumbers.size()-1) + " with " + divisorCount + " divisors");
    }
}