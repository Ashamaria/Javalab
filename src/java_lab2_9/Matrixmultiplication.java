/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2_9;

/**
 *
 * @author MCALAB01004
 */
import java.util.*;

public class Matrixmultiplication {
  public static void main(String args[])
       {
       
        int a[][]= new int[10][10];
        int b[][]= new int[10][10];
        int c[][]= new int[20][20];
        int i,j,n,m,p,q,k;
       
        Scanner Sc=new Scanner(System.in);
       
        System.out.println("enter the row size");
        n=Sc.nextInt();
        System.out.println("enter the col size");
        m=Sc.nextInt();
        System.out.println("enter the array elements");
       
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=Sc.nextInt();
            }
        }
       
        System.out.println("enter the row size");
        p=Sc.nextInt();
        System.out.println("enter the col size");
        q=Sc.nextInt();
        System.out.println("enter the array elements");
       
         for(i=0;i<p;i++)
          {
            for(j=0;j<q;j++)
            {
                b[i][j]=Sc.nextInt();
            }
         }
         if(n!=q)
        {
            System.out.println("not possible");
        }
        else
        {
        System.out.println("After multiplication");
       
         for(i=0;i<n;i++)
         {
            for(j=0;j<q;j++)
            {
                c[i][j]=0;
                for(k=0;k<m;k++)
                {
                c[i][j]=a[i][k]+b[k][j];
               
                }
            }
            //System.out.println();
           
           
         }
         for(i=0;i<n;i++)
         {
             for(j=0;j<q;j++)
             {
                 System.out.print("\t"+c[i][j]);
             
             }
             System.out.println();
         }
       }
   }
   }
   

