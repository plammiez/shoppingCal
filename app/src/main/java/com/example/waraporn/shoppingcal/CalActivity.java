package com.example.waraporn.shoppingcal;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.widget.Button;
import android.widget.Switch;
import android.widget.TextView;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CalActivity extends AppCompatActivity {

    private Double valueOne = 0.0;
    private Double valueTwo = 0.0;
    private String operand = "";
    final private static String OPT_PLUS = "+";
    final private static String OPT_DEL = "-";
    final private static String OPT_MUL = "*";
    final private static String OPT_DIV = "/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cal);
        getIntent();

        Button bt1 = (Button) findViewById(R.id.bt1);
        Button bt2 = (Button) findViewById(R.id.bt2);
        Button bt3 = (Button) findViewById(R.id.bt3);
        Button bt4 = (Button) findViewById(R.id.bt4);
        Button bt5 = (Button) findViewById(R.id.bt5);
        Button bt6 = (Button) findViewById(R.id.bt6);
        Button bt7 = (Button) findViewById(R.id.bt7);
        Button bt8 = (Button) findViewById(R.id.bt8);
        Button bt9 = (Button) findViewById(R.id.bt9);
        Button bt0 = (Button) findViewById(R.id.bt0);

        Button bt_dot = (Button) findViewById(R.id.bt_dot);
        Button bt_ac = (Button) findViewById(R.id.bt_ac);
        Button bt_plus = (Button) findViewById(R.id.bt_plus);
        Button bt_del = (Button) findViewById(R.id.bt_del);
        Button bt_mul = (Button) findViewById(R.id.bt_mul);
        Button bt_div = (Button) findViewById(R.id.bt_div);
        Button bt_back = (Button) findViewById(R.id.bt_back);
        Button bt_eq = (Button) findViewById(R.id.bt_eq);

        Button bt_disc = (Button) findViewById(R.id.bt_disc);
        Button bt_tax = (Button) findViewById(R.id.bt_tax);

        final TextView textView = (TextView) findViewById(R.id.cal_textview);
        TextView tv1 = (TextView) findViewById(R.id.tv_1);
        TextView tv2 = (TextView) findViewById(R.id.tv_2);
        TextView tv3 = (TextView) findViewById(R.id.tv_3);
        TextView tv4 = (TextView) findViewById(R.id.tv_4);
        TextView tv5 = (TextView) findViewById(R.id.tv_5);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("1");
            }
        });

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("2");
            }
        });

        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("3");
            }
        });

        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("4");
            }
        });

        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("5");
            }
        });

        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("6");
            }
        });

        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("7");
            }
        });

        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("8");
            }
        });

        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.append("9");
            }
        });

        bt0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().trim().equals("")) {
                    textView.append("0");
                }
            }
        });

        bt_dot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().contains(".")) {
                    textView.append(".");
                }else {
                    return;
                }
            }
        });

        bt_ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("");
            }
        });

        bt_plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().trim().equals("") &&
                        !textView.getText().toString().endsWith("+") &&
                        !textView.getText().toString().endsWith("-") &&
                        !textView.getText().toString().endsWith("x") &&
                        !textView.getText().toString().endsWith("%")) {

                    valueOne = Double.valueOf(textView.getText().toString());
                    operand = OPT_PLUS;
                    textView.setText("");
                }
            }
        });

        bt_del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().trim().equals("") &&
                        !textView.getText().toString().endsWith("+") &&
                        !textView.getText().toString().endsWith("-") &&
                        !textView.getText().toString().endsWith("x") &&
                        !textView.getText().toString().endsWith("%")) {

                    valueOne = Double.valueOf(textView.getText().toString());
                    operand = OPT_DEL;
                    textView.setText("");
                }
            }
        });

        bt_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().trim().equals("") &&
                        !textView.getText().toString().endsWith("+") &&
                        !textView.getText().toString().endsWith("-") &&
                        !textView.getText().toString().endsWith("x") &&
                        !textView.getText().toString().endsWith("%")) {

                    valueOne = Double.valueOf(textView.getText().toString());
                    operand = OPT_MUL;
                    textView.setText("");
                }
            }
        });

        bt_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!textView.getText().toString().trim().equals("") &&
                        !textView.getText().toString().endsWith("+") &&
                        !textView.getText().toString().endsWith("-") &&
                        !textView.getText().toString().endsWith("x") &&
                        !textView.getText().toString().endsWith("%")) {

                    valueOne = Double.valueOf(textView.getText().toString());
                    operand = OPT_DIV;
                    textView.setText("");
                }
            }
        });

        bt_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int  len = textView.getText().toString().length()-1;
                String result = "";
                if (textView.getText().toString().length() == 1) {
                    textView.setText("");
                }
                for (int i=0; i<len; i++) {
                    result = result.concat(String.valueOf(textView.getText().toString().charAt(i)));
                    if (i == len-1) {
                        textView.setText("" + result);
                    }
                }
            }
        });

        bt_eq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (valueOne != null) {
                    switch (operand) {
                        case OPT_PLUS : valueTwo = valueOne + Double.valueOf(textView.getText().toString()); break;
                        case OPT_DEL : valueTwo = valueOne - Double.valueOf(textView.getText().toString()); break;
                        case OPT_MUL : valueTwo = valueOne * Double.valueOf(textView.getText().toString()); break;
                        case OPT_DIV : valueTwo = valueOne / Double.valueOf(textView.getText().toString()); break;
                        default: break;
                    }
                }
                textView.setText(String.valueOf(valueTwo));
            }
        });

        bt_disc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog alertDialog = new AlertDialog.Builder(CalActivity.this).create(); //Read Update
                alertDialog.setContentView(R.layout.dialog_discount);
                alertDialog.show();
            }
            
        });
    }
}
