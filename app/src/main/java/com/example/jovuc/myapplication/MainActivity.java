package com.example.jovuc.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public class SetSettings extends Activity{
        public void moveToSettingsActivity(View view){
            Intent intent = new Intent(this, SetingsActivity.class);
            startActivity(intent);
        }
    }

    public void onActivityResult(){

    }

    public void onButtonSettingsClick(View view) {
        startActivityForResult(new Intent(this, SetingsActivity.class),0);
    }

}
