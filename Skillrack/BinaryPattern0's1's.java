/*

Consecutive 0's and 1's - Binary Patttern

input1  : 463
output1 : 111  
          00
          1111 

input2  : 81
output2 : 1
          0
          1
          000
          1

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        long k = sc.nextLong();
        String str = "";
        
        long sum = 0;
        while(k>0)
        {
            long rem = k%2;
            if(rem==0) str =  str + "0";
            else str = str + "1" ;
            k/=2;
        }
        // System.out.print(str);
        
        for(int i=str.length()-1;i>=0;i--)
        {
            char c1 = str.charAt(i);
            System.out.print(c1);
            if(i==0) break;
            
            char c2 = str.charAt(i-1);
            
            if(c1!=c2) System.out.println();
        }
        
    }
}
