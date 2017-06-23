

/*
 *  Created By Jake Vo on 06/22
 *  How to run java file:
 *  On the command line:
 *      javac hasUniqueChar.java
 *  Then:
 *      java hasUniqueChar
 */

import java.util.*;

public class hasUniqueChar {

  public static void main(String[] args) {


    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a String: ");
    String input = reader.nextLine(); // Scans the next token of the input as a String.

    boolean result = isUniqueChar(input);

    if (result) {
      System.out.println(input + " is unique");
    } else {
      System.out.println(input + " is not unique");
    }
  }

  public static boolean isUniqueChar(String input) {

    //we asume that user input is unicode which means there are 256 characters
    //including uppercase and lowercase
    //if string length is more than 256 means that it s not unique
    if (input.length() > 256) {
      return false;
    }
    
    boolean [] temp = new boolean[256];

    for (int i = 0; i < input.length(); i++) {
      int x = input.charAt(i);

      //space = 32 in ascii code
      if (x != 32 && temp[x]) {
        return false;
      } else {
        temp[x] = true;
      }
    }
    return true;
  }
}
