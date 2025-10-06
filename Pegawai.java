abstract class Pegawai {
    protected String NIP;
    protected String Nama;
    protected double Gaji;

    public Pegawai(String NIP, String Nama, double Gaji) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Gaji = Gaji;
    }

    public abstract void bekerja();
    
}
