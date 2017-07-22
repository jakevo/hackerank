public class permute {

    public int[][] permute(int[] A) {

        int left = 0;
        perms[A, left, A.length];

    }

    public int [][] perms[int [] A, int left, int right) {
        int [][] array = new int


    }

    public void swap(int[] a, int i, int j) {
	    int temp = a[i];
	    a[i] = a[j];
	    a[j] = temp;
    }

    public int factorial (int n) {
      int ret = 0;
      if (n == 1) return n;

      if (n > 1) {
        ret = ret + n * factorial (n - 1);
      }

      return ret;
    }
}
