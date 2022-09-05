/*

input : 3 3
output: 6

explanation:

1 <-1 <-1
    ^   ^
1 <-2 <-3
    ^   ^
1 <-3 <-6

TC: O(mn)
SC: O(mn)

*/
import java.util.*;
class GridTravelerMemo 
{
	public static void main(String[] args) 
	{
      Scanner sc =  new Scanner(System.in);
      
      int r= sc.nextInt(), c = sc.nextInt();
      long count[][] = new long[r][c];  
	    
	    for(int i=0;i<r;i++) count[i][0] = 1;
	    for(int i=0;i<c;i++) count[0][i] = 1;
	    
	    for(int i=1;i<r;i++)
	    {
	        for(int j=1;j<c;j++)
	        {
	            count[i][j]= count[i-1][j] + count[i][j-1];
	        }
	    }
	    
	    System.out.println( count[r-1][c-1] );
	}
}

/*

TC: O(mn)
SC: O(n)

class GFG 
{
	static long numberOfPaths(int m, int n)
	{
		// Create a 1D array to store results of subproblems
		long[] dp = new long[n];
		dp[0] = 1;

		for (int i = 0; i < m; i++) {
			for (int j = 1; j < n; j++) {
				dp[j] += dp[j - 1];
			}
		}

		return dp[n - 1];
	}

	public static void main(String args[])
	{
		System.out.println(numberOfPaths(18, 18));
	}
}

*/
