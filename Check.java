import java.io.*;

import java.util.*;
class Check
{
    public static void main(String args[])
    {
        int a,b;
        System.out.println("Enter number");
        Scanner obj=new Scanner(System.in);
        a=obj.nextInt();
        b=a%2;
        if(b==0)
        {
           System.out.println("Number is even"); 
        }
        else
        {
           System.out.println("Number is odd");  
        }
    }
}