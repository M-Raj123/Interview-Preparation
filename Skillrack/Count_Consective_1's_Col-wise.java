/*
count consecutive 1's in column-wise

input:  3
        0 0 1
        1 0 1
        1 0 1
        
output: 2

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt(), c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i=0;i<r;i++)
		{
		    for(int j=0;j<c;j++)
		    {
		        arr[i][j] = sc.nextInt();
		    }
		}
		int ct = 0;
		for(int i=0;i<c;i++)
		{
		    int flag=0,gg=0;
		    for(int j=0;j<r;j++)
		    {
		        int v = arr[j][i];
		        if(v==1 || flag==1)
		        {
		            flag=1;
		            if(v!=0) gg++;
		            if(v==0)
		            {
		                flag=0;
		                if(gg>1)
		                {
		                    ct++;
		                }
		                gg=0;
		            }
		        }
		    }
		    if(gg>1) ct++;
		}
		System.out.print(ct);
	}
}
