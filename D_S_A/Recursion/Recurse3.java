class Main
{
    public static void Print(int i,int n)
    {
        if(i>n)
        {
            return;
        }
        
        Print(i+1,n);
        System.out.print(i+" ");
    }
    
	public static void main(String[] args) 
	{
	    Print(1,5); // n=5   --> 5 4 3 2 1
	}
}
