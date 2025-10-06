class Dokter extends Pegawai implements RumahSakit {
    private String Spesialisasi;

    public Dokter(String NIP, String Nama, double Gaji, String Spesialisasi) {
        super(NIP, Nama, Gaji);
        this.Spesialisasi = Spesialisasi;
    }

    @Override
    public void bekerja() {
        System.out.println("Dokter " + Nama + " sedang memeriksa pasien.");
    }

    @Override
    public void melayanipasien() {
        System.out.println("Dokter " + Nama + " melayani pasien di ruang periksa.");
    }

    public void melakukanoperasi() {
        System.out.println("Dokter " + Nama + " sedang melakukan operasi spesialis " + Spesialisasi + ".");
    }
}

