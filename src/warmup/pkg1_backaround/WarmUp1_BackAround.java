package warmup.pkg1_backaround;

import java.util.Scanner;


public class WarmUp1_BackAround {

    public static void main(String[] args) {
        System.out.println(backAround("cat"));
        backAround("Hello");
        backAround("a");
        backAround("chris");
    }
    
//    public static void backAround(){
//        Scanner sc = new Scanner(System.in);
//        String word = sc.nextLine();
//        String newWord = (word.charAt(word.length()-1) 
//                + word 
//                + (word.charAt(word.length()-1)));   
//        System.out.println(newWord);
//    }
    
    public static String backAround(String str){
       str = (str.charAt(str.length()-1)
                      +str
                      +(str.charAt(str.length()-1)));
       
       return str;
    }
    
}
