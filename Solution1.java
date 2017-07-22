
import java.util.*;
public class Solution1 {

    public static void main(String [] agrs) {

      final int[] A = {50, 51, 15, 101, 23, 66, 69, 24, 75, 40, 30, 10, 61, 73, 95, 119, 106, 60, 26, 111, 54, 79, 18, 28, 72, 110, 37, 63, 5, 102,
        53, 42, 49, -4, -2, 64, 93, 117, 103, 115, -5, 87, 47, 12, 48, 1, 9, 91, 85, -3, 68, 76, 59, 38, 35, 45, 0, 78, 62, 70, 46, 90,
        52, 3, 83, 43, 11, 89, 21, 80, 77, 33, 17, 92, 113};
      System.out.println(longestConsecutive(A));
    }

    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    static int B[];
    public static int longestConsecutive(final int[] A) {
        B = A;
        Arrays.sort(B);
        for (int i = 0; i < B.length; i++) {
          System.out.println(B[i]);
        }

        int count = 1;
        int temp = 0;
        boolean flag = false;
        int max = 0;

        for (int i = 0; i < B.length; i++) {

            if (flag == false) {

                temp = B[i];
                flag = true;
                max = 1;
                continue;
            } else {

                if (B[i] - temp == 1) {
                    count++;
                    temp = B[i];


                } else if ((B[i] - temp) != 0)  {

                    count = 1;
                    temp = B[i];


                }
                if (count > max) {
                    max = count;
                    //count = 0;

                }
            }
        }
        return max;
    }
}
