abstract class Pegawai { //abstract kelas berisi method abstract bekerja() yang implementasinya nanti ditulis di kelas anak
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
