package com.example.andorid.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Main2Activity extends AppCompatActivity {

    TextView textView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView2 =(TextView) findViewById(R.id.textView2);
        Intent intent = getIntent();
        Double num = intent.getDoubleExtra("dollar", 0);
        textView2.setText("£" + Double.toString(num * 0.77));

    }
}
