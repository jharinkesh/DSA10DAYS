package demo;

import java.util.Arrays;
import java.util.Scanner;

public class Games5 {
  public static void main(String[] args) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    if (t >= 1 && t <= 100000) {
      for (int tn = 0; tn < t; tn++) {
        int n = sc.nextInt();
        if (n >= 1 && n <= 100000) {
          long[] x = new long[n];
          long[] y = new long[n];

          for (int i = 0; i < n; i++) {
            x[i] = sc.nextLong();
          }

          for (int i = 0; i < n; i++) {
            y[i] = sc.nextLong();
          }

          Arrays.sort(x);
          Arrays.sort(y);
          int count = 0, j = 0;
          for (int i = 0; i < n; i++) {
            while (j < n) {
              if (x[j] > y[i]) {
                count++;
                j++;
                break;
              }
              j++;
            }
          }
          System.out.println(count);
        }
      }
    }
    sc.close();
  }

}



// 1
// 10
// 3 6 7 5 3 5 6 2 9 1
// 2 7 0 9 3 6 0 6 2 6


