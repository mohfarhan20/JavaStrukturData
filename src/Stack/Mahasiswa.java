package Stack;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int nilai;

    public Mahasiswa(){
        this.nama = "";
        this.nim = "";
        this.nilai = 0;
    }

    public Mahasiswa(String newNama, String newNim, int newNilai){
        this.nama = newNama;
        this.nim = newNim;
        this.nilai = newNilai;
    }

    public String getNama(){
        return this.nama;
    }

    public String getNim(){
        return this.nim;
    }

    public int getNilai(){
        return this.nilai;
    }

    public void setNama(String newNama){
        this.nama = newNama;
    }

    public void setNim(String newNim){
        this.nim = newNim;
    }

    public void setNilai(int newNilai){
        this.nilai = newNilai;
    }

    public void print(){
        System.out.println("Nama\t\t: " + this.nama + "\nNIM\t\t\t: " + this.nim + "\nNilai\t\t: " + this.nilai + "\n");
    }

    @Override
    public String toString(){
        return ("Nama\t\t: " + this.nama + "\nNIM\t\t\t: " + this.nim + "\nNilai\t\t: " + this.nilai + "\n");
    }
}
