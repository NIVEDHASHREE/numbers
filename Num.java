/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package num;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Num {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        if(n>0)
        System.out.println("the number is positive");
        else if(n<0)
            System.out.println("the number is negative");
        else
            System.out.println("the number is zero");
}
}
