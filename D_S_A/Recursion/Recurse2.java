class Main
{
    public static void Print1toN(int i,int n)
    {
        if(i<1)
        {
            return;
        }
        
        Print1toN(i-1,n);
        System.out.print(i+" ");
    }
    
	public static void main(String[] args) 
	{
	    Print1toN(5,5);  // n=5   --> 1 2 3 4 5
	}
}
