
import java.util.*;
public class Amstrong
{
    public static void main(String args[])
    {
        int n,temp,sum=0,rev;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a 3 digit number");
        n=obj.nextInt();
        temp=n;
        while(n!=0)
        {
            rev=n%10;
            sum=sum+(rev*rev*rev);
            n=n/10;
        }
        if(temp==sum)
        {
            System.out.println("The number is Armstrong");
        }
        else
        {
            System.out.println("The number is not Armstrong");
        }
    }
    
}
