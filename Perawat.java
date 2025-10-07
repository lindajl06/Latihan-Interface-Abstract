class Perawat extends Pegawai implements RumahSakit {
    private String UnitKerja;

    public Perawat(String NIP, String Nama, double Gaji, String UnitKerja) {
        super(NIP, Nama, Gaji);
        this.UnitKerja = UnitKerja;
    }

    public void bekerja() {
        System.out.println("Perawat " + Nama + " bekerja di unit " + UnitKerja + ".");
    }

    public void melayanipasien() {
        System.out.println("Perawat " + Nama + " membantu pelayanan pasien di unit " + UnitKerja + ".");
    }
}
