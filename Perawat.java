class Perawat extends Pegawai implements RumahSakit { //Kelas Perawat mewariskan 
    private String UnitKerja;

    public Perawat(String NIP, String Nama, double Gaji, String UnitKerja) {
        super(NIP, Nama, Gaji); //atribut NIP, Nama, Gaji dari class abstract pegawai
        this.UnitKerja = UnitKerja;
    }

    @Override 
    public void bekerja() { //method ini adalah pewarisan dari abstract class pegawai
        System.out.println("Perawat " + Nama + " bekerja di unit " + UnitKerja + ".");
    }

    public void melayanipasien() { //method ini adalah pewarisan dari interface RumahSakit
        System.out.println("Perawat " + Nama + " membantu pelayanan pasien di unit " + UnitKerja + ".");
    }
}
