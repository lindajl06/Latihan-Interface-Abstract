public class Main {
    public static void main(String[] args) {
        Dokter[] daftarDokter = new Dokter[2];
        daftarDokter[0] = new Dokter("F1D02310072", "Dr. Linda", 15000000, "Bedah");
        daftarDokter[1] = new Dokter("F1D02310007", "Dr. Devita", 14000000, "Anak");

        Perawat[] daftarPerawat = new Perawat[2];
        daftarPerawat[0] = new Perawat("P001", "Lugia", 7000000, "Unit Gawat Darurat");
        daftarPerawat[1] = new Perawat("P002", "David", 7500000, "Unit Rawat Inap");

        System.out.println("=== Data Dokter ===");
        for (Dokter d : daftarDokter) {
            d.bekerja();
            d.melayanipasien();
            d.melakukanoperasi();
            System.out.println();
        }

        System.out.println("=== Data Perawat Rumah Sakit ===");
        for (Perawat p : daftarPerawat) {
            p.bekerja();
            p.melayanipasien();
            System.out.println();
        }
    }
}
