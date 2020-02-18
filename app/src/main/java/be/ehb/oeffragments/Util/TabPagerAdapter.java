package be.ehb.oeffragments.Util;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import be.ehb.oeffragments.fragments.BillFragment;
import be.ehb.oeffragments.fragments.InfoFragment;
import be.ehb.oeffragments.fragments.PrefFragment;

public class TabPagerAdapter extends FragmentPagerAdapter {

    private Fragment[] fragments = {BillFragment.newInstance(), InfoFragment.newInstance(), PrefFragment.newInstance()};

    public TabPagerAdapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @Override
    public int getCount() {
        return fragments.length;
    }

    @NonNull
    @Override

    public Fragment getItem(int position) {
        return fragments[position];
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0)
            return "Split bill";
        if (position == 1)
            return "Info";
        if(position == 2)
            return "Settings";
        return null;
    }

}
