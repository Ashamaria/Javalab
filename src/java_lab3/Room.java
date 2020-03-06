/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab3;

/**
 *
 * @author MCALAB01004
 */
import java.util.*;
public class Room {
   int room_no;
   String room_type;
   float room_area;
   int ac_machine;
   void setdata()
   {  
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the room no");
    room_no=sc.nextInt();
    System.out.println("enter the room type");
    room_type=sc.next();
    System.out.println("enter the room area");
    room_area=sc.nextFloat();
    System.out.println("enter 1 or 0 for ac/non-ac");
    ac_machine=sc.nextInt();
   }
   void displaydata()
   {
    System.out.println("room_no="+room_no);
    System.out.println("room_type="+room_type);
    System.out.println("room_area="+room_area);
    if(ac_machine==1)
    {
    System.out.println("ac room");
    }
    else
    System.out.println(" non-ac room");
   }
   public static void main(String args[])
   {
    Room R=new Room();
    R.setdata();
    R.displaydata();
   }
}  

