//anak kelas

public class Pakaian extends Produk {
    private String ukuran;

    // Constructor
    public Pakaian(String nama, String merek, int harga, String ukuran) {
        super(nama, merek, harga);
        this.ukuran = ukuran;
    }

    // Overriding method tampilInfo()
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Ukuran: " + ukuran);
    }
}
