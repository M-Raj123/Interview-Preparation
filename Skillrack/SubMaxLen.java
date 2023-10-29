/*

Substring - Maximum Length

input1: 
s1 = SkillRack
s2 = skillrack 

input2:
s1 = abxycqfemn
s2 = abyxyqgamn

output1: 
kill 

output2:
ab

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next(), s2 = sc.next();
        int max = 0, supermax = 0 ;
        String k = "", superk = "";
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i) )
            {
                max +=1;
                k += s1.charAt(i);
            }
            else
            {
                if(max>supermax)
                {
                    supermax = max ;
                    superk = k;
                }
                max = 0;
                k = "";
            }
        }
        
        if(max>supermax)
        {
            superk = k ;
        }
        
        System.out.print(superk);
      
	  }
}
