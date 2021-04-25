/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task1;

import java.util.Scanner;

/**
 *
 * @author Haider
 */
public class Task1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner in = new Scanner(System.in);
        int words, vowel, punctuation;

        System.out.println("Enter the String:");
        String text = in.nextLine();
        words = wordCounter(text);
        vowel = vowelcounter(text);
        punctuation = puncCount(text);
        System.out.println("Number of Words        : " + words);
        System.out.println("Number of Vowels       : " + vowel);
        System.out.println("Number of Punctuations : " + punctuation);
        boolean x = findSubString(text);
        if (x == true) {
            System.out.println("\"the\" is a part of String");
        } else {
            System.out.println("\"the\" is not a part of String");
        }
        
    }
 /**
     * This function is used to count number of words in a string
     *
     * @param s
     * @return integer
     */
    public static int wordCounter(String s) {

        int count = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == ' ') {
                count = count + 1;
            } else {
            }
        }
        if (!(s.equals(" "))) {
            return ++count;
        } else {
            return 0;
        }

    }

    /**
     * This function is used to count number of vowels in a string
     *
     * @param s
     * @return integer
     */
    public static int vowelcounter(String s) {
        int count = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'A' || s.charAt(i) == 'e' || s.charAt(i) == 'E' || s.charAt(i) == 'i' || s.charAt(i) == 'I' || s.charAt(i) == 'o' || s.charAt(i) == 'O' || s.charAt(i) == 'u' || s.charAt(i) == 'U') {
                count = count + 1;
            } 
        }
        return count;
    }
    /**
     * this function is used to count no of punctuation marks in string
     * @param s
     * @return integer
     */
    public static int puncCount(String s) {
        int count = 0;
        int size = s.length();
        for (int i = 0; i < size; i++) {
            if (s.charAt(i) == '.' || s.charAt(i) == '!' || s.charAt(i) == '\"' || s.charAt(i) == '?' || s.charAt(i) == ';' || s.charAt(i) == ',' || s.charAt(i) == '\'') {
                count = count + 1;
            } 
        }
        return count;
    }
    
    public static boolean findSubString(String s){
        int size=s.length();
        for(int i=0;i<size;i++){
            if(s.charAt(i)=='t'){
                if(s.charAt(i+1)=='h'){
                    if(s.charAt(i+2)=='e'){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}

