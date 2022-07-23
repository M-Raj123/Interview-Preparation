/*
--input : 
4
--output:
4444444
4333334
4322234
4321234
4322234
4333334
4444444
*/
public class Box_pattern {
    public static void main(String[] args) {
        int n = 4;
        int rs = 0 , re = n+n-1 , cs = 0 , ce = n+n-1;
        int k = n+n-1;
    
        for(int i=0;i<k;i++)
        {
            int val = n;
            for(int j=0;j<k;j++)
            {
                System.out.print(val);
                if( j>=cs && j<ce-1 )
                {
                // 
                }  
                else if(j<cs){
                    val--;
                }
                else if(j>=ce-1){
                    val++;
                }                
            }

            if(i<n-1)
            {
                cs++;
                ce--;
            }
            else{
                cs--;
                ce+=1;
            }
            System.out.println();
        }
    }
}
