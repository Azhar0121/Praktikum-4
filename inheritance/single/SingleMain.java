public class SingleMain {
    public static void main(String[] args) {
        Mobil m = new Mobil();
        m.merek = "Mobil Avanza";
        m.kecepatan = 80;
        m.tipe = "MPV";

        m.jalan();
        m.info();
    }
}
