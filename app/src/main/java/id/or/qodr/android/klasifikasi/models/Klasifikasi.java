package id.or.qodr.android.klasifikasi.models;

import android.os.Parcelable;

import java.util.List;

public abstract class Klasifikasi implements Parcelable {
    protected String klasifikasi;
    protected List<String> listOfClassification;

    public String getKlasifikasi() {
        return klasifikasi;
    }

    public void setKlasifikasi(String klasifikasi) {
        this.klasifikasi = klasifikasi;
    }

    public List<String> getListOfClassification() {
        return listOfClassification;
    }

    public void setListOfClassification(List<String> listOfClassification) {
        this.listOfClassification = listOfClassification;
    }
}
