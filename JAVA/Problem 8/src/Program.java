/**
 *The four adjacent digits in the 1000-digit number that have the greatest product are 9 × 9 × 8 × 9 = 5832.
 *(Big Number)
 *Find the thirteen adjacent digits in the 1000-digit number that have the greatest product. What is the value of this product?
 * 
 * Richard Bensics
 * 10/16/16
 */
import java.io.*;

public class Program 
{
	public static void main (String[] args)
	{
		String filename = "src/number.txt";	
		int digit;
		int i = 0;
		int[] numbuffer = new int[1000];
		String line;
		
		try
		{
			FileReader filereader = new FileReader(filename);
			
			BufferedReader bufferedreader = new BufferedReader(filereader);
			
			do // Reads chars in text document, converts chars to ints, and puts them in an array
			{
				while(Character.getNumericValue(digit = bufferedreader.read()) != -1) // read() returns -1 if line break or EOF
				{
					numbuffer[i] = Character.getNumericValue(digit);
					i++;
				}
			}
			while ((line = bufferedreader.readLine()) != null);
			
			bufferedreader.close();
			
			System.out.println(findLargestProduct(numbuffer,13));
		}
		catch(IOException ex)
		{
			System.out.println("unable to read file");
			ex.printStackTrace();
		}
	}
	
	static int findLargestProduct(int[] numbuffer, int consecutiveDigits)
	{
		int product = 0, maxproduct = 0;
		for(int i = 0; i < 1000-consecutiveDigits; i++)
		{
			for(int j = 0; j < consecutiveDigits; j++)
			{
				if( j == 0)
					product = numbuffer[i+j];
				else
					product *= numbuffer[i+j];
			}
			if (product > maxproduct)
				maxproduct = product;
		}
		return maxproduct;
	}
}
