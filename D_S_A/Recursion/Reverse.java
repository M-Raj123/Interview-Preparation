class Reverse
{
    public static int recurse(char[] arr, int low, int high) 
    {
        if(low>high)
        {
            return 0;
        }
        
        char temp = arr[low];
        arr[low] = arr[high];
        arr[high]= temp;
        
       return recurse(arr, low+1, high-1);
    }
    public static void main(String[] args) 
    {
      
        char[] arr = {'w','e','l','c','o','m','e'};
      
        int i = 0 , j = arr.length-1 ; 
      
        recurse( arr , i , j );
        
        for(char k:arr) System.out.print(k+" ");  // output -- e m o c l e w 

    }
}
