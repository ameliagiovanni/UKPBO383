public class TokoOnline {
    public static void main(String[] args) {
        // Membuat objek produk
        Buku buku = new Buku("Pemrograman Java", "Andi", 100000, "Komputer");
        Elektronik hp = new Elektronik("Smartphone X", "XYZ", 5000000, "Android");
        Pakaian kaos = new Pakaian("Kaos Polos", "ABC", 50000, "L");

        // Menampilkan informasi produk
        buku.tampilInfo();
        hp.tampilInfo();
        kaos.tampilInfo();
    }
}