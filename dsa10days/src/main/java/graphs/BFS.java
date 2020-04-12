package graphs;

import java.util.LinkedList;

public class BFS {

  static AdJList ls;

  public static void main(String[] args) {
    ls = new AdJList(8);
    ls.insert(0, 1).insert(0, 2);
    ls.insert(2, 3);
    ls.insert(3, 4);
    ls.insert(4, 5).insert(4, 6);
    ls.insert(5, 6).insert(5, 7);
    ls.insert(6, 7);
    bfs(0);
  }

  static void bfs(int startNode) {
    LinkedList<Integer> q = new LinkedList<>();
    q.add(startNode);
    ls.visited[startNode] = true;
    System.out.print("BFS: " + startNode);
    while (!q.isEmpty()) {
      Integer el = q.poll();
      for (Integer i : ls.list[el]) {
        if (!ls.visited[i]) {
          System.out.print(" " + i);
          ls.visited[i] = true;
          q.add(i);
        }
      }
    }
  }


}
