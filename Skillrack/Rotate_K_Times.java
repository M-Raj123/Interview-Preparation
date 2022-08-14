/*
Rotation K times

input: 5
       1 2 3 4 5 
       2
       
output:
       4 5 1 2 3
*/
import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int[] arr = new int[n];
      for(int i=0;i<n;i++) arr[i] = sc.nextInt();
      int k = sc.nextInt();
      int rev = n - (k%n);

      int ct=0;
      while(ct<n)
      {
          if(rev==n) rev=0;
          System.out.print(arr[rev++]+" ");
          ct++;
      }
	  }
}
