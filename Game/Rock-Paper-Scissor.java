/*
Rock - Paper - Scissors Game

input: 3
    paper scissors
    paper paper
    scissors scissors

output: 2  (p1 - 0  and p2 - 1)  or (if both are equal - Tie)

*/
import java.util.*;
public class Main {

    public static int pri(String k)
    {
        int l = k.length();
        if(l==4)
        {
            return 1; // rock
        }
        else if(l==5)
        {
            return 2; // paper
        }
        else if(l==8)
        {
            return 3; // scissor
        }
        return 0;
    }
    public static void main(String[] args) 
    {
      Scanner sc = new Scanner(System.in);

      int n = sc.nextInt();
      int p1 = 0;
      int p2 = 0;
      while(n-->0)
      {
          String s1 = sc.next();
          String s2 = sc.next();
          int c1 = pri(s1);
          int c2 = pri(s2);

          if(c1==1)
          {
              if(c2==1);
              else if(c2==2) p2+=1;
              else if(c2==3) p1+=1;
          }
          else if(c1==2)
          {
              if(c2==1) p1+=1;
              else if(c2==2);
              else if(c2==3) p2+=1;
          }
          else if(c1==3)
          {
              if(c2==1) p2+=1;
              else if(c2==2) p1+=1;
              else if(c2==3);
          }
      }
		
        if(p1==p2) System.out.print("Tie");
        else if(p1>p2) System.out.print("1");
        else System.out.print("2");
	}
}
