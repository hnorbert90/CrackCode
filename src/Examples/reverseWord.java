/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author Norbi
 */
public class reverseWord {
    
    public static String reverseString(String word){
        
        String revString="";
        for(int i = word.length()-1 ; i >= 0 ; i--) revString+=word.charAt(i);
        
        return revString;
    }
}
