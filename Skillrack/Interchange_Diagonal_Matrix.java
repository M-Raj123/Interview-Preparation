/*

input: 3
       5 1 6
       4 2 9
       8 7 3

output:
       6 1 5
       4 2 9 
       3 7 8

*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++) arr[i][j] = sc.nextInt();
        }
       
        for(int i=0;i<n;i++)
        {
                int temp = arr[i][i];
                arr[i][i] = arr[i][n-i-1];
                arr[i][n-i-1] = temp;
        }
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
	}
}
