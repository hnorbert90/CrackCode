package Examples;



public class DublicatedCharacters {
    
    public static boolean containsDublicatedChar(String word){
            int counter;
            for(int i=33;i<127;i++){
                counter=0;
                for(int j=0; j<word.length();j++){
                    if(word.charAt(j)==(char)i) counter++;
                        if(counter>1)
                            return true;  
                }
            }
            return false;
        }

}

