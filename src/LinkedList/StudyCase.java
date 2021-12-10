package LinkedList;

import java.util.*;
import java.util.LinkedList;

public class StudyCase {
    public static void main(String[] args) {
        Queue<String> Kampus = new LinkedList<>();
        System.out.println("=========================================");
        // Mahasiswa otw kampus
        System.out.println("Mahasiswa dalam perjalanan menuju kampus");
        String mhs1 = "Dwi Zulmarkham";
        String mhs2 = "Ibnu Nalaprana";
        String mhs3 = "Meri Juwita";
        String mhs4 = "Miftahul Jannah";
        String mhs5 = "M. Farhan Ghifari";
        String mhs6 = "M. Alfaris Oktavian";
        System.out.println("=========================================");

// Mahasiswa tiba di tempat tujuan
        System.out.println("Mahasiswa tiba di kampus");
        Kampus.add(mhs1);
        Kampus.add(mhs2);
        Kampus.add(mhs3);
        Kampus.add(mhs4);
        Kampus.add(mhs5);
        Kampus.add(mhs6);
        System.out.println("=========================================");

        // Mahasiswa mengantri
        for (int i = 1; i <= 6; i++) {
            String baju = Kampus.remove();
            System.out.println("Mahasiswa ke " + i + " yang mengambil baju : " + baju);
            System.out.println("Mahasiswa yang belum mengambil : " + Kampus);
            System.out.println("=========================================");
        }
    }
}
