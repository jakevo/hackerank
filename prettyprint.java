

//aabcccddaa -> a2b1c3d2a2
import java.util.*;

public class prettyprint {

  public static void main(String [] args) {

    prettyPrint1(5);
  }
  public static int[][] prettyPrint1(int A) {

    int temp1 = A;
    int temp2 = A;
    int row = temp1;
    int temp = (A*2) - 1;
    Stack<Integer> stack = new Stack<Integer>();
    int[][] result = new int [A*2-1][A*2-1];
    int copy = 0;

    for (int i = 0; i < row; i++) {
      copy = 0;

      int leftOrRight = temp - ((A*2) - 1);
      //print the left part
      for (int x = 0; x < leftOrRight/2; x++) {
        System.out.println("copy 1 is  " + copy);
        int holder1 = temp1--;
        //System.out.print(holder1);
        if ( i != row -1) {
          stack.push(holder1);
        }
        result [i][copy++] = holder1;
        System.out.print(' ');

      }
      //print the middle part
      for (int y = 0; y < (A*2) - 1; y++) {
        //System.out.print(A);
        //System.out.print(' ');
        if ( i != row -1) {
          stack.push(A);
        }
        System.out.println("copy 2 is " + copy);
        result [i][copy] = A;
        copy++;
      }
      //print the right part
      for (int y = 0; y < leftOrRight/2; y++) {
        int holder2 = ++temp1;
        System.out.println("copy 3 is " + copy);
        //System.out.print(holder2);
        //System.out.print(' ');
        if ( i != row -1) {
          stack.push(holder2);
        }
        result [i][copy++] = holder2;
      }
      //System.out.print('\n');
      A--;
      temp1 = temp2;

    }
    int col = row;
    copy = 0;

    while (stack.isEmpty() == false) {


      //System.out.print(' ');
      if (copy == temp) {
      //System.out.print('\n');
        col++;
        copy = 0;
      }
      System.out.println("copy 4 is " + copy);
      result [col][copy++] = stack.pop();
    }

    for(int i=0; i<result.length; i++) {
        for(int j=0; j<result[i].length; j++) {
            System.out.println("Values at arr["+i+"]["+j+"] is "+result[i][j]);
        }
    }

    return result;
  }
}
