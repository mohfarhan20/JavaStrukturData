package Stack;

public class Main {
    public static void main(String[] args) {
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(8);
        s.push(11);

        s.print();
        System.out.println( "PEEK");
        System.out.println("Stack paling atas : "+s.peek());

        System.out.println("POP");
        s.pop();
        s.print();
    }

}
