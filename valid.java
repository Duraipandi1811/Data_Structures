import java.util.Scanner;
public class valid
{
	public static void main(String[] args) 
	{
	    Scanner sc=new Scanner(System.in);
		System.out.println("Hello World");
		String s=sc.nextLine();
		boolean val=isValid(s);
		System.out.println(val);
	}
    public static boolean isValid(String s) 
    {
        boolean res;
        while(true)
        {
            if(s.contains("()"))
            {
                s=s.replace("()","");
            }
            else if(s.contains("[]"))
            {
               s=s.replace("[]","");
            }
            else if(s.contains("{}"))
            {
                s=s.replace("{}","");
            }
            else
            {
              res=s.isEmpty();
              return res;  
            }
        }
    }
}
