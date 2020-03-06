/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_lab2;

/**
 *
 * @author MCALAB01004
 */
public class While {
    public static void main(String args[])
    {
        int i =2;
        while(i<=10)
        {
            if(i%2 == 0)
            {
              System.out.println(i + " is divisible by 2");
            }
            if(i%5 == 0)
            {
                System.out.println(i + " is divisible by 5");
            }
            i = i + 1;
        
    

            }
    }
}
