/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2_3;

/**
 *
 * @author MCALAB01004
 */
import java.util.*;
public class Onedimentionalarray {
    public static void main(String args[])
    {
     
        int a[]=new int[20];
        int n,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the limit");
        n=sc.nextInt();
        System.out.println("enter the array elements");
        for(i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(i=0;i<n;i++)
        {
        System.out.println(a[i]);
        }
    }
   
   
}

    
    

