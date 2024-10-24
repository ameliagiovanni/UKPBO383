//Kelas Induk
public class Produk {
    private String nama;
    private String merek;
    private int harga;

    // Constructor
    public Produk(String nama, String merek, int harga) {
        this.nama = nama;
        this.merek = merek;
        this.harga = harga;
    }

    // Getter dan setter
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // ... (getter dan setter untuk atribut lainnya)

    public void tampilInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Merek: " + merek);
        System.out.println("Harga: Rp" + harga);
    }
}
