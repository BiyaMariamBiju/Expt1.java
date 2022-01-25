import java.util.Scanner;
public class Palindrome
{
    public static void main(String args[])
    {
    int n,r,temp,rev=0;
    Scanner obj=new Scanner(System.in);
    System.out.println("Enter number");
    n=obj.nextInt();
    temp=n;
    while(n!=0)
    {
        r=n%10;
        rev=(rev*10)+r;
        n=n/10;
    }
    if(temp==rev)
    {
        System.out.println("The number is Palindrome");
    }
    else
    {
        System.out.println("The number is not Palindrome");
    }
 } 
}
