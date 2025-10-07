class Dokter extends Pegawai implements RumahSakit {
    private String Spesialisasi;

    public Dokter(String NIP, String Nama, double Gaji, String Spesialisasi) {
        super(NIP, Nama, Gaji); //atribut NIP, Nama, Gaji dari class abstract pegawai
        this.Spesialisasi = Spesialisasi;
    }

    @Override
    public void bekerja() { //method ini adalah pewarisan dari abstract class Pegawai
        System.out.println("Dokter " + Nama + " sedang bekerja di poli " + Spesialisasi + ".");
    }

    @Override
    public void melayanipasien() { //method ini adalah pewarisan dari interface RumahSakit
        System.out.println("Dokter " + Nama + " melayani pasien di ruang periksa.");
    }

    public void melakukanoperasi() {
        System.out.println("Dokter " + Nama + " sedang melakukan operasi spesialis " + Spesialisasi + ".");
    }
}

