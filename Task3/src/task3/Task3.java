/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.util.Scanner;

/**
 *
 * @author Haider
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
         String text;
         System.out.println(">Removing Unusuall Spaces");
         System.out.println("Input String: ");
         text=s.nextLine();
         System.out.println("");
         System.out.println(ridMultipleBlank(text));
    }
     /**
    * 
    * this function is used to remove all the additional spaces and replace them with single space 
    * @param s
    * @return Sting
    */
   public static String ridMultipleBlank(String s){
       String str = s.trim().replaceAll(" +", " ");
       return str;
   }
}