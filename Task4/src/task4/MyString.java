/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task4;

/**
 *
 * @author VENOM
 */
public class MyString {
    /**
     * this method will return all the integers from a string
     * @param s
     * @return String
     */
    public static String getInteger(String s){
    String integerStr="";
    for(int i=0;i<s.length();i++){
    if(s.charAt(i)>='0'&&s.charAt(i)<='9'){
    integerStr=integerStr+s.charAt(i);
    }
    }
    return integerStr;
    }
    
    /**
     * this function will return all punctuations and special characters in a string
     * @param s
     * @return String
     */
    public static String getPunctuation(String s){
    String punct="";
    for(int i=0;i<s.length();i++){
    if(s.charAt(i)>='a'&&s.charAt(i)<='z'||s.charAt(i)>='A'&&s.charAt(i)<='Z'||s.charAt(i)>='0'&&s.charAt(i)<='9'){}
    else{
    punct=punct+s.charAt(i);
    }
    }
    return punct;
    }
    
    /**
     * this method will return the ASCII code of input String 
     * @param s
     * @return String
     */
    public static String getAscii(String s){
    String asciStr="";
    int j=0;
    for(int i=0;i<s.length();i++){
        j= s.charAt(i);
    asciStr=asciStr+j;
    }
    return asciStr;
    }
    
    
    /**
     * this function will check for String if it is Palindrome
     * @param s
     * @return Boolean
     */
    public static boolean isPalindrome(String s){
    String rStr="";
    boolean flag;
    for(int i=s.lastIndexOf(s);i>=0;i--){
    rStr=rStr+s.charAt(i);
    }
    if(s.equalsIgnoreCase(rStr)){
    flag=true;
    }
    else{
    flag=false;
    }
    return flag;
    }
    /**
     * this method will return the string after reversing it
     * @param s
     * @return String
     */
    public static String getReverse(String s)
    {
    String reversStr="";
    for(int i=s.lastIndexOf(s);i>=0;i--){
    reversStr=reversStr+s.charAt(i);
    }
    return reversStr;
    }
}
