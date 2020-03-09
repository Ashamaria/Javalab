/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab_10;

/**
 *
 * @author MCALAB01004
 */

import java.util.*;
public class Negative {
    public static void main(String args[])
    {
        Scanner Sc = new Scanner(System.in);
        try
        {
         int x = Sc.nextInt();
         int a[] = { 2,3,5};
         System.out.println(a[x]);
         int x1 = Sc.nextInt();
         int a1[] = new int[x1]; 
                 
                 }
        catch(NegativeArraySizeException ex)
        {
           System.out.println(ex.getMessage()); 
        }
        
    }
}
