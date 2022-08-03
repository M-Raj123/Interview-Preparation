/*

input : N-5  X-6 
        1 2 3 4 5
        6 7 8 9 10
        11 12 13 14 15
        16 17 18 19 20
        21 22 23 24 25

output: 10 

*/

import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		int arr[][] = new int[n][n] ;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        int key=1;
        int rs = 0 , re = n , cs = 0 , ce = n,flag=0;
        while(rs<re && cs<ce)
        {
            for(int i=cs;i<ce;i++)
            {
                if(key==x)
                {
                    System.out.print(arr[rs][i]);
                    flag=1;
                    break;
                }
                key++;
            }
            rs++;
            
            if(flag==1) break;
            
            for(int i=rs;i<re;i++)
            {
                if(key==x)
                {
                    System.out.print(arr[i][ce-1]);
                    flag=1;
                    break;
                }
                key++;
            }
            ce--;
            
            if(flag==1) break;
            for(int i=ce-1;i>=cs;i--)
            {
                if(key==x)
                {
                    System.out.print(arr[re-1][i]);
                    flag=1;
                    break;
                }
                key++;
            }
            re--;
            
            if(flag==1) break;
            
            for(int i=re-1;i>=rs;i--)
            {
                if(key==x)
                {
                    System.out.print(arr[i][cs]);
                    flag=1;
                    break;
                }
                key++;
            }
            cs++;
            if(flag==1) break;
        }
        
    }
}
