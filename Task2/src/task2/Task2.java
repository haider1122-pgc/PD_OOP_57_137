/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task2;

import java.util.Scanner;

/**
 *
 * @author Haider
 */
public class Task2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner s = new Scanner(System.in);
         String text;
         System.out.println("Please Enter a Sentence:");
         text=s.nextLine();
         System.out.println("Your Sentence Printed Vertically is:");
        displayVertical(text);
    }
    /**
     * task 2 function
     * this function is used to print a string vertically
     * @param s 
     */
   public static void displayVertical(String s){
       int size=s.length();
       char[] str=new char[size];
       int j=0;
       for(int n=0;n<size;n++){
           if(s.charAt(n)!= ' '){
            str[j]=s.charAt(n);
            j++;
           }
       }
       
       for(int i=0;i<size;i++){
           System.out.println(str[i]);
       }
   }
}
