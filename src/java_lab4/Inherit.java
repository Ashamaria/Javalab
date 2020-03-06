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
public class Inherit {
   class Ain
{
    int r;
    double a;
 
   
    void area( int r)
    {
        this.r=r;
        a=3.14*r*r;
        System.out.println("area of circle:"+a);
       
       
    }

}
 class Bin extends Ain
{
    int h;
    void volume(int r,int h)
    {
        this.r=r;
       
        double volume=(3.14*r*r*h);
        System.out.println("volume of the cylinder is:"+volume);
    }
   
}
   public class Inherit extends Bin
    {
        public static void main(String args[])
        {
            int r,h;
            Scanner s=new Scanner(System.in);
            System.out.println("enter radius");
             r=s.nextInt();
            System.out.println("enter height");
             h=s.nextInt();
          
            Inherit I=new Inherit();
            I.area(r);
            I.volume(h,r);
        }
       
    }
  
}
