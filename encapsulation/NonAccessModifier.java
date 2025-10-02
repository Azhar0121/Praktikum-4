class Mahasiswa {
    private final int NIM;

    public static String universitas = "Politeknik Negeri Indramayu";

    public Mahasiswa(int nim) {
        this.NIM = nim;
    }

    public int getNIM() {
        return NIM;
    }
}

public class NonAccessModifier {
    public static void main(String[] args) {
        Mahasiswa mahasiswa1 = new Mahasiswa(2403063);

        System.out.println("NIM: " + mahasiswa1.getNIM());
        System.out.println("Universitas: " + Mahasiswa.universitas);
    }
}
