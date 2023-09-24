/*

Vowels & Consonants - S1 & S2

The program must accept two string values S1 and S2 of equal length as the input.
The program must print YES if both the string values have a vowel or a consonant at
the same position. Else the program must print NO as the output.
Boundary Condition(s):
1 <= Length of S1, S2 <= 1000
Input Format:
The first line contains S1.
The second line contains S2.
Output Format:
The first line contains YES or NO.

Example Input/Output 1:
Input:
mcabcdeng
SKILLRACK
Output:
YES
Explanation:
Here both the string values have a vowel or a consonant at the same position.
m S - consonants
c K - consonants
a I - vowels
b L - consonants
c L - consonants
d R - consonants
e A - vowels
n C - consonants
g K - consonants
Hence the output is YES

Example Input/Output 2:
Input:
yogaa
power
Output:
NO

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
	    Scanner sc = new Scanner(System.in);
	    String s1 = sc.next(), s2 = sc.next();
	    int f1=0,f2=0,ct=0;
	    for(int i=0;i<s1.length();i++)
	    {
	        char c1=s1.charAt(i), c2=s2.charAt(i);
	        // System.out.println(c1+" "+c2);
	        
	        if( c1=='a' || c1=='e' || c1=='i' || c1=='o' || c1=='u' || c1=='A' || c1=='E' || c1=='I'|| c1=='O' || c1=='U')
	        {
	            f1=1;
	        }else  f1=2;
	        
	        if( c2=='a' || c2=='e' || c2=='i' || c2=='o' || c2=='u' || c2=='A' || c2=='E' || c2=='I' || c2=='O' || c2=='U' )
	        {
	            f2=1;
	        }
	        else{
	            f2=2;
	        }
	        
	        // System.out.println(f1+" "+f2+" "+ct);
	        if(f1==f2) 
	        {
	            ct+=1;
	        }
	        else
	        {
	            System.out.print("NO");
	            break;
	        }
	    }
	    
	    if(ct==s1.length()) System.out.print("YES");

	}
}
