package com.example.androidfundamentals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.provider.SyncStateContract;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "Logging Example";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e(TAG,"I shouldn't be here");
    }
}