import java.util.*;
public class MatrixBorderSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int sum=0;
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                int val = sc.nextInt();
                if(i==0 || i==r-1 )
                {
                    sum+=val;
                }
                else{
                    if(j==0 || j==c-1)
                    {
                        sum+=val;
                    }
                }
            }
        }
        System.out.print(sum);
	 }
}
