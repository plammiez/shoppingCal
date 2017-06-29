package com.example.waraporn.shoppingcal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        getIntent();

        Button bt_cal = (Button) findViewById(R.id.bt_cal);
        Button bt_comp = (Button) findViewById(R.id.bt_comp);
        Button bt_list = (Button) findViewById(R.id.bt_list);
        Button bt_shop = (Button) findViewById(R.id.bt_shop);

        bt_cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, CalActivity.class);
                startActivity(intent);
            }
        });

        bt_comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MenuActivity.this, CompActivity.class);
                startActivity(intent);
            }
        });

        bt_list.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        bt_shop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
