import java.util.*;
class sum
{
    public static void main(String args[])
    {
        int a,b,sum;
        System.out.println("Enter two numberts:\n");
        Scanner obj = new Scanner(System.in);
        a=obj.nextInt();
        b=obj.nextInt();
        sum=a+b;
        System.out.println("Result="+sum);
    }
}