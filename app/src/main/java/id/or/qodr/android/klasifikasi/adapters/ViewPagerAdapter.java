package id.or.qodr.android.klasifikasi.adapters;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    private List<String> titleList;
    private List<Fragment> fragmentList;

    public ViewPagerAdapter(FragmentManager fm, ArrayList<String> _titleList, ArrayList<Fragment> _fragmentList) {
        super(fm);
        this.titleList = _titleList;
        this.fragmentList = _fragmentList;
    }

    @Override
    public Fragment getItem(int i) {
        return this.fragmentList.get(i);
    }

    @Override
    public int getCount() {
        return this.titleList.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return this.titleList.get(position);
    }
}
