package com.example.thecoffeehouse.model_adapter;

import android.widget.ImageView;

import java.io.Serializable;




public class tintuc implements Serializable {

    private String ten_233;
    private String ten1_233;




    public String getTen() {
        return ten_233;
    }

    public void setTen(String ten_233) {
        this.ten_233 = ten_233;
    }

    public String getTen1() {
        return ten1_233;
    }

    public void setTen1(String ten1_233) {
        this.ten1_233 = ten1_233;
    }

    public tintuc(String ten_233, String ten1_233) {

        this.ten_233 = ten_233;

        this.ten1_233 = ten1_233;

    }

    public tintuc() {
    }
}
