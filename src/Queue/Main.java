package Queue;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa("Abdi","09021292112",100);
        Mahasiswa m2 = new Mahasiswa("Brando","09021292112",100);
        Mahasiswa m3 = new Mahasiswa("Chaplin","09021292112",100);
        QueueMahasiswa kelas = new QueueMahasiswa(3);
        kelas.addQueue(m1);
        kelas.addQueue(m2);
        kelas.addQueue(m3);
        System.out.println(kelas);
        System.out.println(" ====== DEL QUEUE ======= ");
        kelas.delQueue();
        kelas.delQueue();
        System.out.println(kelas);






    }
}
