package id.or.qodr.android.klasifikasi.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import id.or.qodr.android.klasifikasi.R;
import id.or.qodr.android.klasifikasi.model.Klasifikasi;

public class KlasifikasiFragment extends Fragment {
    public static final String KEY_KLASIFIKASI = "key_klasifikasi";
    private ArrayList<Klasifikasi> klasifikasiArrayList;

    public static KlasifikasiFragment newInstance(ArrayList<Klasifikasi> klasifikasiList){
        KlasifikasiFragment klasifikasiFragment = new KlasifikasiFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(KEY_KLASIFIKASI,klasifikasiList);
        klasifikasiFragment.setArguments(bundle);
        return klasifikasiFragment;
    }


    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        assert getArguments() != null;
        klasifikasiArrayList = getArguments().getParcelableArrayList(KEY_KLASIFIKASI);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_klasifikasi,container,false);
        return view;
    }
}
