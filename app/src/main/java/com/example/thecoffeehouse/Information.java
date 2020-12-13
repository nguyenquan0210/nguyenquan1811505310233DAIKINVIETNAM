package com.example.thecoffeehouse;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Information extends AppCompatActivity{

    Button bt_233;

    protected void onCreate(Bundle savedInstanceState_233) {
        super.onCreate(savedInstanceState_233);
        setContentView(R.layout.information);

        bt_233 = findViewById(R.id.button_close);
        bt_233.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v_233) {
                finish();
            }
        });
    }


}
