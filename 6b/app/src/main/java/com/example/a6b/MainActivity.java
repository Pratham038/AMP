package com.example.a6b;

import androidx.appcompat.app.AppCompatActivity;
import android.app.*;
import android.widget.*;
import android.os.Bundle;
import android.view.*;
import android.content.*;

public class MainActivity extends AppCompatActivity {
    CharSequence[] items={"Android","Security","Cloud"};
    boolean[] itemsChecked=new boolean[items.length];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDialog(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("This is a dialog with a simple Text");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getBaseContext(), "OK CLicked", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int id) {
                Toast.makeText(getBaseContext(), "Cancel CLicked", Toast.LENGTH_SHORT).show();
            }
        });
        builder.setMultiChoiceItems(items, itemsChecked, new
                DialogInterface.OnMultiChoiceClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int id, boolean isChecked) {
                        Toast.makeText(getBaseContext(), items[id] + (isChecked ? "checked!" : "unchecked!"),
                                Toast.LENGTH_SHORT).show();
                    }
                });
        AlertDialog dialog = builder.create();
        builder.show();
    }
    }