/*
Row Increment - Last Element Unit Digit

input: 3 4
       10 12 13 15
       23 88 12 42
       99 89 79 11

output: 15 17 18 20
        25 90 14 44
        100 90 80 12

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r=sc.nextInt(),c=sc.nextInt();
		int[][] arr = new int[r][c];
		int ct[]  = new int[r];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        arr[i][j] = sc.nextInt();
		        if(j==c-1)
		        {
		            ct[i] = arr[i][j]%10;
		        }
		    }
		}
		
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        arr[i][j]+=ct[i];
		        System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}
	}
}
