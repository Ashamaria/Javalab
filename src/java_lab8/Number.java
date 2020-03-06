/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab8;

/**
 *
 * @author MCALAB01004
 */
import java.util.*;
    public class Number {
    double a;
    Number()
    {
        a=300.5d;
        System.out.println("Inside the Number()");
        System.out.println("value of a = "+a);
    }
    boolean isZero()
    {
        System.out.println("a is ZERO ?");
        return a==0;
       
    }
    boolean isPositive()
    {
        System.out.println("a is POSITIVE NUMBER ?");
        return a>=0;
    }
    boolean isNegative()
    {
        System.out.println("a is NEGATIVE NUMBER ?");
        return a<0;
    }
    boolean isOdd()
    {
        System.out.println("a is an ODD number?");
        return a%2!=0;
    }
    boolean isEven()
    {
        System.out.println("a is an EVEN number ?");
        return a%2==0;
    }
    boolean isPrime()
    {
        int p=0;
        System.out.println("a is a PRIME number?");
        int i;
        for(i=1;i<=a;i++)
        {
           if(a%i==0)
           {
                p++;
           }
        }
        return p==2;
       
    }
    boolean isArmstrong()
    {
       int r=0,s=0;
       double t=a;
       while(t!=0)
       {
            t=t%10;
            s=s+r*r*r;
            t=t/10;
       }
        return s==a;
       
    }
    double getFactorial()
    {
        int i=0;
        double fact=0;
        System.out.println("Factorial");
        for(i=0;i<a;i++)
        {
            fact=fact*i;
        }
        return fact;
    }
       
    double getSqr()
    {
        System.out.println("square");
        double d;
        d=a*a;
        return d;
    }
    double sumDigits()
    {
        double m;
        double sum=0;
        System.out.println("sum of digits");
        while(a>0)
        {
            m=a%10;
            sum= sum+m;
            a=a/10;
        }
        return sum;
    }
    double getReverse()
    {
        double rev=0;
        double t=a;
        while (a>0)
        {
            rev=rev*10;
            rev=t%10;
            t=t/10;
        }
        return rev;
    }
    void dispBinary()
    {
       
    }
    void listFactor()
    {
       
    }
    public static void main(String a[])
    {
        Number N=new Number();
        System.out.println(N.isZero());
         System.out.println(N.isNegative());
         System.out.println(N.isPositive());
         System.out.println(N.isOdd());
         System.out.println(N.isEven());
         System.out.println(N.isPrime());
         System.out.println(N.isArmstrong());
         System.out.println(N.getFactorial());
         System.out.println(N.getReverse());
         System.out.println(N.sumDigits());
         System.out.println(N.getSqr());
       
       
       
    }
   
}

}
