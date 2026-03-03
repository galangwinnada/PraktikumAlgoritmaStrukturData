package jobsheet3;

import java.util.Scanner;

public class MataKuliahDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array matakuliah: ");
        int jmlElemen = sc.nextInt();
        sc.nextLine(); 

        MataKuliah11[] arrMataKuliah11 = new MataKuliah11[jmlElemen];

        for (int i = 0; i < jmlElemen; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));
            System.out.print("Kode       : ");
            String kode = sc.nextLine();
            System.out.print("Nama       : ");
            String nama = sc.nextLine();
            System.out.print("Sks        : ");
            int sks = sc.nextInt();
            System.out.print("Jumlah Jam : ");
            int jumlahJam = sc.nextInt();
            sc.nextLine(); 

            arrMataKuliah11[i] = new MataKuliah11();
            arrMataKuliah11[i].tambahData(kode, nama, sks, jumlahJam);
            System.out.println("-----------------------------");
        }

        System.out.println("\n=== Hasil Input Data Matakuliah ===");
        for (int i = 0; i < jmlElemen; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrMataKuliah11[i].cetakInfo(); 
        }
    }
}