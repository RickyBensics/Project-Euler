/**
 * By starting at the top of the triangle and moving to adjacent numbers on the row below,
 * find the maximum total from top to bottom of the triangle listed in triangle.txt
 * 
 * Richard Bensics
 * 1/13/17
 */

import java.io.*;

public class Program {

	public static void main(String[] args)
	{
		int depth = 0;
		String line = null;
		int[][] triangle = null; // could also be represented using a doubly linked list, but i'm feeling lazy
		try
        {
            FileReader fr = new FileReader("src/triangle.txt");
            BufferedReader br = new BufferedReader(fr);
            while( (line = br.readLine()) != null)
            {
            	depth++;
            }
            
            triangle = new int[depth][depth];
            
            fr = new FileReader("src/triangle.txt");
            br = new BufferedReader(fr);
            for(int i = 0; (line = br.readLine()) != null; i++)
            {
            	String[] numbers = line.split(" ");
            	for(int j = 0; j < numbers.length; j++)
            	{
            		triangle[i][j] = Integer.parseInt(numbers[j]);
            	}
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
		
		/*
		 * Bottom up programming. Starting at base of triangle, each number is a child of a parent number.
		 * The parent is then calculated to be the sum of the parent and the largest child.
		 */
		for(int i = depth-2; i >= 0; i--)
		{
			for(int j = 0; j < i+1; j++)
			{
				if(triangle[i+1][j] >= triangle[i+1][j+1])
					triangle[i][j] += triangle[i+1][j];
				else
					triangle[i][j] += triangle[i+1][j+1];
			}
		}
		
		System.out.print("The maximum path length from top to bottom is: " + triangle[0][0]);
	}
}
