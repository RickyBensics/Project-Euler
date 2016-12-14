/**
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid listed in Grid.txt?
 * 
 * Richard Bensics
 * 12/14/16
 */
import java.io.*;

public class Program
{
    public static void main(String[] args)
    {
        String line = null;
        int[][] grid = new int[20][20];
        int largestHorizontal = 0, largestVertical = 0, largestSlash = 0, largestBackSlash = 0;
        int largestProduct = 0;
        int temp = 0;
        try
        {
            int i = 0;
            FileReader fr = new FileReader("Grid.txt");
            BufferedReader br = new BufferedReader(fr);
            while( (line = br.readLine()) != null)
            {
                String [] tokens = line.split("[ ]"); // Parse the line, split up numbers between spaces
                for (int j = 0; j < 20; j++)
                    grid[i][j] = Integer.parseInt(tokens[j]);
                i++;
            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        for(int i = 0; i < 20; i++)
        {
            for(int j = 0; j < 20; j++)
            {
                if( j + 3 < 20) // -
                    temp = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
                if(temp > largestHorizontal)
                    largestHorizontal = temp;
                    
                if( i + 3 < 20) // |
                    temp = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
                if(temp > largestVertical)
                    largestVertical = temp;
                    
                if( i + 3 < 20 && j + 3 < 20)// /
                    temp = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                if(temp > largestSlash)
                    largestSlash = temp;
                    
                if( i + 3 < 20 && j - 3 >= 0) // \
                    temp = grid[i][j] * grid[i+1][j-1] * grid[i+2][j-2] * grid[i+3][j-3];
                if(temp > largestBackSlash)
                    largestBackSlash = temp;
            }
        }
        
        if(largestHorizontal > largestVertical)
            largestProduct = largestHorizontal;
        else
            largestProduct = largestVertical;
        if(largestProduct < largestSlash)
            largestProduct = largestSlash;
        if(largestProduct < largestBackSlash)
            largestProduct = largestBackSlash;
            
        System.out.println("The largest product is " + largestProduct);
    }
}
