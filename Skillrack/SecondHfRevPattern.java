/* 

Second half Reverse Pattern

input  : 6
output :
1 2 3 6 5 4
* 1 2 4 3 
* * 1 2

*/

import java.util.Scanner;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt(), dup=k;
        for(int i=0; i<k/2; i++)
        {
            for(int s=0;s<i;s++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=dup/2;j++)
            {
                System.out.print(j);
            }
            for(int l=dup;l>dup/2;l--)
            {
                System.out.print(l);
            }
            dup = dup-2;
            System.out.println();
        }
    }
}
