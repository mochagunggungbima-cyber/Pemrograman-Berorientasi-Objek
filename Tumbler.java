public class Tumbler {
    // Atribut (State)
    public String merek;
    public String warna;
    public int kapasitas;
    public String bahan;
    public int suhuMinuman;

    // Method (Behavior)
    public void membukaTutup() {
        System.out.println("Tutup tumbler " + merek + " dibuka.");
    }

    public void menutupTutup() {
        System.out.println("Tutup tumbler " + merek + " ditutup.");
    }

    public void mengisiMinuman() {
        System.out.println("Mengisi minuman ke dalam tumbler " + merek + ".");
    }

    public int mengeluarkanMinuman() {
        System.out.println("Mengeluarkan minuman dari tumbler " + merek + ".");
        return suhuMinuman; // Mengembalikan suhu minuman saat dikeluarkan
    }

    public void menjagaSuhu() {
        System.out.println("Tumbler " + merek + " menjaga suhu minuman pada " + suhuMinuman + "°C.");
    }

    public void displayInfo() {
        System.out.println("Merek        : " + merek);
        System.out.println("Warna        : " + warna);
        System.out.println("Kapasitas    : " + kapasitas + " ml");
        System.out.println("Bahan        : " + bahan);
        System.out.println("Suhu Minuman : " + suhuMinuman + "°C");
    }
}