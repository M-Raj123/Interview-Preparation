/* 
   input : 4
   output:
        1
        22
        333
        4444
        4444
        333
        22
        1
*/
import java.util.*;
public class pattern1 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<i+1;j++)
            {
                System.out.print(i+1);
            }
            System.out.println();
        }
        for(int i=0;i<n;i++)
        {
            for(int j=n-i;j>0;j--)
            {
                System.out.print(n-i);
            }
            System.out.println();
        }
    }
}





/*

input: 4

output: 

    ---1
    --3-2
    -4-5-6
    10-9-8-7

*/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=1,val=0;
        for(int i=0;i<n;i++)
        {
            int flag=0;
            
            for(int j=0;j<n+i;j++)
            {
                if(i%2==0)
                {
                    if(j>=n-i-1 && flag==0)
                    {
                        System.out.print(k++);
                        flag=1;
                    }
                    else{
                        System.out.print('-');
                        flag=0;
                    } 
                    val = k+i+1;
                }
                else
                {
                    if(j>=n-i-1 && flag==0)
                    {
                        System.out.print(val--);  
                        k++;
                        flag=1;
                    }
                    else 
                    {
                        System.out.print('-');
                        flag=0;
                    }
                }
            }
            System.out.println();
        }
    }
}

/*
Input:
3

Output:
a*b*c
*d*e*
f*g*h

*/


import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
	    Scanner sc = new Scanner(System.in);
	    int n = sc.nextInt();
	    System.out.println("Pattern");
	    int f1=0,ct='a'; 
	    
	    for(int i=0;i<n;i++)
	    {
	        
	        if(i%2==0)
	        {
	            f1=0;
	        }
	        else{
	            f1=1;
	        }
	       
	        for(int j=0;j<n+(n-1);j++)
	        {
	            if(f1==0)
	            {
	                System.out.print((char)(ct++));
			if(ct>122)  ct='a';
	                f1=1;
	            }
	            else{
	                f1=0;
	                System.out.print("*");
	            }
	        }
	        System.out.println();
	    }
      }
}



/*

input: 4

output:

1*****1
*2***2*
**3*3**
***4***
**3*3**
*2***2*
1*****1

*/

import java.util.Scanner;
public class Main
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
        int val=1, flag=0;
       
        for(int i=0;i<(n+n-1);i++)
        {
            for(int j=0;j<(n+n-1);j++)
            {
                if(i==j || (n+n-1)-i-1==j)
                {
                    System.out.print(val);
                }
                else System.out.print("*"); 
            }
            
            if(flag==0) 
            {
                if(val==n-1) flag=1;
                val++;
            }else val--;
            System.out.println();
        } 
    }
}
