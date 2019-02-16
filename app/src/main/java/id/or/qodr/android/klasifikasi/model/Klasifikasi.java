package id.or.qodr.android.klasifikasi.model;

public class Klasifikasi{
    private String namaKlasifikasi;
    private String klasifikasiItem;

    public String getNamaKlasifikasi() {
        return namaKlasifikasi;
    }

    public String getKlasifikasiItem() {
        return klasifikasiItem;
    }

    public Klasifikasi(String namaKlasifikasi, String klasifikasiItem) {
        this.namaKlasifikasi = namaKlasifikasi;
        this.klasifikasiItem = klasifikasiItem;
    }
}
