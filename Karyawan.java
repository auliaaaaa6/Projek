package Projek;

public class Karyawan {
    private String nama;
    private String tanggalLahir;
    private String jenisKelamin;
    private String alamat;
    private String noTelp;
    private String email;
    private String kategoriKaryawan;
    private int expSIM;
    
    public Karyawan() {
        this.nama = "";
        this.tanggalLahir = "";
        this.jenisKelamin = "";
        this.alamat = "";
        this.noTelp = "";
        this.email = "";
        this.kategoriKaryawan = "";
        this.expSIM = 0;
    }

    public Karyawan(String nama, String tanggalLahir, String jenisKelamin, String alamat, String noTelp, String email, String kategoriKaryawan, int expSIM) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
        this.alamat = alamat;
        this.noTelp = noTelp;
        this.email = email;
        this.kategoriKaryawan = kategoriKaryawan;
        this.expSIM = expSIM;
    }
    
    public void menampilkanData() {
        System.out.println("Nama                : "+ nama);
        System.out.println("Tanggal Lahir       : " + tanggalLahir);
        System.out.println("Jenis Kelamin       : "+ jenisKelamin);
        System.out.println("Alamat              : "+ alamat);
        System.out.println("No Telp             : "+ noTelp);
        System.out.println("Email               : "+ email);
        System.out.println("Kategori Karyawan   : "+ kategoriKaryawan);
        System.out.println("Masa Berlaku SIM    : "+ expSIM);
    }

    public String getNama () {return nama;}

    public String getTanggalLahir () {return tanggalLahir;}

    public String getJenisKelamin () {return jenisKelamin;}

    public void setAlamat(String s) {alamat = s;}

    public void setNoTelp(String s) {noTelp = s;}

    public String getEmail () {return email;}

    public void setKategoriKaryawan(String s) {kategoriKaryawan = s;}
    
    public void setExpSIM(int i) {expSIM = i;}
}