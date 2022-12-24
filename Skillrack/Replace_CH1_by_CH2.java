/*

Replace CH1 by CH2

The program must accept a string S and two characters CH1 and CH2 as the input. The
program must replace all the occurrences of CH1 by CH2 in the string S. Then the
program must print the modified string as the output.
Boundary Condition(s):
1 <= Length of S <= 100
Input Format:
The first line contains the value of the string S.
The second line contains the value of CH1 and CH2 separated by a space.
Output Format:
The first line contains the modified string.
Example Input/Output 1:
Input:
terrorist
r d
Output:
teddodist
Explanation:
All the occurrences of 'r' are replaced by 'd' in the string "terrorist".
Hence the output is teddodist
Example Input/Output 2:
Input:
manipulasion
s t
Output:
manipulation

*/

import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        char c1 = sc.next().charAt(0);
        char c2 = sc.next().charAt(0);
        for(int i=0;i<k.length();i++)
        {
            if(k.charAt(i)==c1)
            {
                System.out.print(c2);
            }
            else System.out.print(k.charAt(i));
        }
	  }
}


