/*
Consonants Rotated String in anti-clockwise direction

input:  aabaajaaks 2
output: aakaasaabj

input:  helloworld 5
output: ledhololwr 
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.next();
		int n = sc.nextInt();
		String temp = "";
		for(int i=0;i<k.length();i++)
		{
		    char ch = k.charAt(i);
		    if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
		    {
		        temp+=ch;
		    }
		}
		int p = 0;
	        n = n%(temp.length());
		while(p<k.length())
		{
		    char ch = k.charAt(p);
		    if(ch!='a' && ch!='e' && ch!='i' && ch!='o' && ch!='u')
		    {
		        System.out.print(temp.charAt(n++));
		        if(n==temp.length()) n=0;
		    }
		    else System.out.print(k.charAt(p));
		    p++;
		}
	}
}
