/*

input : 1121ZU  
output: ez

explanation:
        sum:5 (1+1+2+1)
        z+5 = e 
        u+5 =z
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		int sum=0;
		for(int i=0;i<str.length();i++)
		{
		    char ch = str.charAt(i);
		    if(ch>='0' && ch<='9')
		    {
		        sum+= ch-'0';
		    }
		}
		for(int i=0;i<str.length();i++)
		{
		    char ch = str.charAt(i);
		    if( (ch>='0' && ch<='9')) continue;
		    else
		    {
		        int val = (ch-'a')+sum;
		        if(ch>='A' && ch<='Z') 
		        {
		            val = (ch-'A')+sum;
		        }
		        System.out.println(val);
		        if(val>25)
		        {
		            val = (val)%26;
		        }
		        System.out.println( (char)(96+val+1));
		    }
		}
	}
}
