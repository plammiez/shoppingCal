package com.example.waraporn.shoppingcal;

import android.support.annotation.IntegerRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class CompActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comp);

        final EditText price1 = (EditText) findViewById(R.id.ed_price1);
        final EditText qty1 = (EditText) findViewById(R.id.ed_qty1);
        final EditText price2 = (EditText) findViewById(R.id.ed_price2);
        final EditText qty2 = (EditText) findViewById(R.id.ed_qty2);

        final TextView avg1 = (TextView) findViewById(R.id.cal_avg);
        final TextView saving1 = (TextView) findViewById(R.id.saving);
        final TextView avg2 = (TextView) findViewById(R.id.cal_avg2);
        final TextView saving2 = (TextView) findViewById(R.id.saving2);

        Button bt_comp = (Button) findViewById(R.id.comp);

        bt_comp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double p1 = Double.parseDouble(price1.getText().toString());
                int q1 = Integer.parseInt(qty1.getText().toString());
                double p2 = Double.parseDouble(price2.getText().toString());
                int q2 = Integer.parseInt(qty2.getText().toString());

                double _avg1 = p1/q1;
                double _avg2 = p2/q2;

                avg1.setText(String.valueOf(_avg1));
                avg2.setText(String.valueOf(_avg2));

                if (_avg1 > _avg2) {
                    saving1.setText("");
                    saving2.setText(String.valueOf(_avg1 - _avg2));
                }

                if (_avg1 == _avg2) {
                    //Snackbar
                }

                if (_avg2 > _avg1) {
                    saving1.setText(String.valueOf(_avg2 - _avg1));
                    saving2.setText("");
                }
            }
        });
    }
}
