package multiple;

public class MultipleMain {
    public static void main(String[] args) {
        Kucing kucing1 = new Kucing("Sparky", 2, "Persia");

        kucing1.tampilkanInfo();
        kucing1.makan();
        kucing1.bersuara();
    }
}
