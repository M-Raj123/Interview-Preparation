class Main
{
    public static void PrintNto1(int n)
    {
        if(n<1)
        {
            return;
        }
        System.out.print(n+" ");
        PrintNto1(n-1);
    }
    
	public static void main(String[] args) 
	{
	    PrintNto1(5); // n=5   --> 5 4 3 2 1
	}
}
