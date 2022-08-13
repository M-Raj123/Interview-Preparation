/*

Interlaced -ve and +ve 

input: 
       5
       16 17 20 -12 -14

output:
      -12 16 -14 17 20 

*/

import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int p = 0, q = 0, tot = 0;
    
        while(tot<n)
        {
            
            int c1 = 0,c2=0;
            while(p<n && c1<1)
            {
                if(p<n && arr[p]<0)
                {
                    System.out.print(arr[p]+" ");
                    p++;
                    c1+=1;
                    tot += c1;
                    break;
                }
                else
                {
                    p++;
                }
            }
   
            while(q<n && c2<1)
            {
                if(q<n && arr[q]>0)
                {
                    System.out.print(arr[q]+" ");
                    q++;
                    c2+=1;
                    tot += c2;
                    break;
                }
                else
                {
                    q++;
                }
            }
           
        }
	 }
}
