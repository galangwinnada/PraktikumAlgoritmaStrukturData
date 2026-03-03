package Jobsheet2;

public class DosenMain11 {
    public static void main(String[] args) {
        // 1. Instansiasi objek pertama menggunakan Konstruktor Default
        Dosen11 dosen1 = new Dosen11();
        dosen1.idDosen = "D001";
        dosen1.nama = "Dr. Budi Santoso";
        dosen1.statusAktif = true;
        dosen1.tahunBergabung = 2015;
        dosen1.bidangKeahlian = "Kecerdasan Buatan";

        // 2. Instansiasi objek kedua menggunakan Konstruktor Berparameter
        Dosen11 dosen2 = new Dosen11("D002", "Siti Aminah, M.T.", false, 2010, "Sistem Jaringan");

        // Memanggil semua method untuk Dosen 1
        System.out.println("\n=== INFORMASI DOSEN 1 ===");
        dosen1.tampilInformasi();
        System.out.println("Masa Kerja     : " + dosen1.hitungMasaKerja(2025) + " tahun");
        
        dosen1.ubahKeahlian("Data Science");
        dosen1.tampilInformasi();

        System.out.println("\n" + "=".repeat(30));

        // Memanggil semua method untuk Dosen 2
        System.out.println("\n=== INFORMASI DOSEN 2 ===");
        dosen2.tampilInformasi();
        System.out.println("Masa Kerja     : " + dosen2.hitungMasaKerja(2025) + " tahun");
        
        dosen2.setStatusAktif(true);
        dosen2.tampilInformasi();
    }
}

