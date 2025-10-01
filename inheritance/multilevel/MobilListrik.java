package multilevel;

public class MobilListrik extends Mobil {
    int kapasitasBaterai;

    void isiDaya() {
        System.out.println("Mengisi daya mobil listrik " + this.merek + " dengan kapasitas " + this.kapasitasBaterai + " kWh");
    }
}
