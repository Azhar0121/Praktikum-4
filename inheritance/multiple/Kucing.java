package multiple;

public class Kucing implements Hewan, Suara {
    String nama;
    int umur;
    String ras;

    public Kucing(String nama, int umur, String ras) {
        this.nama = nama;
        this.umur = umur;
        this.ras = ras;
    }

    @Override
    public void makan() {
        System.out.println(this.nama + " sedang makan ikan");
    }

    @Override
    public void bersuara() {
        System.out.println(this.nama + " Meoongg");
    }

    public void tampilkanInfo() {
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur + " tahun");
        System.out.println("Ras: " + this.ras);
    }
}

