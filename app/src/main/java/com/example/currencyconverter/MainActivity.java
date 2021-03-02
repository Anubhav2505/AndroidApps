package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void Convert(View view){
        EditText NumberEditText = (EditText) findViewById(R.id.NumberEditText);
        Double dollar =Double.parseDouble(NumberEditText.getText().toString());
        Double pound = dollar*0.75;
        Toast.makeText(this, "$" + pound.toString(), Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}