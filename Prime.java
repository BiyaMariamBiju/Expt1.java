import java.util.*;

public class Prime 
{
    public static void main(String args[]) 
    {
        int n,i,flag=0;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        n=obj.nextInt();
        for(i=2;i<=n/2;i++)
        {
           if(n%i==0)
           {
               flag=1;
               break;
           }
        }
        if(flag==1)
        {
            System.out.println("Number is not prime");
        }
        else
        {
            System.out.println("Number is prime");
        }
        
    }
    
}
