package com.example.a6amenu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater mi = getMenuInflater();
        mi.inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.newb:
                Toast.makeText(this,"File Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.opn:
                Toast.makeText(this,"Open Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this,"Save Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.saveas:
                Toast.makeText(this,"Save As Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.delete:
                Toast.makeText(this,"Delete Selected",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.Exit: Toast.makeText(this,"Exit Selected",Toast.LENGTH_SHORT).show();
                return true;
            default:
                Toast.makeText(this,"Default",Toast.LENGTH_SHORT).show();
                return super.onOptionsItemSelected(item);
        }
    }
}