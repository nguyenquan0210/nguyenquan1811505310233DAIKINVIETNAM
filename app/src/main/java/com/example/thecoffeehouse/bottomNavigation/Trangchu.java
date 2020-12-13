package com.example.thecoffeehouse.bottomNavigation;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.example.thecoffeehouse.Information;
import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.tablayout.ViewPagerAdapter;

public class Trangchu extends Fragment implements View.OnClickListener {

    ImageView img1_233, img2_233;
    RelativeLayout rl1_233, rl2_233, rl3_233,dichvu_233;

    @Override
    public View onCreateView(final LayoutInflater inflater, final ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View root = inflater.inflate(R.layout.fragment_navigation_trangchu, container, false);


//        img1_233 = root.findViewById(R.id.imageNotify);
//        img1_233.setOnClickListener(this);
//        img2_233 = root.findViewById(R.id.imageAdd);
//        img2_233.setOnClickListener(this);
//        img.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                open();
//            }
//        });

        rl1_233 = root.findViewById(R.id.relativeTichdiem);
        rl2_233 = root.findViewById(R.id.relativeDathang);
        rl3_233 = root.findViewById(R.id.relative_e_shop);
        rl1_233.setOnClickListener(this);
        rl2_233.setOnClickListener(this);
        rl3_233.setOnClickListener(this);
        dichvu_233 = root.findViewById(R.id.dichvu);
        dichvu_233.setOnClickListener(this);




//
//        rl2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//               inflater.inflate(R.layout.fragment_navigation_dathang,container,false);
//
//            }
//        });
//
//        rl3.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onClick(v);
//            }
//        });

        return root;
    }

//    public void open() {
//        Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
//        startActivity(dsp);
//    }

    @Override
    public void onClick(View v) {
//        if (v.getId() == R.id.imageNotify) {
//            Intent dsp = new Intent(Tintuc.this.getActivity(), Notify.class);
//            startActivity(dsp);
//        }
//        if (v.getId() == R.id.imageAdd) {
//            Intent dsp = new Intent(Tintuc.this.getActivity(), Information.class);
//            startActivity(dsp);
//        }
        if (v.getId() == R.id.relativeTichdiem) {
            Toast.makeText(this.getActivity(), "Tích điểm", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relativeDathang) {
            Toast.makeText(this.getActivity(), "Đặt hàng ", Toast.LENGTH_SHORT).show();
        }

        if (v.getId() == R.id.relative_e_shop) {
            Toast.makeText(this.getActivity(), "E-Shop", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relative_phukien) {
            Toast.makeText(this.getActivity(), "Phụ kiện", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.relative_zalo) {
            Toast.makeText(this.getActivity(), "Zalo Us", Toast.LENGTH_SHORT).show();
        }
        if (v.getId() == R.id.dichvu) {
            Intent dsp = new Intent(Trangchu.this.getActivity(), Dathang.class);
            startActivity(dsp);
        }

    }


}