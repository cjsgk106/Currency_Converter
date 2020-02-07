package com.example.andorid.currency_converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void clickFunction(View view) {
        EditText myEditField = (EditText)findViewById(R.id.myEditField);
        try {
            Double num = Double.valueOf(myEditField.getText().toString());

            goToActivity2(num);
        } catch(NumberFormatException e) {
            Toast.makeText(MainActivity.this, "This is not a number. Try again!", Toast.LENGTH_LONG).show();
        }
    }

    public void goToActivity2(Double n) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("dollar", n);

        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
