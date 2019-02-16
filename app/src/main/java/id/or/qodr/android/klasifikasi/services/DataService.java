package id.or.qodr.android.klasifikasi.services;

import java.util.ArrayList;
import java.util.List;

import id.or.qodr.android.klasifikasi.model.Klasifikasi;

public class DataService {
    private static DataService dataService = new DataService();

    public static DataService getInstance(){
        return dataService;
    }
    private DataService(){
    }

    public ArrayList<Klasifikasi> getKlasifikasiTumbuhan(){
        ArrayList<Klasifikasi> list = new ArrayList<>();
        list.add(new Klasifikasi("Plantae", "Bryophyta"));
        list.add(new Klasifikasi("Plantae", "Hepaticopsida"));
        list.add(new Klasifikasi("Plantae", "Anthocerotopsida"));
        list.add(new Klasifikasi("Plantae", "Bryopsida"));
        list.add(new Klasifikasi("Plantae", "Pterydophyta"));
        list.add(new Klasifikasi("Plantae", "Psilopsida"));
        list.add(new Klasifikasi("Plantae", "Lycopsida"));
        list.add(new Klasifikasi("Plantae", "Spenopsida"));
        list.add(new Klasifikasi("Plantae", "Pteriopsida"));
        list.add(new Klasifikasi("Plantae", "Spermatophyta"));
        list.add(new Klasifikasi("Plantae", "Gymnospernae"));
        list.add(new Klasifikasi("Plantae", "Cycadinae"));
        list.add(new Klasifikasi("Plantae", "Ginkgoinae"));
        list.add(new Klasifikasi("Plantae", "Coniferinae Coniferales"));
        list.add(new Klasifikasi("Plantae", "Gnetinae"));
        list.add(new Klasifikasi("Plantae", "Angiospermae"));
        return list;
    }

    public ArrayList<Klasifikasi> getKlasifikasiHewan(){
        ArrayList<Klasifikasi> list = new ArrayList<>();
        list.add(new Klasifikasi("Animalia", "Porifera"));
        list.add(new Klasifikasi("Animalia", "Coelenterata"));
        list.add(new Klasifikasi("Animalia", "Platyhelminthes"));
        list.add(new Klasifikasi("Animalia", "Nemathelminthes"));
        list.add(new Klasifikasi("Animalia", "Annelida"));
        list.add(new Klasifikasi("Animalia", "Mollusca"));
        list.add(new Klasifikasi("Animalia", "Arthropoda"));
        list.add(new Klasifikasi("Animalia", "Echinodermata"));
        list.add(new Klasifikasi("Animalia", "Vertebrata"));
        list.add(new Klasifikasi("Animalia", "Pisces"));
        list.add(new Klasifikasi("Animalia", "Amfibi"));
        list.add(new Klasifikasi("Animalia", "Reptilia"));
        list.add(new Klasifikasi("Animalia", "Aves"));
        list.add(new Klasifikasi("Animalia", "Mammalia"));
        return list;
    }
}
