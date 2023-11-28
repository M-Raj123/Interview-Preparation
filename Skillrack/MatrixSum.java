/*

Matrix Sum - Bottom Right Quadrant

*/

import java.util.*;
public class Hello {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c =sc.nextInt();
        int arr[][] = new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum =0;
        for(int i=r/2;i<r;i++)
        {
            for(int j=c/2;j<c;j++)
            {
                sum+=arr[i][j];
            }
        }
        System.out.print(sum);
	  }
}
