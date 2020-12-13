package com.example.thecoffeehouse.bottomNavigation;

import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.MenuItemCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;
import com.example.thecoffeehouse.tablayout.ViewPagerAdapter;
import com.example.thecoffeehouse.tablayout.viewDathang;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;

public class dathang1 extends Fragment {

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
        View r_233 = inflater.inflate(R.layout.fragment_navigation_dathang, container, false);
        mTabLayout_233 = r_233.findViewById(R.id.tab_layout);
        mViewPager_233 = r_233.findViewById(R.id.view_pager);

        viewDathang viewPagerAdapter = new viewDathang(getFragmentManager(), FragmentStatePagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        mViewPager_233.setAdapter(viewPagerAdapter);
        mTabLayout_233.setupWithViewPager(mViewPager_233);
        return r_233;
    }

}