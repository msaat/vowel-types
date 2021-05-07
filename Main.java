import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.*;

class Main {
  public static void main(String[] args) {
    
    while (true){
    Scanner myObj = new Scanner(System.in); 
    System.out.println("input a word or enter 'exit' to quit:");
    String inputtedWord = myObj.nextLine();
    // the program runs unless "exit" is entered
    if (inputtedWord.equals("exit")){
      break;
     }
    // if a word is entered, the function vowelType() is called on it
    else {
      String result = vowelType(inputtedWord); 
      System.out.println(result);
     }
    }
  }

// the function vowelType() determines whether a word
//    has only back vowels, only front vowels, both, or neither
  public static String vowelType(String m){
    // these counters will keep track of the number of
    //   back and front vowels per word, respectively
    int backCounter = 0;
    int frontCounter = 0;

    for (int i = 0; i < m.length(); i++){
      // checking if the letter at index i is a back vowel
      if((m.charAt(i) == 'a') || (m.charAt(i) == 'o') || (m.charAt(i) == 'u') || (m.charAt(i) == 'ı')){
         backCounter++;
       }
       // checking if the letter at index i is a front vowel
       else if((m.charAt(i) == 'ü') || (m.charAt(i) == 'ö') || (m.charAt(i) == 'e') || (m.charAt(i) == 'i')){
         frontCounter++;
       }
    }
    
    // outputs will communicate the result of the function
    //   with the user
    if ((backCounter > 0) && (frontCounter > 0)){
      return "the word has both front and back vowels\n";
    }
    else if (backCounter > 0) {
      return "the word has only back vowels\n";
    }
    else if (frontCounter > 0) {
      return "the word has only front vowels\n";
    }
    else{
      return "the inputted word has no vowels\n";
    } 
    
  }
  
}