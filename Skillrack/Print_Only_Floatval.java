/*
input: This is 34 and is the double value 34.56
output: 34.56  
        explanation : only print the double value
*/
import java.util.*;
public class Main {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String k = sc.nextLine();
		int flag=0;
		String temp = "";
		for(int i=0;i<k.length();i++)
		{
		    char ch = k.charAt(i);
		    if( (ch>='0' && ch<='9') || ch=='.' )
		    {
		        if(ch=='.') flag=1;
		        temp+=ch;
		        
		    }
		    else
		    {
		        if(flag==1)
		        {
		            System.out.println(temp);
		            temp="";
		            flag=0;
		        }
		        else{
		            temp="";
		        }
		    }
		}
		
		if(flag==1) System.out.print(temp);
		
	}
}
