
package Examples;

import static Examples.DublicatedCharacters.containsDublicatedChar;


public class Main {

    public static void main(String[] args) {
        
        //1.1 Implement an algorithm to determine if a string has all unique characters.
        //What if you can not use additional data structures?
        System.out.println("1.1;");
        System.out.println("tesTword has duplicated characters? : "+containsDublicatedChar("tesTword"));
        System.out.println("testword has duplicated characters? : "+containsDublicatedChar("testword"));
        //1.2 Write code to reverse a C-Style String. 
        //(C-String means that “abcd” is represented as five characters, including the null character.)
        System.out.println("1.2;");
        System.out.println("Reverse word reversed:"+reverseWord.reverseString("Reverse"));
        
    }
    
}
