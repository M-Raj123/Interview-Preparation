/*
Count of Longest Consecutive 1's

The program must accept an integer N as the input. The program must print the count
of longest consecutive 1's in the binary representation of N as the output.
Boundary Condition(s):
1 <= N <= 99999999
Input Format:
The first line contains the integer value of N.
Output Format:
The first line contains the count of longest consecutive 1's in the binary representation of
N.

Example Input/Output 1:

Input:
55

Output:
3

Explanation:
The binary representation of 55 is 110111.
The first two bits and the last three bits are consecutive 1's.
The count of the longest consecutive 1's is 3.
Hence, 3 is printed as the output.

Example Input/Output 2:
Input:
1468
Output:
4

*/
import java.util.*;
public class Hello 
{
    public static int count(int n)
    {
        String temp="";
        while(n>0)
        {
            int rem = n%2;
            char ch = (char)(rem+'0');
            temp = ch+temp;
            n/=2;
        }
        System.out.println(temp);
        
        int mx=0,ct=0;
        for(int i=0;i<temp.length();i++)
        {   
            char ch = temp.charAt(i);
            if(ch=='1')
            {
                ct++;
                if(mx<ct)
                {
                    mx = ct;
                }
            }else ct=0;
        }
        return mx;
    }
    public static void main(String[] args) 
    {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.print(count(n));
	}
}
