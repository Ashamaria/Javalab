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
interface Test
{
    void square();
}
class Arithmetic implements Test
{
   @Override
   public void square()
    { 
      int a;
       a = 0;
      Scanner Sc = new Scanner(System.in);
      System.out.println("Enter the value of a");
       a = Sc.nextInt();
      System.out.println("square of a = " + a*a); 
    }

public static void main(String args[])
{
  Test T = new Arithmetic();
  T.square();
    
}
}