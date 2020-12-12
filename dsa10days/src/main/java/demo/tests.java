package demo;

import java.util.Scanner;

public class tests {

  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    if (n >= 1 && n <= 10000000) {
      long[] p = new long[n];
      for (int i = 0; i < n; i++) {
        p[i] = sc.nextLong();
      }

      long[] s = new long[n];
      for (int j = 0; j < n; j++) {
        s[j] = sc.nextLong();
      }

      sc.close();

      long count = s[0] / p[0];
      for (int i = 1; i < n; i++) {
        long val = s[i] / p[i];
        if (val < count) {
          count = val;
        }
      }

      System.out.println(count);
    }
  }

  // 4
  // 2 5 6 3
  // 20 40 90 50

  // power puff
}
