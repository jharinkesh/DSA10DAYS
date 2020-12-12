package demo;

import java.util.HashMap;
import java.util.Map;


public class LinkedList {

  static Node head;

  public static void main(String[] args) {
    // disp();
    // add(34);
    // disp();
    // add(22);
    // add(11);
    // add(221);
    // add(88);
    // disp();
    int[] x = {1, 2, 4, -1, 3};
    buildList(x);
    disp();


  }

  public static void buildList(int[] x) {
    int index = 0;
    Map<Integer, Integer> positions = new HashMap<>();
    positions.put(0, x[0]);
    for (int i = 1; i < x.length; i++) {
      positions.put(x[i], x[x[i]]);
    }



    while (x[index] != -1) {
      add(x[index]);
      index = x[index];
    }
    add(x[index]);
  }

  public static void add(int data) {
    if (head == null) {
      head = new Node(data);
    } else {
      Node n1 = head;
      while (n1.next != null) {
        n1 = n1.next;
      }
      n1.next = new Node(data);
    }
  }

  public static void disp() {
    System.out.println();
    Node n1 = head;
    while (n1 != null) {
      System.out.print(n1.data + " -> ");
      n1 = n1.next;
    }
  }
}


class Node {

  int data;
  Node next;

  Node(int data) {
    this.data = data;
  }

}
