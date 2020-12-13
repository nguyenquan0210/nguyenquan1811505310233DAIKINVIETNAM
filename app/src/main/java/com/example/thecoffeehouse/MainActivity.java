package com.example.thecoffeehouse;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.thecoffeehouse.bottomNavigation.Dathang;
import com.example.thecoffeehouse.bottomNavigation.Taikhoan;
import com.example.thecoffeehouse.bottomNavigation.Trangchu;
import com.example.thecoffeehouse.bottomNavigation.dathang1;
import com.example.thecoffeehouse.bottomNavigation.thongbao;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private ActionBar toolbar_233;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toolbar_233 = getSupportActionBar();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener_233);

        // load the store fragment by default
        loadFragment(new Trangchu());

    }

     private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener_233
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.nav_home:
                    fragment = new Trangchu();
                    loadFragment(fragment);
                    return true;
                case R.id.nav_donhang:
                    fragment = new dathang1();
                    loadFragment(fragment);
                    return true;
                case R.id.nav_thietbi:
                    fragment = new Dathang();
                    loadFragment(fragment);
                    return true;
                case R.id.nav_thongbao:
                    fragment = new thongbao();
                    loadFragment(fragment);
                    return true;
                case R.id.nav_taikhoan:
                    fragment = new Taikhoan();
                    loadFragment(fragment);
                    return true;
            }

            return false;
        }
    };
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
}
