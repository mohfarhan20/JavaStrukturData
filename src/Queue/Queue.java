package Queue;

public class Queue {
    public int [] queue;
    public int tail;
    public int max;

    public Queue(int size){
        max = size;
        queue = new int [max];
        tail = -1;
    }

    public boolean isFull(){
        return tail == max-1;
    }

    public boolean isEmpty(){
        return tail == -1;
    }

    public void addQueue(int value){
        if (isFull() == true ){
            System.out.println(" Antrian Penuh ");
        }
        else{
            tail ++;
            queue[tail] = value;

        }

    }

    public void delQueue( ){
        if (isEmpty() == true ){
            System.out.println("Antrian Kosong ");
        }
        else{
            System.out.println(" Nilai yang dihapus "+queue[0]);
            queue[0] = 0;
            for (int i = 1; i<= tail; i++) {
                queue[i-1] = queue[i];
                queue[i] = 0 ;
            }
            tail -- ;
        }
    }

    public void print(){
        for (int i = 0; i <= tail; i++) {
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
}
