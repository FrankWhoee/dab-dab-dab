package javaapplication6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class JavaApplication6 {

    
    public static void main(String[] args) {
        ArrayList<String> dictionary = new ArrayList<String>();
        try{
            System.out.println("PATH: " + System.getProperty("user.dir") + "\\src\\javaapplication6\\words.txt");
            BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\src\\javaapplication6\\words.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println("ADDED: " + line);
               dictionary.add(line);
            }
        }catch (Exception e){
        }
        
        for(String word : dictionary){
            if(word.contains("dab")){
                try{
                    System.out.println(word.substring(0, word.indexOf("dab") - 4) + word.substring(word.indexOf("dab"),word.indexOf("dab") + 4).toUpperCase() + word.substring(word.indexOf("dab") + 3));
                }catch(Exception e){
                    System.out.println("[ERROR]: " + word);
                }
            }
        }
    }
    
}
