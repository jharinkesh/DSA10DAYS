package demo;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;


public class Games4 {

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

          List<Long> y = new LinkedList<Long>();
          for (int i = 0; i < n; i++) {
            y.add(sc.nextLong());
          }

          Collections.sort(x);
          Collections.sort(y);
          //System.out.println(x);
          //System.out.println(y);

          long max = x.get(x.size() - 1);
          int count = 0;
          for (int i = 0; i < n; i++) {
            long op = y.get(i);
            if (op < max) {
              // int index = getIndex(x, op);
              // if (index >= 0) {
              // count++;
              // x.remove(index);
              // }
              //System.out.println(x);
              //System.out.println(y);

              if (x.get(0) >= op) {
                count++;
                x.remove(0);
                continue;
              }
              int j = 1;
              while (j < x.size()) {
                j = j * 2;
                if (j >= x.size())
                  j = x.size() - 1;
                System.out.println("i:" + i + "j: " + j);
                if (x.get(j) > op) {
                  System.out.println("condition " + x.get(j) + " " + op);
                  int index = getIndex(x, op, j / 2, j);
                  System.out.println("index: " + index);
                  if (index >= 0) {
                    count++;
                    x.remove(index);
                    break;
                  }
                }

                if (j == (x.size() - 1))
                  break;
              }

              // for (int j = 0; j <x.size() ; j = j*2) {
              // if (op < x.get(j)) {
              // count++;
              // x.remove(j);
              // break;
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


  static int getIndex(List<Long> x, long y, int start, int end) {
    int index = -1;
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
