package hierarchical;

public class HierarchicalMain {
     public static void main(String[] args) {
        Mobil mobil1 = new Mobil();
        mobil1.merek = "Mobil Civic";
        mobil1.kecepatan = 150;
        mobil1.tipe = "Sedan";
        mobil1.jalan();
        mobil1.info();

        Motor motor1 = new Motor();
        motor1.merek = "Motor Supra";
        motor1.kecepatan = 100;
        motor1.cc = 125;
        motor1.jalan();
        motor1.tampilkanInfo();
    }
}
