/*

N players(with jersey numbered from 1 to N) sat in a line to play a game. A number K is
randomly drawn out from a box. On each draw, the player at the position K is eliminated
from the game. Print the jersey number of the winner after N-1 draws.
Note: After each elimination, the positions are filled by the person next to it and hence
there is no gap between players after elimination.

Boundary Condition(s):
2 <= N <= 50

Input Format:
The first line contains the value of N.
The second line contain N values separated by space(s).
The third line contain N-1 values separated by space(s).

Output Format:
The first line contains the jersey number of the winner.
Example Input/Output 1:

Input:
6
100 200 300 400 500 600
1 4 2 3 1

Output:
400

*/

import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++) arr[i] = sc.nextInt();
        int ct=0;
        while(sc.hasNext())
        {
            int k = sc.nextInt()-1;
            arr[k]=0;
            ct++;
            for(int i=k;i<n;i++)
            {
                if(i<n-ct) arr[i] = arr[i+1];
                else arr[i]=0;
            }
            
            for(int i=0;i<n-ct;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
}
