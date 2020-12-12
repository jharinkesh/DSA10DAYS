package demo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Games2 {

  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int t = sc.nextInt();
    if (t >= 1 && t <= 100000) {
      for (int tn = 0; tn < t; tn++) {
        int n = sc.nextInt();
        if (n >= 1 && n <= 100000) {

          List<Long> x = new LinkedList<Long>();
          for (int i = 0; i < n; i++) {
            x.add(sc.nextLong());
          }

          Collections.sort(x);
          long max = x.get(x.size() - 1);
          int count = 0;
          for (int i = 0; i < n; i++) {
            long y = sc.nextLong();
            if (y < max) {
              int index = getIndex(x, y);
              if (index >= 0) {
                count++;
                x.remove(index);
              }
              // for (int j = 0; j <x.size() ; j++) {
              // if (y < x.get(j)) {
              // count++;
              // x.remove(j);
              // break;
              // }
              // }
              // }
            }
          }
          System.out.println(count);

        }
      }
      sc.close();
    }
  }

  static int getIndex(List<Long> x, long y) {
    int index = -1;
    int start = 0, end = x.size() - 1;
    while (start <= end) {
      int mid = (start + end) / 2;
      if (x.get(mid) <= y) {
        start = mid + 1;
      } else {
        index = mid;
        end = mid - 1;
      }
    }
    return index;
  }

}

