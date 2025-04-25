import java.util.*;
public class Stack
{
    public static void stackSpan(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int span=1;
            for(int j=i-1; j>=0; j--)
            {
                if(arr[j]<arr[i])
                {
                    span++;
                }
                
            }
            System.out.print(span+" ");
        }
    }
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter the array size: ");
	    int n=sc.nextInt();
	    System.out.println("Enter the values: ");
	    int arr[]=new int[n];
	    for(int i=0; i<n;i++)
	    {
	        arr[i]=sc.nextInt();
	    }
	    stackSpan(arr);
	    
	}
}
