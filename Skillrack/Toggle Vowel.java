/*
Toggle Vowel

A string S containing only alphabets is passed as the input to the program. The program
must toggle the case of vowels at odd positions and print the string.

Boundary Condition(s):
1 <= Length of S <= 1000
Input Format:
The first line contains the String S.
Output Format:
The first line contains the string with vowels toggled at the odd positions.

Example Input/Output 1:
Input:
cool
Ouput:
coOl
Explanation :
vowel 'o' in 3rd position is toggled.

Example Input/Output 2:
Input:
URANIUM
Ouput:
uRaNiUM
Explanation :
vowels 'U' is in 1st , 'A' is in 3rd and 'I' is in 5th positions are toggled.

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		for(int i=0;i<str.length();i++)
		{
		    char ch = str.charAt(i);
		    if(i%2==0)
		    {
		        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
		        {
		            char k = (char)(ch-32);
		            System.out.print(k);
		        }
		        else if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
		        {
		            char K = (char)(ch+32);
		            System.out.print(K);
		        }
		        else 
		        {
		            System.out.print(ch);
		        }
		    }
		    else
		    {
		        System.out.print(ch);
		    }
		}
	}
}
