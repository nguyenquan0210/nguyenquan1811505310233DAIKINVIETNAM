package com.example.thecoffeehouse.tablayout;

import android.app.Dialog;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;

public class ThucUongFragment extends Fragment {

    private GridView gvmon_233;
    private SanPhamAdapter spadt_233;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r_233 = inflater.inflate(R.layout.fragment_pho_bien, container, false);
        gvmon_233 = r_233.findViewById(R.id.gv_mon);
        spadt_233 = new SanPhamAdapter(ThucUongFragment.this.getActivity(), R.layout.item);
        gvmon_233.setAdapter(spadt_233);
        registerForContextMenu(gvmon_233);
        fakeData();

        return r_233;
    }
    private void fakeData() {
        spadt_233.add(new DoUong(R.drawable.tb1, "Máy điều hòa treo tường"));
        spadt_233.add(new DoUong(R.drawable.tb2, "Máy điều hào Sky Airs"));
        spadt_233.add(new DoUong(R.drawable.tb3, "Máy điều hào VRV"));
        spadt_233.add(new DoUong(R.drawable.tb4, "Máy điều hòa Packaged"));
        spadt_233.add(new DoUong(R.drawable.tb5, "Mày điều hòa Multi"));
        spadt_233.add(new DoUong(R.drawable.tb6, "Máy lọc không khí"));
        spadt_233.add(new DoUong(R.drawable.tb1, "Máy điều hòa treo tường"));
        spadt_233.add(new DoUong(R.drawable.tb2, "Máy điều hào Sky Airs"));

    }


}