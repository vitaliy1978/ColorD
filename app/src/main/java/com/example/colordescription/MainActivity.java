package com.example.colordescription;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Spinner spinner;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spinner = (Spinner) findViewById(R.id.spinner);
        textView = (TextView) findViewById(R.id.textView);
    }

    public void onClick(View view){
        int n = spinner.getSelectedItemPosition();
        textView.setText(getDescription(n));

    }

    public String getDescription(int n){
        String[] descriptions = getResources().getStringArray(R.array.descriptions);
        return descriptions[n];
    }
}

//коммент
