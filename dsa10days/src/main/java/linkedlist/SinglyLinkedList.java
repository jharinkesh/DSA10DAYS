package linkedlist;

public class SinglyLinkedList {

  public static void main(String[] args) {
    SinglyLinkedList sl = new SinglyLinkedList();
    sl.add(23);
    sl.add(24);
    sl.add(25);
    sl.add(26);
    sl.disp();
  }

  SNode head;

  void add(int data) {
    if (head == null)
      head = new SNode(data);
    else {
      SNode n1 = head;
      while (n1.next != null) {
        n1 = n1.next;
      }
      n1.next = new SNode(data);
    }
  }

  void remove(int data) {
    if (head.data == data) {
      head = head.next;
      return;
    }

    SNode prev = head, n1 = head.next;
    while (n1 != null) {
      if (n1.data == data) {
        prev.next = n1.next;
        return;
      }
      n1 = n1.next;
    }
  }

  void disp() {
    SNode n1 = head;
    while (n1 != null) {
      System.out.print(n1.data + " -> ");
      n1 = n1.next;
    }
  }
}
