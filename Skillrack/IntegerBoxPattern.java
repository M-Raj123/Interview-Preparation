/*

input  : 45

output : +--+
	 |45|
	 +--+

*/

import java.util.*;
public class Hello {
    public static void main(String[] args) 
    {
    		Scanner sc = new Scanner(System.in);
    		String str = sc.next();
    		for(int i=0;i<3;i++)
    		{
    		    for(int j=0;j<str.length()+2;j++)
    		    {
    		        if( (i==0 || i==2) )
    		        {
    		            if(j==0 || j==str.length()+1)
    		            {
    		                System.out.print("+");
    		            }
    		            else System.out.print("-");
    		        }
    		        else
    		        {
    		            System.out.print("|"+str+"|");
    		            break;
    		        }
    		    }
    		    System.out.println();
    		}
	  }
}
