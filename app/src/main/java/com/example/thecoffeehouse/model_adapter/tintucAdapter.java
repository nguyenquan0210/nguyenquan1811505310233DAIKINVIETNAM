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


public class tintucAdapter extends ArrayAdapter<tintuc> {
    Activity context_233;
    int resource_233;

    public tintucAdapter(@NonNull Activity context, int resource) {
        super(context, resource);
        this.context_233 = context;
        this.resource_233 = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = this.context_233.getLayoutInflater();
        View customView = inflater.inflate(this.resource_233, null);

        TextView txtten = customView.findViewById(R.id.txtten);
        TextView txtten1 = customView.findViewById(R.id.txtten1);

        tintuc sp = getItem(position);
        txtten1.setText(sp.getTen1());
        txtten.setText(sp.getTen());


        return customView;


    }
}