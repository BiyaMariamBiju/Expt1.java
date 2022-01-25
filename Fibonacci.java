import java.util.*;

public class Fibonacci 
{
    public static void main(String args[]) 
    {
        int i,n,t1=0,t2=1;
        int nextterm=t1+t2;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter the  number of terms");
        n=obj.nextInt();
        System.out.println("Fibonacci Series:\n"+t1+"\n"+t2);
        for(i=3;i<=n;i++)
        {
            System.out.println(nextterm);
            t1=t2;
            t2=nextterm;
            nextterm=t1+t2;
        }
 
    }
    
}
