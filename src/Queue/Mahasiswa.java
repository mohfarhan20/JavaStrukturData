package Queue;

public class Mahasiswa {
    private String nama;
    private String nim;
    private int nilai;

    //Konstruktor
    public Mahasiswa() {
        this.nama="xxxxxxxxxxxx";
        this.nim="xxxxxxxxxxx";
        this.nilai=0;
    }
    public Mahasiswa (String nama, String nim, int nilai){
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    // Getter
    public String getNama(){
        return this.nama;
    }

    public String getNim (){
        return this.nim;
    }

    public int getNilai(){
        return this.nilai;
    }
    // Setter
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setNim (String nim){
        this.nim = nim;
    }

    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    //Print
    @Override
    public String toString() {
        return("\nNama Mahasiswa : "+this.nama +
                "\nNIM            : "+this.nim +
                "\nNilai          : "+this.nilai+"\n");
    }
}
