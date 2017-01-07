/**
 * Starting in the top left corner of a 2×2 grid, and only being able to move to the right and down, 
 * there are exactly 6 routes to the bottom right corner.
 * 
 * How many such routes are there through a 20×20 grid?
 * 
 * Richard Bensics
 * 1/7/17
 */

public class Program 
{
	public static void main(String[] args)
	{
		int gridSize = 20;
		long[][] grid = new long[gridSize+1][gridSize+1];
		
		//Pascal's triangle using dynamic programming
		for(int i = 0; i < gridSize+1; i++)
		{
			grid[0][i] = 1;
			grid[i][0] = 1;
		}
		
		for(int i = 1; i < gridSize+1; i++)
		{
			for(int j = 1; j < gridSize+1; j++)
			{
				grid[i][j] = grid[i-1][j] + grid[i][j-1];
			}
		}
		System.out.println(grid[gridSize][gridSize]);
	}

}
