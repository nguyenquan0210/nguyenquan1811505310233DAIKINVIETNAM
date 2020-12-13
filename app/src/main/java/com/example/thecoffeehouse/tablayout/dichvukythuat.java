package com.example.thecoffeehouse.tablayout;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.thecoffeehouse.R;
import com.example.thecoffeehouse.model_adapter.DoUong;
import com.example.thecoffeehouse.model_adapter.SanPhamAdapter;





public class  dichvukythuat  extends Fragment {

    private GridView gvmon_233;
    private SanPhamAdapter spadt_233;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View r_233 = inflater.inflate(R.layout.dvkythuat, container, false);

        return r_233;
    }


}