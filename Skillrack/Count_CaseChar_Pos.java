/*
input: Good Animal Elephant
       1
       u (or) U
output:
       1
       explanation : 1 represent 'A'  so the count=>1
*/

import java.util.*;
public class Hello {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int n  = sc.nextInt();
		char ch = sc.next().charAt(0);
		
		if(ch=='u' || ch=='U')
		{
		    ch = (char)(64+n);
		}
		else
		{
		    ch = (char)(96+n);
		}
		System.out.println(ch);
		
		int count=0;
		for(int i=0;i<s.length();i++)
		{
		    char fg = s.charAt(i);
		    if(fg==ch)
		    {
		        count++;
		    }
		}
		
		if(count==0) System.out.print(-1);
		else System.out.print(count);
	}
}
