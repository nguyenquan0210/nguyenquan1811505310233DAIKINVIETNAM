package com.example.thecoffeehouse.model_adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.thecoffeehouse.R;

public class SanPhamAdapter extends ArrayAdapter<DoUong> {
    Activity context_233;
    int resource_233;

    public SanPhamAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context_233 = context;
        this.resource_233 = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context_233.getLayoutInflater();
        View customView = inflater.inflate(this.resource_233, null);
        ImageView imghinh = customView.findViewById(R.id.imghinh);
        TextView txtten = customView.findViewById(R.id.txtten);


        DoUong sp = getItem(position);
        imghinh.setImageResource(sp.getHinh());
        txtten.setText(sp.getTen());


        return customView;


    }


}