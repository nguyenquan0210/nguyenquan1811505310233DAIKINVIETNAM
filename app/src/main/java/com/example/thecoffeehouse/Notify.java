package com.example.thecoffeehouse;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;


public class Notify extends AppCompatActivity {

    ImageView imgClose_233, img_233;
    Button bt_233;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notify_action);

        imgClose_233 = findViewById(R.id.imageClose);
        imgClose_233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        bt_233 = findViewById(R.id.button);
        bt_233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                open();
            }
        });

        img_233 = findViewById(R.id.image);
        img_233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDialog();
            }
        });
    }

    void open() {
        Intent view_233 = new Intent(Notify.this, MainActivity.class);
        startActivity(view_233);
    }

    public void openDialog() {
        ExampleDialog exampleDialog_233 = new ExampleDialog();
        exampleDialog_233.show(getSupportFragmentManager(), "example dialog");
    }
}
