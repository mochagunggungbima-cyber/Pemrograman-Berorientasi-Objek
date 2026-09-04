public class TumblerDemo {
    public static void main(String[] args) {
        // Instansiasi Objek 1
        Tumbler t1 = new Tumbler();
        t1.merek = "Stanley";
        t1.warna = "Hitam";
        t1.kapasitas = 750;
        t1.bahan = "Stainless Steel";
        t1.suhuMinuman = 5;
        
        System.out.println("=== OBJEK TUMBLER 1 ===");
        t1.displayInfo();
        t1.membukaTutup();
        t1.mengisiMinuman();
        int suhuDikeluarkan = t1.mengeluarkanMinuman();
        System.out.println("Suhu minuman yang dikeluarkan: " + suhuDikeluarkan + "°C");
        t1.menutupTutup();
        t1.menjagaSuhu();
        System.out.println();

        // Instansiasi Objek 2
        Tumbler t2 = new Tumbler();
        t2.merek = "LocknLock";
        t2.warna = "Biru";
        t2.kapasitas = 500;
        t2.bahan = "Plastik";
        t2.suhuMinuman = 25;

        System.out.println("=== OBJEK TUMBLER 2 (SEBELUM UPDATE) ===");
        t2.displayInfo();
        System.out.println();

        // Update nilai atribut
        t2.warna = "Navy";
        t2.suhuMinuman = 80; // Update suhu jadi air panas

        System.out.println("=== OBJEK TUMBLER 2 (SETELAH UPDATE) ===");
        t2.displayInfo();
        t2.menjagaSuhu();
    }
}