
import java.util.*;

public class removeDuplicate {

  public static void main (String [] args) {

    ArrayList<Integer> arr = new ArrayList<Integer>();

    arr.add(2);
    arr.add(3);
    arr.add(5);
    arr.add(5);
    arr.add(7);
    arr.add(11);
    arr.add(11);
    arr.add(11);
    arr.add(13);
    System.out.println("size is " + helper(arr));
  }

  public static int helper (ArrayList<Integer> arr) {

    int size = arr.size();
    int temp = 0;

    for (int i = 1; i < size; i++) {
      if ((i + temp) < size && arr.get(i).intValue() == arr.get(i - 1).intValue()) {
        arr.remove(i-1);
        i--;
        temp++;
        arr.add(0);
      }
    }

    for (int i = 0; i < arr.size(); i++) {
      System.out.println(arr.get(i));
    }
    return arr.size() - temp;

  }

}
