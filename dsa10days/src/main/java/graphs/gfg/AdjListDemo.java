package graphs.gfg;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AdjListDemo {

  public static void main(String[] args) {
    AdjList list = new AdjList(4);
    list.add(0, 1);
    list.add(0, 2);
    list.add(1, 2);
    list.add(1, 3);
    list.disp();
  }

}


class AdjList {
  private List<LinkedList<Integer>> list;
  private int n;

  AdjList(int n) {
    this.n = n;
    list = new ArrayList<>();
    for (int i = 0; i < n; i++)
      list.add(new LinkedList<Integer>());
  }

  public void add(int u, int v) {
    list.get(u).add(v);
    list.get(v).add(u);
  }

  public void addDir(int u, int v) {
    list.get(u).add(v);
  }

  public void disp() {
    for (int i = 0; i < n; i++) {
      System.out.println(i + " : " + list.get(i));
    }
  }

}
