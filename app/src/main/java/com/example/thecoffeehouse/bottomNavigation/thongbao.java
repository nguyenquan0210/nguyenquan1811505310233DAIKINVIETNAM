package com.example.thecoffeehouse.bottomNavigation;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import com.example.thecoffeehouse.R;

import com.example.thecoffeehouse.tablayout.view_thongbao;
import com.google.android.material.tabs.TabLayout;



public class thongbao  extends Fragment {

    private TabLayout mTabLayout_233;
    private ViewPager mViewPager_233;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r_233 = inflater.inflate(R.layout.fragment_navigation_thongbao, container, false);
        mTabLayout_233 = r_233.findViewById(R.id.tab_layout);
        mViewPager_233 = r_233.findViewById(R.id.view_pager);

        view_thongbao viewPagerAdapter = new view_thongbao(getFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager_233.setAdapter(viewPagerAdapter);
        mTabLayout_233.setupWithViewPager(mViewPager_233);
        return r_233;
    }

}