package graphs;

import java.util.LinkedList;
import java.util.Stack;


public class DFS {
  static AdJList ls;

  public static void main(String[] args) {
    ls = new AdJList(8);
    ls.insert(0, 1).insert(0, 2);
    ls.insert(2, 3);
    ls.insert(3, 4);
    ls.insert(4, 5).insert(4, 6);
    ls.insert(5, 6).insert(5, 7);
    ls.insert(6, 7);
    dfs(0);
  }

  static int getUnvisited(int nodeIndex) {
    LinkedList<Integer> lst = ls.list[nodeIndex];
    for (Integer i : lst) {
      if (!(ls.visited[i]))
        return i;
    }
    return -1;
  }

  static void dfs(int startNode) {
    Stack<Integer> q = new Stack<>();
    q.add(startNode);
    ls.visited[startNode] = true;
    System.out.print("DFS: " + startNode);
    while (!q.isEmpty()) {
      Integer v = getUnvisited(q.peek());
      if (v == -1) {
        q.pop();
      } else {
        System.out.print(" " + v);
        ls.visited[v] = true;
        q.add(v);
      }
    }
  }
}
