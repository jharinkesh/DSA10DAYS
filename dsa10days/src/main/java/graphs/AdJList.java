package graphs;

import java.util.LinkedList;

public class AdJList {
  LinkedList<Integer>[] list;
  boolean[] visited;

  AdJList(int numberOfNodes) {
    list = new LinkedList[numberOfNodes];
    visited = new boolean[numberOfNodes];
    for (int i = 0; i < numberOfNodes; i++) {
      list[i] = new LinkedList<>();
    }
  }

  AdJList insert(int source, int dest) {
    list[source].add(dest);
    list[dest].add(source);
    return this;
  }

  AdJList insertUni(int source, int dest) {
    list[source].add(dest);
    return this;
  }

}
