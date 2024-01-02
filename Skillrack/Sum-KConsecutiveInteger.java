/*
Sum - K Consecutive Integer

input : 
7
10 20 5 2 -5 66 -69
3

output :
35 27 2 63 -8

*/
import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        int k = sc.nextInt();
        int arr[] = new int[k];
        for(int i=0;i<k;i++)
        {
            arr[i] = sc.nextInt();
        }
        int windowsize = sc.nextInt();
        
        int sum = 0;
        
        for(int i=0;i<windowsize;i++)
        {
            sum += arr[i];
            
        }
        System.out.println("sum "+sum);
        for(int i=windowsize;i<k;i++)
        {
            sum= sum + arr[i] - arr[i-windowsize];
            System.out.println("sum "+sum);
        }
        
	}
}
