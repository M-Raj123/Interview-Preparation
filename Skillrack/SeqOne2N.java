/*
Sequence - 1 to N
*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    for(int i=1;i<=n;i++)
	    {
	        if(i%3==0 && i%5==0)
	        {
	            System.out.println("SkillRack");
	        }
	        else if(i%3!=0 && i%5!=0)
	        {
	            System.out.println(i);
	        }
	        else if(i%3==0)
	        {
	            System.out.println("Skill");
	        }
	        else if(i%5==0)
	        {
	            System.out.println("Rack");
	        }
	        
	    }
    }
}
