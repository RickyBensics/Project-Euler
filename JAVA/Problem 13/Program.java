/**
 * Work out the first ten digits of the sum of the following one-hundred 50-digit numbers listed in Numbers.txt
 * 
 * Richard Bensics
 * 12/15/16
 */

import java.io.*;
import java.math.*;

public class Program
{
    public static void main(String args[])
    {
        String line = null;
        BigInteger sum = BigInteger.ZERO;
        try
        {
            FileReader fr = new FileReader("Numbers.txt");
            BufferedReader br = new BufferedReader(fr);
            while( (line = br.readLine()) != null)
            {
                sum = sum.add(new BigInteger(line));
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        String sumString = sum.toString();
        System.out.println("The first 10 digits of this sum are " + sumString.substring(0,10));
    }
}
