/*

Sum - Remove Tenth digit

input  1 : 4
           102 23 134 19
output 1 : 38

*/


import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.next();
        }
        
        int sum =0;
        while(n-->0)
        {
            int len = arr[n].length();
            String k = arr[n].substring(0,len-2)+arr[n].substring(len-1);
            // System.out.print(k+" ");
            sum += Integer.parseInt(k);
        }
        System.out.print(sum);
	  }
}
