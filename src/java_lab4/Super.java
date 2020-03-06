/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab4;

/**
 *
 * @author MCALAB01004
 */
import java.util.*;
public class Super {
   
    int l,b;
    void read()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("enter the length");
        l=s.nextInt();
        System.out.println("enter the breadth");
        b=s.nextInt();
    }
    void area()
    {
        System.out.println(l*b);
    }
    
}
class Box extends Super
{
    int h;
    @Override
    void read()
    {
        Scanner s=new Scanner(System.in);
        super.read();
        System.out.println("enter the height");
        h=s.nextInt();
    }
    void volume()
    {   
        System.out.println("volume is");
        System.out.println(l*b*h);
    }
    public static void main(String args[])
    {
        Box b=new Box();
        b.read();
        b.volume();
    }
}

