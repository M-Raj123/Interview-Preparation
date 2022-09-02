/*

Integer with Largest Digits Sum

The program must accept an integer N as the input. The program must print an integer
from 1 to N which has the largest sum of digits as the output. If more than one integers
contain the largest digits sum, then the program must print the largest integer among
them as the output.

Boundary Condition(s):
1 <= N <= 1000
Input Format:
The first line contains the value of N.
Output Format:
The first line contains the integer with the largest digits sum.

Example Input/Output 1:
Input:
100
Output:
99
Explanation:
sum of digits in 1 is 1
.sum of digits in 2 is 2
.
.
sum of digits in 98 is 17
sum of digits in 99 is 18
sum of digits in 100 is 1
From 1 to 100, 99 has the largest digit sum (9 + 9 = 18).

Example Input/Output 2:
Input:
48
Output:
48

Example Input/Output 3:
Input:
521
Output:
499

*/

import java.util.*;
public class Main {

    public static void main(String[] args) {
		//Your Code Here
		Scanner sc = new Scanner(System.in);
        int  n = sc.nextInt();
        /* Brute force not working due to time complexity
        for(int i=n;i>=1;i++)
        {
            int dup = i,ty = 0;
            while(dup>0)
            {
                int ee = dup%10;
                ty += ee;
                dup/=10;
            }
            
            if(mx<ty)
            {
                num= i;
                mx = ty;
            }
        }
        System.out.print(num);
        
        */
        int m = n,flag=0;
        while(m>0)
        {
            int rem = m%10;
            m/=10;
            if(m>0)
            {
                if(rem>=0 )
                {
                    sum+=9;
                }
                if(rem!=9) 
                {
                    flag= 1;
                }
            }
            else 
            {
                if(flag==1) sum += rem-1;
                else sum += rem;
            }
        }
        
        for(int i=n;i>=1;i--)
        {
            int tot=0, k=i;
            while(k>0)
            {
                int r = k%10;
                tot+=r;
                k/=10;
            }
            
            if(tot==sum)
            {
                System.out.print(i);
                break;
            }
        }
        // System.out.print(" sum "+sum);
	}
}
