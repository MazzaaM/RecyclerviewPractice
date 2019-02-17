package id.or.qodr.android.klasifikasi.model;

import android.os.Parcel;
import android.os.Parcelable;


public class Klasifikasi implements Parcelable {
    private String namaKlasifikasi;
    private String klasifikasiItem;

    private Klasifikasi(Parcel in) {
        namaKlasifikasi = in.readString();
        klasifikasiItem = in.readString();
    }

    public static final Creator<Klasifikasi> CREATOR = new Creator<Klasifikasi>() {
        @Override
        public Klasifikasi createFromParcel(Parcel in) {
            return new Klasifikasi(in);
        }

        @Override
        public Klasifikasi[] newArray(int size) {
            return new Klasifikasi[size];
        }
    };

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


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(namaKlasifikasi);
        parcel.writeString(klasifikasiItem);
    }
}
