package com.example.a3a;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
String tag = "Pratham Haram";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d(tag,"In onCreate() ");
    }
    public void onStart(){
        super.onStart();
        Log.d(tag,"In onStart() ");
    }
    public void onRestart(){
        super.onRestart();
        Log.d(tag,"In onRtart() ");
    }
    public void onPause(){
        super.onPause();
        Log.d(tag,"In onPtart() ");
    }
    public void onStop(){
        super.onStop();
        Log.d(tag,"In onStart() ");
    }
    public void onDestroy(){
        super.onDestroy();
        Log.d(tag,"In onStart() ");
    }

}