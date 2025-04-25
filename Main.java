import java.util.*;
import java.util.Stack;

public class Main
{
    public static void closetSmallest(int arr[])
    {
        for(int i=0; i<arr.length; i++)
        {
            int val=-1;
            for(int j=i-1; j>=0; j--)
            {
                if(arr[j]<arr[i])
                {
                    val=arr[j];
                    break;
                } 
            }
            System.out.print(val+" ");
        }
    }
    public static void efficentclosetsmallest(int arr[])
    {
        Stack<Integer> stack=new Stack<>();
        for(int i=0; i<arr.length; i++)
        {
            while(!stack.isEmpty() && stack.peek()>=arr[i])
            {
                stack.pop();
            }
            if(stack.isEmpty())
            {
                System.out.print("-1 ");
            }
            else{
                System.out.print(stack.peek()+" ");
            }
            stack.push(arr[i]);
        }
        System.out.println();
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
	    closetSmallest(arr);
	    System.out.println("Efficent Way");
	    efficentclosetsmallest(arr);
	    
	}
}
