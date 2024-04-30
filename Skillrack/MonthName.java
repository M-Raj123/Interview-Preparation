/* 

Valid Month Name

input  : 10-04-2002 , 21-02-2001
output : April      , February

*/

import java.util.*;
public class Hello 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String arr[] = str.split("-");
      
        // System.out.println(Arrays.toString(arr));
        
        int flag = 0;
        if(arr[0].length()==2) flag+=1;
        
        if(arr[1].length()==2) flag+=1;
        
        if(arr[2].length()==4) flag+=1;
        
        int month = Integer.parseInt(arr[1]);
        
        if(flag==3) 
        {
            switch(month)
            {
                case 1: System.out.print("January");
                        break;
                case 2: System.out.print("February");
                        break;
                case 3: System.out.print("March");
                        break;
                case 4: System.out.print("April");
                        break;
                case 5: System.out.print("May");
                        break;
                case 6: System.out.print("June");
                        break;
                case 7: System.out.print("July");
                        break;
                case 8: System.out.print("August");
                        break;
                case 9: System.out.print("September");
                        break;
                case 10: System.out.print("October");
                        break;
                case 11: System.out.print("November");
                        break;
                case 12: System.out.print("December");
                        break;
            }
        }       
	  }
}
