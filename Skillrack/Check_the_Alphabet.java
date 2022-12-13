/*

Check the Alphabet

The program must accept a string value S and an integer X as the input. The
program much print yes if Xth
 position letter in the alphabetical order is present at
least once in S. Else the program must print no as the output.
Note: The string S must contain only lowercase alphabets.
Boundary Condition(s):
1 <= Length of S <= 100
1 <= X <= 26
Input Format:
The first line contains the string S.
The second line contains the integer X.
Output Format:
The first line contains either yes or no.

Example Input/Output 1:
Input:
kickstart
20
Output:
yes
Explanation:
In the alphabetical order, the alphabet in 20th position is t.
In the string "kickstart", the alphabet t have occurred twice.
Hence the output is yes

Example Input/Output 2:
Input:
fruit
1
Output:
no

*/

import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        int n  = sc.nextInt(),flag=0;
        char ch =(char)(n + 96);
        
        for(int i=0;i<k.length();i++)
        {
            if(ch== k.charAt(i) )
            {
                flag+=1;
            }
        }
        
        if(flag>=1) System.out.print("yes");
        else System.out.print("no");
	  }
}
