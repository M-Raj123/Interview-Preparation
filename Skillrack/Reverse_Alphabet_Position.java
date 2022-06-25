/*
Reverse alphabet position;

input : abc , Yarn
ouptut: zyx , Bzim

*/
import java.util.*;
public class Main 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String k = sc.next();
        for(int i=0;i<k.length();i++)
        {
            char ch = k.charAt(i);
            if(ch>='a' && ch<='z')
            {
                int k1 = 26 - (ch - 'a');
                System.out.print((char)(96+k1));
            }
            else{
                int k2 = 26 - (ch-'A');
                System.out.print((char)(64+k2));
            }
        }
	  }
}
