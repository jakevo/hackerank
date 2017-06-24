import java.util.*;

public class replaceWithChars {

  public static void main(String[] args) {

    //relace space with %20

    Scanner reader = new Scanner(System.in);  // Reading from System.in
    System.out.println("Enter a String: ");
    String input = reader.nextLine(); // Scans the next token of the input as
    // a String.

    String ret = replaceSpace(input);

    System.out.println (ret);
  }

  public static String replaceSpace(String input) {

    //make a char array same size with input
    char [] holder = new char[input.length()];

    int len = getLength(input);

    char [] ret = new char [len];
    int y = 0;
    for (int i = 0; i <input.length(); i++) {
      if (input.charAt(i) == ' ') {
        y = y < i ? i : y;
        ret[y++] = '%';
        ret[y++]= '2';
        ret[y++]= '0';
      } else {
        ret[y++] = input.charAt(i);
      }


    }
    return new String (ret);
  }

  //get the final length of the returned string after replace space with %20
  //to create a char array big enough to hold the result
  public static int getLength(String input) {

    int x = 0;
    char [] temp = input.toCharArray();
    for (int i = 0; i < temp.length; i++) {
        if (temp[i] == ' ') {
          x++;
        }
    }
    return (x*2) + input.length();
  }

}
