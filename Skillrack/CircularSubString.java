/*
circular Substring

input : important 2 4
output: por 

*/

class CircularSubstring
{
    public static void main(String[] args)
    {   
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int x1 = sc.nextInt(),x2=sc.nextInt();
        while(true)
        {
            if(x1==l) x1=0;
            System.out.print(k.charAt(x1++));            
            if(x1-1==x2) break;
        }   
    }
}
