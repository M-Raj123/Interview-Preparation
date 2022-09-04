class Main
{
    public static void Print1toN(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        System.out.print(i+" ");
        Print1toN(i+1,n);
    }
    
	public static void main(String[] args) 
	{
	    Print1toN(1,5); // n=5   --> 1 2 3 4 5
	}
}
