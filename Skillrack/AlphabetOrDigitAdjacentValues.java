/*

Alphabet Or Digit Adjacent Values

input:  heir4567
output: her hir 467 456

input:  apple12354mango
output: aple aple appe 1354 1254 1234 mngo mago mano

*/
import java.util.*;
public class Main {

    public static void print(String k)
    {
        int len = k.length();
        
        for(int i=1;i<k.length()-1;i++)
        {
            for(int j=0;j<k.length();j++)
            {
                if(j==i) continue;
                else System.out.print(k.charAt(j));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) 
    {

		Scanner  sc = new Scanner(System.in);
	
        String s = "heir4567";
        
        int st = 0;
        
        for(int i=0;i<s.length();i++)
        {
            char ch1 = s.charAt(st);
            char ch2 = s.charAt(i);
            if( (( 'a'<=ch1 && ch1<='z' ) && ('0'<=ch2 && ch2<='9')) || (('0'<=ch1 && ch1<='9') &&  ('a'<=ch2 && ch2<='z')) )
            {
                print(s.substring(st,i));
                st = i;
            }
        }
        print(s.substring(st,s.length()));
	}
}
