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
