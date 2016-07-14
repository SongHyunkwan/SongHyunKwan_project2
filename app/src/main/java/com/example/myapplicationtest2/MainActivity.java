package com.example.myapplicationtest2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView count;
    TextView price;
    int a = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        count = (TextView) findViewById(R.id.countNum);
        price = (TextView) findViewById(R.id.priceNum);

        Button pulsBt = (Button)findViewById(R.id.upBt);
        pulsBt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                a++;
                count.setText(""+a+"set");
                price.setText(""+35*a+"$");
            }
        });

        Button down = (Button)findViewById(R.id.downBt);
        down.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (a > 1) {
                    a--;
                }
                count.setText(""+a+"set");
                price.setText(""+35*a+"$");
            }
        });
    }
}
