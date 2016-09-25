/**
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 * 
 * Richard Bensics
 * 9/25/16
 */
public class Program
{
    public static void main(String args[])
    {
        boolean found = false;
        int i = 2520;
        while(!found)
        {
            for(int j = 1; j <= 20; j++)
            {
                if(i%j != 0)
                    break;
                if(j == 20)
                {
                    found = true;
                    System.out.println(i);
                }
            }
            i++;
        }
    }
}
