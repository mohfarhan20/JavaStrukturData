package Stack;

public class StackMahasiswa {
    private String [][] mhs;
    private int top;
    private int max;

    public StackMahasiswa (int max){
        this.max = max;
        mhs = new String[max][3];
        top =-1;
    }
    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == max-1;
    }

    public void push(String nim,String nama,String nilai){
        if(isFull() == false){
            top++;
            mhs[top][0] = nim;
            mhs[top][1] = nama;
            mhs[top][2] = nilai;
        }
        else {
            System.out.println("StudiKasus.Stack Penuh");
        }
    }

    public void pop (){
        if (isEmpty()==false){
            System.out.println(" Data mahasiswa yang dihapus \n"+
                    "Nim : "+ mhs[top][0]+
                    " || Nama : "+mhs[top][1]+
                    " || Nilai : "+mhs[top][2]);
            top--;
        }
        else{
            System.out.println("StudiKasus.Stack kosong");
        }
    }

    public String peek(){
        if (isEmpty() == false){
            return (" Data mahasiswa paling atas \n"+
                    "Nim : "+ mhs[top][0]+
                    " || Nama : "+mhs[top][1]+
                    " || Nilai : "+mhs[top][2]);
        }
        else{
            return "-1";
        }
    }

    public void print (){
        System.out.println(" Data mahasiswa");
        for (int i = top; i>=0; i--) {
            System.out.println(
                    "Nim : "+ mhs[i][0]+
                            " || Nama : "+mhs[i][1]+
                            " || Nilai : "+mhs[i][2]);
        }
    }
}

