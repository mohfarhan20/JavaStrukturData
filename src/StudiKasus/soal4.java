package StudiKasus;

public class soal4 {

  public static void main(String[] args) {
    Stack stack = new Stack();
    stack.push(1);
    stack.push(2);
    stack.push(3);
    stack.push(4);
    System.out.println(stack);
    // assert head of stack
    System.out.println(stack.peek().getValue() == 4);

  }
}