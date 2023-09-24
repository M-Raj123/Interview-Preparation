/*

input:
Digitization    AAAA
i 3             A 7

output:
Dgtzation       -1

*/
import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
	    Scanner sc = new Scanner(System.in);
	    
	    String str = sc.next();
	    char    ch = sc.next().charAt(0); 
	    int      x = sc.nextInt(), ct = 0, flag=-1 ;
	    
	    for(char i : str.toCharArray())
	    {
	        if(ch==i && ct<x)
	        {
	            ct+=1;
	        }
	        else 
	        {
	            System.out.print(i);
	            flag=1;
	        }
	    }

	    if(ct<=x && flag==-1) System.out.print("-1");
	
	    sc.close();  
	}
}
