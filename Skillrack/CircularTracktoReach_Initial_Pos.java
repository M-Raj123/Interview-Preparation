/*

A circular track has N positions numbered from 1 to N. The initial position I of the player
and an integer M are given as the input. The player jumps M positions per move. The
program must print the minimum number of moves required to reach the initial position
again.
Boundary Condition(s):
1 <= N <= 1000
1 <= I <= N
1 <= M <= 1000
Input Format:
The first line contains the value of N, I and M.
Output Format:
The first line contains the number of moves.
Example 

Input:
  1) 10 2 5
  2) 70 15 12
Output:
  1) 2
  2) 35


*/


import java.util.*;
public class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int cir = sc.nextInt();
        int init = sc.nextInt();
        int jump  = sc.nextInt();
        int k=init,count=0;
        if(init==cir && init==jump) System.out.print(1);
        else{
        do{
            k+=jump;
            if(k>=cir)
            {
                k=k%cir;
            }
            count+=1;
        }
        while(init!=k);
          System.out.print("count:"+count);
        }
	  }
}
