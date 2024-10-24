// anak kelas

public class Elektronik extends Produk {
    private String sistemOperasi;

    // Constructor
    public Elektronik(String nama, String merek, int harga, String sistemOperasi) {
        super(nama, merek, harga);
        this.sistemOperasi = sistemOperasi;
    }

    // Overriding method tampilInfo()
    @Override
    public void tampilInfo() {
        super.tampilInfo();
        System.out.println("Sistem Operasi: " + sistemOperasi);
    }
}
