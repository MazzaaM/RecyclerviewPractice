package id.or.qodr.android.klasifikasi.fragments;

import android.os.Bundle;

public class KlasifikasiFragment {
    public static final String KEY_KLASIFIKASI = "key_klasifikasi";

    public static KlasifikasiFragment newInstance(){
        KlasifikasiFragment klasifikasiFragment = new KlasifikasiFragment();
        Bundle bundle = new Bundle();

        return klasifikasiFragment;
    }
}
