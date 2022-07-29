/*
String Triangle Pattern

input: 

2
ask happy word letter king

output:

sk 
py rd 
er ng **

*/
import java.util.*;
public class Hello {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=0,ct=1;
        while(sc.hasNext())
        {
            String str = sc.next();
            System.out.print(str.substring(str.length()-n,str.length())+" ");
            k++;
            if(k==ct)
            {
                System.out.println();
                ct+=1;
                k=0;
            }

        }
        String star ="";
        // System.out.print(ct+" "+k);
        for(int j=1;j<=n;j++)  star+='*';
        if(k>0)
        {
            for(int i=k;i<ct;i++)
            {
                System.out.print(star+" ");
            }
        }
	}
}
