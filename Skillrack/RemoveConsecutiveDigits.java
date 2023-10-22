/*

Remove Consecutive ODD/EVEN digits

Input  : 23455264 , 124437 
Output : 23455    , 1244

*/


import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        if(n%2==0)
        {
            flag=1;
        }
        else flag=0;
        
        int k = flag ;
        while(k==flag)
        {
            
            if(flag==1 && n%2==0)
            {
                n = n/10;
                if(n%2!=0) k=0;
            }
            else if( flag==0 && n%2!=0)
            {
                n = n/10;
                if(n%2==0) k=1;
            }      
        
        }
        
        System.out.print(n);
	  }
}
