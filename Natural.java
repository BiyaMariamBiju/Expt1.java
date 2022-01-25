import java.util.Scanner;

public class Natural 
{
    public static void main(String args[])
    {
        int n,i,sum=0;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter number");
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            sum=sum+i;
        }
        System.out.println("Result="+sum);
    }
    
}
