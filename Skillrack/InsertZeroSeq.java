/*
Zero Insert After K Times One
Given a bit stream of length N consisting of 0s and 1s, insert 0 after 1 has appeared K
times consecutively.
Input Format:
The first line contains N and K separated by a space.
The second line contains the bit stream with 1s and 0s with each value separated by a
space.
Output Format:
The first line the bit stream with the 0 inserted after 1s have appeared K times with each
value separated by a space.
Boundary Conditions:
1 <= K <= 1000
2 <= N <= 1000
Example Input/Output 1:
Input:
12 2
1 0 1 1 0 1 1 0 1 1 1 1
Output:
1 0 1 1 0 0 1 1 0 0 1 1 0 1 1 0
*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int seq = sc.nextInt();
        int count = 0 ;
        for(int i=0;i<n;i++)
        {
            int k = sc.nextInt();
            if(k == 1)
            {
                System.out.print("1");
                count++;
                if(count==seq)
                {
                    System.out.print(" 0");
                    count = 0; // eliminate more than seq 
                }
            }
            else
            {
                System.out.print("0");
                count = 0;
            }
            System.out.print(" ");
        }
        
        if(count==seq) System.out.print(" 0");
       	
    }
}
