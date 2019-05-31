package com.example.finalproject;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button plus, min, multiply, div;
    private EditText tvNum1, tvNum2;
    private TextView resultTv;

    float numb1, numb2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plus = findViewById(R.id.btn_plus);
        min = findViewById(R.id.btn_min);
        multiply = findViewById(R.id.btn_mult);
        div = findViewById(R.id.btn_div);

        tvNum1 = findViewById(R.id.val1);
        tvNum2 = findViewById(R.id.val2);
        resultTv = findViewById(R.id.tv_result);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numb1 = Float.parseFloat(tvNum1.getText().toString());
                numb2 = Float.parseFloat(tvNum2.getText().toString());
                result = numb1 + numb2;
                resultTv.setText(""+result);

                tvNum1.setText("");
                tvNum2.setText("");
            }
        });

        min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numb1 = Float.parseFloat(tvNum1.getText().toString());
                numb2 = Float.parseFloat(tvNum2.getText().toString());
                result = numb1 - numb2;
                resultTv.setText(""+result);

                tvNum1.setText("");
                tvNum2.setText("");
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numb1 = Float.parseFloat(tvNum1.getText().toString());
                numb2 = Float.parseFloat(tvNum2.getText().toString());
                result = numb1 * numb2;
                resultTv.setText(""+result);

                tvNum1.setText("");
                tvNum2.setText("");
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                numb1 = Float.parseFloat(tvNum1.getText().toString());
                numb2 = Float.parseFloat(tvNum2.getText().toString());
                result = numb1 / numb2;
                resultTv.setText(""+result);

                tvNum1.setText("");
                tvNum2.setText("");
            }
        });
    }
}