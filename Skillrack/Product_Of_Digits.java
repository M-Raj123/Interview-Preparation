/*

Product of Digits

The program must accept N integers as the input. For each integer, the program
must print the product of digits in the integer as the output.
Boundary Condition(s):
1 <= N <= 100
1 <= Each Integer Value <= 10^5
Input Format:
The first line contains the integer N.
The second line contains N integers separated by space(s).
Output Format:
The first line contains the product of digits for N integers separated by a space.

Example Input/Output 1:
Input:
4
35 871 63 46
Output:
15 56 18 24
Explanation:
The product of digits in 35 is 15 (3 * 5).
The product of digits in 871 is 56 (8 * 7 * 1).
The product of digits in 63 is 18 (6 * 3).
The product of digits in 46 is 24 (4 * 6).
Hence the output is 15 56 18 24

Example Input/Output 2:
Input:
5
166 56 12 9 765
Output:
36 30 2 9 210

Max Execution Time Limit: 4000 millisecs

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=0;i<a;i++)
        {
            int k = sc.nextInt();
            int sum =1;
            while(k>0)
            {
                sum*=k%10;
                k/=10;
            }
            
            System.out.print(sum+" ");
        }
	}
}
