/*

Nearest multiple of 10 

input:  551    999999
output: 550    1000000

*/
import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int k = n%10;
        int v1 = 10 - k;
        int v2 = k - 0;
        if(v1>=v2) 
        {
            System.out.print(n-v2);
        }
        else System.out.print(n+v1);
        
        
	  }
}
