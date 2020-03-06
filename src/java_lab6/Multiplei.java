/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab6;

/**
 *
 * @author MCALAB01004
 */
import java.util.*;
interface B
{
   
    void read();
    void display();
}

class Multiplei implements B
{
    @Override
    public void read()
    {   
        Scanner Sc = new Scanner(System.in);
         System.out.println("enter the value of a");
         int a;
        a = Sc.nextInt();
         System.out.println("enter the value of b");
         int b;
        b = Sc.nextInt();
    }
    @Override
    public void display()
    {  int a = 1 ;
        
        System.out.println(a );
       int b = 1;
      
        
        System.out.println(b ); 
         
    }


public static void main(String args[])
{
    Multiplei M = new Multiplei();
    M.read();
    M.display();
}
}
