/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task3;

import java.security.NoSuchAlgorithmException;
import java.util.Scanner;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;

/**
 *
 * @author Haider
 */
public class Task3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws NoSuchAlgorithmException, NoSuchPaddingException {
     //   Cipher c = Cipher.getInstance("RSA/ECB/OAEPWithSHA-1AndMGF1Padding") ;
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
         String text,text1,text2;
         System.out.println(">Removing Unusuall Spaces");
         System.out.println("Input String: ");
         text=s.nextLine();
         System.out.println("");
         System.out.println(ridMultipleBlank(text));
         System.out.println("");
         System.out.println(">Removing Unusuall Integers");
         System.out.println("Input String: ");
         text1=s.nextLine();
         System.out.println("");
         System.out.println(removeInteger(text1));
         System.out.println(">Encrypting the String");
         System.out.println("Input String: ");
         text2=s.nextLine();
         System.out.print(stringEncryption(text2));
         
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
    /**
    * 
    * this function is used to remove all the integers from the string
    * @param s
    * @return Sting
    */
   public static String removeInteger(String s){
       String modString;
       modString = s.replaceAll("[0-9]","");
       return modString;
   }
   /**
    * 
    * this function will encrypt the given string using basic encryption scheme
    * @param s
    * @return 
    */
   public static String stringEncryption(String s){
       
       
   String encrypt="";
   for(int i=0;i<s.length();i++){
   if(i%2!=0){
   encrypt=encrypt+ (char)(s.charAt(i)+9);
   }
   else if(i%3!=0){
   encrypt=encrypt+(char) (s.charAt(i)-4);
   }    
   else{
   encrypt=encrypt +(char)(s.charAt(i)+12);
   }
   }
   
   return encrypt;
   }
   
        
   
}
