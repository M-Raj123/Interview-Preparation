class GridTraveler
{
    public static int path(int m,int n)
    {
        if(m==0 || n==0)    return 0;
        if(m==1 && n==1)    return 1;
        
        return path(m-1,n)+path(m,n-1);
    }
    
	public static void main(String[] args) 
	{
	     System.out.println(path(1,1)); // 1
	     System.out.println(path(4,4)); // 20
	     System.out.println(path(2,3)); // 3
	     System.out.println(path(3,2)); // 3
	}
}
