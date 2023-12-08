/*

Toggle Case - Two String Values

input  : 
s1 = book   s1 = GOOOOGLE
s2 = UlLu   s2 = lululUUl

output : 
BooK        gOoOoGLe

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		
		for(int i=0;i<a.length();i++)
		{
		    char c = b.charAt(i), d = a.charAt(i);
		    int e = (int)d;
		    if(c=='L' || c=='l')
		    {
		        if(e>96) System.out.println(d);
		        else System.out.println((char)(e+32));
		    }
		    else 
		    {
		        if(e<96) System.out.print(d);
		        else System.out.println((char)(e-32));
		    }
		 }
	 }
}
