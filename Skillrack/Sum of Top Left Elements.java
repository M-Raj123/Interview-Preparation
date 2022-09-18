/*

Sum of Top Left Elements

The program must accept an integer matrix of size RxC as the input. The program must
print the sum of top left quadrant elements as the output.
Boundary Condition(s):
1 <= R, C <= 99
Input Format:
The first line contains the integer values R and C separated by space(s).
The next R lines contain C integers each separated by space.
Output Format:
The first line contains the sum of top left quadrant elements.

Example Input/Output 1:
Input:
4 4
1 2 3 4
5 6 7 8
9 1 2 3
4 5 6 7
Output:
14
Explanation:
The top left elements are 1, 2, 5 and 6.
The sum of top left elements are 14 (1 + 2 + 5 + 6).
So, 14 is printed as the output.

Example Input/Output 2:
Input:
5 3
1 2 3
4 5 6
7 8 9
1 2 3
4 5 6
Output:
27
Explanation:
The top left elements are 1, 2, 4, 5, 7 and 8.
The sum of top left elements are 27 (1 + 2 + 4 + 5 + 7 + 8).
So, 27 is printed as the output.


*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(),sum=0, c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        arr[i][j]=sc.nextInt();
		    }
		}
		
		for(int i=0;i<(r/2)+(r%2);i++)
		{
		    for(int j=0;j<(c/2)+(c%2);j++)
		    {
		        sum+=arr[i][j];
		    }
		}
		System.out.print(sum);
 	}
}
