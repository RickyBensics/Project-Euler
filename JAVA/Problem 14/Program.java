/**
 * The following iterative sequence is defined for the set of positive integers:
 * n → n/2 (n is even)
 * n → 3n + 1 (n is odd)
 * 
 * Using the rule above and starting with 13, we generate the following sequence:
 * 13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
 * 
 * Which starting number, under one million, produces the longest chain?
 * 
 * Richard Bensics
 * 12/19/16
 */

import java.util.*;

public class Program
{
    public static void main(String args[])
    {
        int stop = 1000000;
        int maxCount = 0;
        int number = 0;
        int[] numberCache = new int[stop];
        int[] indices = new int[stop];
        for(int i = 1; i < stop; i++)
        {
            long n = i;
            int temp = 0;
            while(n != 1)
            {
                if (n < i) // We can cache repeated sequences and use binary search to drastically improve time efficiency
                {                 
                    int index = Arrays.binarySearch(indices, 0, i,(int) n);
                    temp += numberCache[index];
                    break;
                }
                if(n % 2 == 0)
                {
                    n /= 2;
                }
                else
                {
                    n = 3*n+1;
                }
                temp++;
            }
            indices[i-1] = i;
            numberCache[i-1] = temp;
            if (temp > maxCount)
            {
                maxCount = temp + 1;
                number = i;
            }
        }
        System.out.println("The number under one million to produce the largest chain is " + number + " with a chain length of " + maxCount);
    }
}