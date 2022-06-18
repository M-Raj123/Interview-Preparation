/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main {
    public static int palin(String k)
    {
        int p=0,q=k.length()-1;
        int flag=1;
        while(p<q)
        {
            if(k.charAt(p)!=k.charAt(q))
            {
                flag=0;
                break;
            }
            
            p++;
            q--;
        }
        return flag;
    }
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String word="",t1="",t2="";
		int mx = 0, mn = Integer.MAX_VALUE;
		for(int i=0;i<str.length();i++)
		{
		    char ch = str.charAt(i);
		    if(ch==' '){
		        System.out.println(word);
		        if(palin(word)==1)
		        {
		            System.out.println("true "+word);
		            if(mx<word.length())
		            {
		                t1 = word;
		                mx = word.length(); 
		            }
		            if(mn>word.length())
		            {
		                t2 = word;
		                mn = word.length();
		            }
		        }
		        word="";
		    }
		    else{
		        word+=ch;
		    }
		}
		
		if(palin(t1)==1 && t1.length()<word.length()) t1 =  word;
		if(palin(t2)==1 && t2.length()>word.length()) t2 = word;
		System.out.print(t1+" "+t2);
	}
}
/*
print longest and smallest palindrome
input
aba abba abcba aabbaa z 
madam mam mem modulation malayalam
output 
aabbaa  z
malayalam mam
*/
