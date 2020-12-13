package com.example.thecoffeehouse.tablayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;



public class view_thongbao extends FragmentStatePagerAdapter {

    public view_thongbao(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
            return new dichvukythuat();

            case 1:
                return new thongbao_list();

            default:
                return new dichvukythuat();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        String title = "";
        switch (position) {

                case 0:
                    title = "Công việc";
                    break;

                case 1:
                    title  = "Tin tức";
                    break;
            }
        return title;
    }

}
