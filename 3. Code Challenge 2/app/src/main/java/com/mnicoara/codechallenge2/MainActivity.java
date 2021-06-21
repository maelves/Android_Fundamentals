package com.mnicoara.codechallenge2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.layout_scroll_relative);
        //setContentView(R.layout.layout_frame);
        setContentView(R.layout.layout_spinner);

        Spinner spinner = findViewById(R.id.spinner);

        List<String> dataSource = getSource();

        ArrayAdapter<String> arrayAdapter = getAdapter(dataSource);

        spinner.setAdapter(arrayAdapter);

        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                Log.d("MainActivity", "onItemSelected: " + dataSource.get(position));
                Toast.makeText(MainActivity.this, getString(R.string.spinner_selected, dataSource.get(position)), Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
                Log.d("MainActivity", "onNothingSelected");

            }
        });
    }

    private List<String> getSource() {
        List<String> cakes = new ArrayList<String>();

        cakes.add("Cupcake");
        cakes.add("Donut");
        cakes.add("Eclair");
        cakes.add("KitKat");
        cakes.add("Pie");

        return cakes;
    }

    private ArrayAdapter<String> getAdapter(List<String> dataSource) {
        return new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, dataSource);
    }

}
