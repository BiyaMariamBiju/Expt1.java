import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args) 
    {
        int n,i,fact=1;
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter number");
        n=obj.nextInt();
        for(i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial is:"+fact);
    }
    
}
