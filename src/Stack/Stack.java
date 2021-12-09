package Stack;

public class Stack {

    private int [] stack;
    private int max;
    private int top;

    public Stack (int max){
        this.max = max;
        stack = new int [max];
        this.top = -1;
    }

    boolean isEmpty(){
        return this.top ==-1;
    }

    boolean isFull (){
        return this.top == max-1;
    }

    public void push(int value){
        if (isFull() == false){
            // top++;
            // stack[top] = value;
            // stack ditambah dlu baru di add value
            stack[++top] = value;
        }
        else{
            System.out.println("StudiKasus.Stack penuh!");
        }
    }
    public void pop() {
        if(isEmpty()==false) {
            System.out.println("stack yang dihapus " +
                    stack[top]);
            top--;
        }
        else {
            System.out.println("stack kosong");
        }
    }

// public int pop (){
//   if (isEmpty() == false){
//     return stack[top--];
//   }

//   else
//   return -1;
//   }

    public int peek (){
        if (isEmpty() == false){
            return stack[top];
        }

        else
            return -1;
    }

    public void print (){
        for (int i = top; i >=0 ; i--) {
            System.out.println("stack ke- "+i+" = "+stack[i]);
        }
    }



}
