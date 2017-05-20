/**
 *  Begin by sorting names.txt into alphabetical order.
 *  Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.
 *  What is the total of all the name scores in the file?
 * 
 * Richard Bensics
 * 5/19/17
 */

import java.io.*;
import java.util.Arrays;
import java.util.Collections;
import java.math.*;

public class Program
{
	public static void main(String[] args)
	{
		String filename = "src/names.txt";
		String line;
		String[] names = null;
		int nameSum;
		BigInteger totalSum = new BigInteger("0");
		
		try
		{
			FileReader fileReader = new FileReader(filename);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			while( ( line = bufferedReader.readLine() ) != null)
			{
				names = line.split(",");
			}
			
			Collections.sort( Arrays.asList(names) );
			
			for(int i = 0; i < names.length; i++)
			{
				nameSum = 0;
				for(int j = 1; j < names[i].length()-1; j++) // Adjust limits to ignore " characters
				{
					nameSum += names[i].charAt(j) - 64; // Obtain position in alphabet using unicode dec value
				}
				totalSum = totalSum.add( BigInteger.valueOf( nameSum*(i+1) ) );
				System.out.println(names[i] + " " + nameSum);
			}
				System.out.println(totalSum);
			
			bufferedReader.close();
		}
		catch(IOException ex)
		{
			System.out.println("unable to read file");
			ex.printStackTrace();
		}
	}
}