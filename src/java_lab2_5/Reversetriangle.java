/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2_5;

/**
 *
 * @author MCALAB01004
 */import java.util.*;
public class Reversetriangle {
   public static void main(String args[])
        {
                int i,j,n;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the limit");
            n=sc.nextInt();
            System.out.println("Reverse triangle is:");
            for(i=n;i>=0;i--)
            {
                System.out.println(n);
                if(i==0)
                {
                    break;

                }
                for(j=i-1;j<n;j++)
                {
                    System.out.print(j);
                    System.out.print("");
                }
               
            }
        }  
}
