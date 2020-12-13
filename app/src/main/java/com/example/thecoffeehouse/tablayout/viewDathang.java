package com.example.thecoffeehouse.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class viewDathang extends FragmentStatePagerAdapter {

    public viewDathang(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new dichvukythuat();

            case 1:
                return new dichvukythuat();

            default:
                return new dichvukythuat();
        }
    }

    @Override
    public int getCount() {
        return 2;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {
            case 0:
                title = "Dịch vụ kỹ thuật";
                break;

            case 1:
                title  = "Phụ kiện";
                break;
        }

        return title;
    }
}
