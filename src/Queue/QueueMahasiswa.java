package Queue;

public class QueueMahasiswa {
    public Mahasiswa [] queue;
    public int tail;
    public int max;

    public QueueMahasiswa(int size){
        max = size;
        queue = new Mahasiswa [max];
        tail = -1;

    }
    public boolean isEmpty(){
        return tail == -1;
    }
    public boolean isFull (){
        return tail == max-1;
    }
    public void addQueue(Mahasiswa mahasiswa) {

        if(isFull() == true){
            System.out.println("Queue penuh");
        }
        else{
            tail++;
            queue[tail] = mahasiswa;
        }
    }

    public void delQueue(){

        if(isEmpty() == true){
            System.out.println("Antrian Kosong");
        }
        else{
            System.out.println("Nilai yang dihapus : " + queue[0]);
            for(int i = 1 ; i <= tail; i++){
                queue[i-1] = queue[i];
                queue[i] = null;
            }
            tail--;
        }
    }

    @Override
    public String toString(){
        String s = "";
        for (int i = 0; i <= tail; i++){
            s += queue[i] + " ";
        }
        return s ;
    }

}
