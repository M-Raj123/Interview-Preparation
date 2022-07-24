/*
input:
2
good bye
take care

output:

gboyode
tcaakree

*/
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(n);
        for(int i=0;i<n;i++)
        {
            String k1 = sc.next() , k2 = sc.next();
            int p=0, q=0, a=k1.length(), b=k2.length();
            
            while(p<a && q<b)
            {
                System.out.print(k1.charAt(p++));
                System.out.print(k2.charAt(q++));
            }
            
            if(p<a)
            {
                for(int rem=p;rem<a;rem++)
                {
                    System.out.print(k1.charAt(rem));
                }
            }
            else{
                for(int rem=q;rem<b;rem++)
                {
                    System.out.print(k2.charAt(rem));
                }
            }
            System.out.println();
        }
	  }
}
