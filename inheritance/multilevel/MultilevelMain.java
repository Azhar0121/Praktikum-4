package multilevel;

public class MultilevelMain {
    public static void main(String[] args) {
        MobilListrik ml = new MobilListrik();
        ml.merek = "Tesla";
        ml.kecepatan = 75;
        ml.tipe = "Sedan";
        ml.kapasitasBaterai = 100;

        ml.jalan();
        ml.info();
        ml.isiDaya();
    }
}
