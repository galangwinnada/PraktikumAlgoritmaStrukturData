package Jobsheet2;

public class MataKuliahMain11 {
     public static void main(String[] args) {

        // ===== Menggunakan Konstruktor Default =====
        MataKuliah11 mk1 = new MataKuliah11();
        mk1.kodeMK = "MK001";
        mk1.nama = "Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 6;

        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        // ===== Menggunakan Konstruktor Berparameter =====
        MataKuliah11 mk2 = new MataKuliah11("MK002", "Basis Data", 3, 6);

        mk2.tampilInformasi();
        mk2.tambahJam(1);
        mk2.kurangiJam(10); // contoh gagal
        mk2.tampilInformasi();
    }
}

