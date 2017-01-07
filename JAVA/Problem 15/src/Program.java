
public class Program 
{
	public static void main(String[] args)
	{
		int gridSize = 20;
		long[][] grid = new long[gridSize+1][gridSize+1];
		
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
