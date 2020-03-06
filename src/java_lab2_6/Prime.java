/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2_6;

/**
 *
 * @author MCALAB01004
 */
import java.util.*;
public class Prime {
   public static void main(String a[])
   {
     
       {
           int n,i=1,p=0;
           Scanner s=new Scanner(System.in);
           System.out.println("enter a number");
           n=s.nextInt();
           while(i<=n)
           {
               if(n%i==0)
               {
               p++;
               }
               i++;
           }
        if(p==2)
        {
            System.out.println("prime number");
           
        }
        else
        {
            System.out.println("not pime");
        }
       }
}  
}
