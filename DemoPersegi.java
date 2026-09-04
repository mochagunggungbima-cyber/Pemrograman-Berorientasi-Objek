public class DemoPersegi {
    public static void main(String[] args) {
        PersegiPanjang pp = new PersegiPanjang();
        pp.panjang = 12;
        pp.lebar = 6;

        System.out.println("=== DATA PERSEGI PANJANG ===");
        pp.displayInfo();
        System.out.println("Luas     : " + pp.getLuas());
        System.out.println("Keliling : " + pp.getKeliling());
    }
}