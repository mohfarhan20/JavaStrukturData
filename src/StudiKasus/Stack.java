package StudiKasus;

import StudiKasus.Node;

public class Stack {
  private Node head;

  public boolean isEmpty() {
    return this.head == null;
  }

  public void push(int value) {
    Node newNode = new Node(value);
    if (isEmpty()) {
      this.head = newNode;
      return;
    }

    newNode.setNext(this.head);
    this.head = newNode;
  }

  public Node peek() {
    return this.head;
  }

  @Override
  public String toString() {
    String result = "";
    Node curr = this.head;
    while(curr != null) {
      result += curr.getValue() + "  ";
      curr = curr.getNext();
    }
    return result;
  }
}