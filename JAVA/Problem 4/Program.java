/**
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the product of two 3-digit numbers.
 * 
 * Richard Bensics
 * 9/24/16
 */
public class Program
{
    public static void main(String args[])
    {
        int largestPalindrome = 0;
        int[] intArray = new int[6];
        boolean palindrome = false;
        String temp;
        
        for(int i = 100; i < 1000; i++)
        {
            for(int j = i; j < 1000; j++)
            {
                temp = Integer.toString(i*j);
                for (int k = 0; k < temp.length(); k++)
                {
                    intArray[k] = temp.charAt(k) - '0';
                }
                for (int k = 0; k < temp.length()/2; k++)
                {
                    if(intArray[k] == intArray[temp.length()-k-1])
                    {
                        palindrome = true;
                    }
                    else 
                    {
                        palindrome = false;
                        break;
                    }
                }
                if(palindrome && Integer.parseInt(temp) > largestPalindrome)
                {
                    largestPalindrome = Integer.parseInt(temp);
                }
                palindrome = false;
            }
        }
        System.out.println(largestPalindrome);
    }
}
