package com.example.thecoffeehouse.model_adapter;

import android.widget.ImageView;

import java.io.Serializable;

public class DoUong implements Serializable {
    private int hinh_233;
    private String ten;


    public int getHinh() {
        return hinh_233;
    }

    public ImageView setHinh(int hinh_233) {
        this.hinh_233 = hinh_233;
        return null;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten_233) {
        this.ten = ten_233;
    }



    public DoUong(int hinh_233, String ten_233) {
        this.hinh_233 = hinh_233;
        this.ten = ten_233;

    }

    public DoUong() {
    }
}
