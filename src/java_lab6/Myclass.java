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
 interface  A
{
  void meth1();
  void meth2();
}

class Myclass implements A
{
    @Override
    public void meth1()
            {
              System.out.println("java");
            }
    @Override
    public void meth2()
    {
        System.out.println("programming");
    }


public static void main(String args[])
{
 Myclass M = new Myclass();
 M.meth1();
 M.meth2();
    
}
}
