package jobsheet3;

import java.util.Scanner;

public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan Jumlah Dosen: ");
        int jml = sc.nextInt();
        sc.nextLine();

        Dosen11[] daftarDosen = new Dosen11[jml];

        for (int i = 0; i < jml; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode          : ");
            String kode = sc.nextLine();
            System.out.print("Nama          : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (Pria/Wanita): ");
            Boolean jk = sc.nextLine().equalsIgnoreCase("Pria");
            System.out.print("Usia          : ");
            int usia = sc.nextInt();
            sc.nextLine();

            daftarDosen[i] = new Dosen11(kode, nama, jk, usia);
            System.out.println("------------------------------");
        }

        DataDosen11 dataHelper = new DataDosen11();
        dataHelper.dataSemuaDosen(daftarDosen);
        dataHelper.jumlahDosenPerJenisKelamin(daftarDosen);
        dataHelper.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        dataHelper.infoDosenPalingTua(daftarDosen);
        dataHelper.infoDosenPalingMuda(daftarDosen);
    }
}