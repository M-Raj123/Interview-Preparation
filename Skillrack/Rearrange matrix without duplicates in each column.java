/*
Rearrange matrix without duplicates in each column

input: 3 3
       4 5 5
       4 6 7
       7 5 7

output: YES

explanation:

        4 4 5
        5 5 6
        7 7 7
    
*/

import java.util.*;
public class Main {
    public static void main(String[] args) {
		//Your Code Here
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(),c = sc.nextInt();
        int arr[][]  =  new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++) arr[i][j] = sc.nextInt();
        }
        
        int flag=0;
        HashMap<Integer,Integer> hs = new HashMap<>(); 
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int val = arr[i][j];
                if(hs.containsKey(val))
                {
                    hs.put(val,hs.get(val)+1);
                    if(hs.get(val)>c)
                    {
                        flag=1;     
                        break;
                    }
                    
                }
                else{
                    hs.put(val,1);
                }
            }
        }
        
        if(flag==0) System.out.print("YES");
        else  System.out.print("NO");
	}
}
