package hybrid;

public class HybridMain {
     public static void main(String[] args) {
        MobilListrik mobil1 = new MobilListrik();
        mobil1.merek = "Mobil Tesla";
        mobil1.kecepatan = 80;
        mobil1.tipe = "Sport";
        mobil1.kapasitasBaterai = 120;

        mobil1.jalan();
        mobil1.info();
        mobil1.isiDaya();

        Motor motor1 = new Motor();
        motor1.merek = "Motor Ducati";
        motor1.kecepatan = 180;
        motor1.cc = 1000;

        motor1.jalan();
        motor1.tampilkanInfo();
    }
}
