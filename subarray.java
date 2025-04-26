public class subarray
{
	public static void main(String[] args) 
	{
	    int arr[]={1,2,3};
	    int n=arr.length;
	    printsubarr(arr,n);
	    
	}
	public static void printsubarr(int arr[],int n)
	{
	    for(int i=1; i<=n; i++)
	    {
	        for(int j=0; j<=n-i; j++)
	        {
	            for(int k=j; k<j+i; k++)
	            {
	                System.out.print(arr[k]+" ");
	            }
	            System.out.println();
	        }
	    }
	}
}
