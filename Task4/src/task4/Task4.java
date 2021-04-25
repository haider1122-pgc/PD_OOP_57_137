/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

import java.util.Scanner;
import static task4.MyString.*;

/**
 *
 * @author VENOM
 */
public class Task4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String text;
        Scanner s = new Scanner(System.in);
         System.out.println(">Get Integer");
         System.out.println("Input String: ");
         text=s.nextLine();
         System.out.println(getInteger(text));
         System.out.println(">Get Symbols and punctuation");
         System.out.println("Input String: ");
         text=s.nextLine();
         System.out.println(getPunctuation(text));
         System.out.println(">Get ASCII");
         System.out.println("Input String: ");
         text=s.nextLine();
         System.out.println(getAscii(text));
         System.out.println(">Check Palindrome");
         System.out.println("Input String: ");
         text=s.nextLine();
         if(isPalindrome(text)){
         System.out.println("Given String is Palindtrome");
         }
         else{
         System.out.println("Given String is not Palindtrome");
         }

         System.out.println(">Reverse String");
         System.out.println("Input String: ");
         text=s.nextLine();
         System.out.println(getReverse(text));
    }
    
    
}
