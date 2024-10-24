// anak kelas
public class Buku extends Produk {
    private String kategori;  //encapsulasi 

    // Constructor
    public Buku(String nama, String merek, int harga, String kategori) {
        super(nama, merek, harga);
        this.kategori = kategori;
    }

    // Overriding method tampilInfo()
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Kategori: " + kategori);
    }
}
