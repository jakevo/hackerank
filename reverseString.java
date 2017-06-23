/*
 *  Created By Jake Vo on 06/22
 *  How to run java file:
 *  On the command line:
 *      javac reverseString.java
 *  Then:
 *      java reverseString
 */

 /*
 Write code to reverse a String
 */

import java.util.*;

public class reverseString {

  public static void main(String[] args) {

    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a String: ");
    String input = reader.nextLine(); // Scans the next token of the input as a String.


    String result = reverse(input);

    System.out.println ("The result is " + result);
  }

  public static String reverse(String input) {

    //this problem is easy if we just print out the input in reverse order
    //input abcde -> edcba but we actually reverse the input here and send it back to
    // main function

    //convert the input string to char and put them in an array
    char [] temp = input.toCharArray();

    for (int i = 0; i < temp.length; i++) {

      int start = i;
      int end = temp.length - (i + 1);
      //create a temp character to swap the first character with the last
      //until they meet at the middle
      //example: abcde ->
      System.out.println("Start is " + start);
      System.out.println("End is " + end);
      char holder = 'x';

      if (end > start) {

        holder = temp[start];
        temp[start] = temp[end];
        temp[end] = holder;
      } else {
        break;
      }


    }

    return new String(temp);

  }


}
