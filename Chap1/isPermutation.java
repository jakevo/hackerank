/*
 *  Created By Jake Vo on 06/23
 *  How to run java file:
 *  On the command line:
 *      javac isPermutation.java
 *  Then:
 *      java isPermutation
 *  Quesiton: write a method to check if 2 strings are permutation
    of each other
 */

import java.util.*;

public class isPermutation {

  public static void main(String[] args) {

    String str1 = "abcd";

    String str2 = "acbd";

    boolean ret = isPer(str1, str2);

    if (ret) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }

  public static boolean isPer(String str1, String str2) {

    if (str1.length() != str2.length()) {
      return false;
    }

    int [] temp = new int[256];

    for (int i = 0; i < str1.length(); i++) {

      int x = str1.charAt(i);
      int y = str2.charAt(i);

      temp[x]++;
      temp[y]++;
    }

    for (int i = 0; i < temp.length; i++) {

      if (temp[i] % 2 != 0) {
        return false;
      }

    }
    return true;
  }


}
